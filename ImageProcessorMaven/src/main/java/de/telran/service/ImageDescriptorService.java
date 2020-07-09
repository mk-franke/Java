package de.telran.service;

import de.telran.entity.ImageDescriptor;

import java.util.List;
import java.util.stream.Collectors;

public class ImageDescriptorService {

    private FileService fileService;
    private ConfigService configService;

    public ImageDescriptorService(FileService fileService, ConfigService configService) {
        this.fileService = fileService;
        this.configService = configService;
    }

    public List<ImageDescriptor> getImageDescriptors(String fileName) {
        return fileService.loadStringsFromFile(fileName).stream()
                .map(s -> stringToImageDescriptor(s))
                .collect(Collectors.toList());
    }

    private ImageDescriptor stringToImageDescriptor(String string) {
        String[] split = string.split(configService.getPathSeparator());
        return new ImageDescriptor(split[0], split[1]);
    }

}
