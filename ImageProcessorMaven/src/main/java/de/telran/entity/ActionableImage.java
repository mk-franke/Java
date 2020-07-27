package de.telran.entity;

import java.awt.image.BufferedImage;

public class ActionableImage {

    private BufferedImage image;
    private boolean status;
    private String sourceUrl;
    private String actionName;

    public ActionableImage(BufferedImage image, boolean status, String sourceUrl, String actionName) {
        this.image = image;
        this.status = status;
        this.sourceUrl = sourceUrl;
        this.actionName = actionName;
    }

    public BufferedImage getImage() {
        return image;
    }

    public boolean getStatus() {
        return status;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public String getActionName() {
        return actionName;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return "ActionableImage{" +
                "image=" + image +
                ", status=" + status +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", actionName='" + actionName + '\'' +
                '}';
    }

}
