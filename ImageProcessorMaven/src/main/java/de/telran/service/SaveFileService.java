package de.telran.service;

import de.telran.entity.ActionableImage;

import javax.imageio.ImageIO;
import java.io.File;

public class SaveFileService {

    private ConfigService configService;

    public SaveFileService(ConfigService configService) {
        this.configService = configService;
    }

    public void saveImageAsFile(ActionableImage image) {
        try {
            ImageIO.write(image.getImage(), "jpg", new File(configService.getPathToSavedImages() + createImageName(image)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String createImageName(ActionableImage image) {
        return image.getSourceUrl().replaceAll("https://", "").replaceAll("http://", "").replaceAll("/", ".");
    }

}
