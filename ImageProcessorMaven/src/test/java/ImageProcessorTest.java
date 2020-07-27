import de.telran.ImageProcessor;
import de.telran.entity.ActionableImage;
import de.telran.entity.ImageDescriptor;
import de.telran.service.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ImageProcessorTest {

    ImageDescriptorService imageDescriptorService = mock(ImageDescriptorService.class);
    DownloadService downloadService = mock(DownloadService.class);
    ImageService imageService = mock(ImageService.class);
    FileService fileService = mock(FileService.class);
    SaveFileService saveFileService = mock(SaveFileService.class);

    ImageProcessor processor;

    @Before
    public void setUp() {
        processor = new ImageProcessor(imageDescriptorService, downloadService, imageService, fileService, saveFileService);
    }

    @Test
    public void testDoProcessing() {
        //configure mock
        List<ImageDescriptor> testImageDescriptor = createTestImageDescriptor();
        List<ActionableImage> testActionableImage = createDownloadedImage();
        when(imageDescriptorService.getImageDescriptors(any())).thenReturn(testImageDescriptor);
        when(downloadService.downloadImages(any())).thenReturn(testActionableImage);
        //execute test method
        processor.doProcessing("test.txt");
        //verify
        verify(imageDescriptorService, times(1)).getImageDescriptors("test.txt");
        verify(downloadService, times(1)).downloadImages(any()); //failing test at this point
        verify(saveFileService, times(2)).saveImageAsFile(any());
        verify(imageService, times(2)).processImage(any());
    }

    private static List<ActionableImage> createDownloadedImage() {
        return Arrays.asList(
                new ActionableImage(null, false,"http://server.com/image1.jpg", "PREVIEW"),
                new ActionableImage(null, false,"http://server.com/image2.jpg", "THUMBNAIL"));
    }

    private static List<ImageDescriptor> createTestImageDescriptor() {
        return Arrays.asList(
                new ImageDescriptor("http://server.com/image1.jpg", "PREVIEW"),
                new ImageDescriptor("http://server.com/image2.jpg", "THUMBNAIL"));
    }

}
