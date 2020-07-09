package de.telran.action;

import java.awt.image.BufferedImage;

public class GrayscaleImageAction implements ImageAction {

    @Override
    public String getName() {
        return "GRAYSCALE";
    }

    @Override
    public BufferedImage doAction(BufferedImage source) {
        System.out.println("Grayscaling an image");
        return source;
    }

}
