import de.telran.entity.ImageDescriptor;
import de.telran.service.ConfigService;
import de.telran.service.FileService;
import de.telran.service.ImageDescriptorService;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ImageDescriptorServiceTest {

    // mock creation
    FileService fileService = mock(FileService.class);
    ConfigService configService = mock(ConfigService.class);

    @Test
    public void testGetEmptyImageDescriptors() {
        //configure mocks
        when(fileService.loadStringsFromFile("test.txt")).thenReturn(Collections.emptyList());
        //execute testing code
        ImageDescriptorService service = new ImageDescriptorService(fileService, configService);
        List<ImageDescriptor> imageDescriptors = service.getImageDescriptors("test.txt");
        //assert results
        assertTrue(imageDescriptors.isEmpty());
        //verify
        verify(fileService, times(1)).loadStringsFromFile("test.txt");
    }

    @Test
    public void testGetImageDescriptors() {
        //configure mocks
        when(fileService.loadStringsFromFile("test.txt")).thenReturn(createTestString());
        when(configService.getPathSeparator()).thenReturn(";");
        when(configService.getPathToSavedImages()).thenReturn("/Users/marckevinfranke/Downloads/Image");
        //execute testing code
        ImageDescriptorService service = new ImageDescriptorService(fileService, configService);
        List<ImageDescriptor> imageDescriptors = service.getImageDescriptors("test.txt");
        //assert results
        assertFalse(imageDescriptors.isEmpty());
        assertEquals(2, imageDescriptors.size());
        assertEquals("http://server.com/image1.jpg", imageDescriptors.get(0).getImageUrlName());
        assertEquals("PREVIEW", imageDescriptors.get(0).getActionName());
    }

    private static List<String> createTestString() {
        return Arrays.asList("http://server.com/image1.jpg;PREVIEW", "http://server.com/image1.jpg;THUMBNAIL");
    }

}
