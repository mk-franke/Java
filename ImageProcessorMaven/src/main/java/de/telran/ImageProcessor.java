package de.telran;

import de.telran.entity.ActionableImage;
import de.telran.entity.ImageDescriptor;
import de.telran.factory.ImageActionFactory;
import de.telran.service.*;

import java.util.List;
import java.util.stream.Collectors;

public class ImageProcessor {

    private ImageDescriptorService imageDescriptorService;
    private DownloadService downloadService;
    private ImageService imageService;
    private FileService fileService;
    private SaveFileService saveFileService;

    public ImageProcessor(ImageDescriptorService imageDescriptorService, DownloadService downloadService, ImageService imageService, FileService fileService, SaveFileService saveFileService) {
        this.imageDescriptorService = imageDescriptorService;
        this.downloadService = downloadService;
        this.imageService = imageService;
        this.fileService = fileService;
        this.saveFileService = saveFileService;
    }

    public void doProcessing(String fileName) {
        List<ImageDescriptor> imageDescriptors = imageDescriptorService.getImageDescriptors(fileName);

        List<ActionableImage> actionableImages = imageDescriptors.stream()
                .map(i -> new ActionableImage(null, false, i.getImageUrlName(), i.getActionName()))
                .collect(Collectors.toList());

        List<ActionableImage> downloadedImages = downloadService.downloadImages(actionableImages);

        List<ActionableImage> successfullyDownloadedImages = downloadedImages.stream()
                .filter(ActionableImage::getStatus)
                .collect(Collectors.toList());

        List<ActionableImage> processedImages = successfullyDownloadedImages.stream()
                .map(i -> imageService.processImage(i))
                .collect(Collectors.toList());

        processedImages.forEach(i -> saveFileService.saveImageAsFile(i));
    }

    public static void main(String[] args) throws Exception {
        String fileName = args[0];

        FileService fileService = new FileService();
        SaveFileService saveFileService = new SaveFileService(new ConfigService());
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService, new ConfigService());
        DownloadService downloadService = new DownloadService();
        ImageService imageService = new ImageService(new ImageActionFactory(new ActionConfigService()));

        ImageProcessor processor = new ImageProcessor(imageDescriptorService, downloadService, imageService, fileService, saveFileService);

        processor.doProcessing(fileName);
    }

}
