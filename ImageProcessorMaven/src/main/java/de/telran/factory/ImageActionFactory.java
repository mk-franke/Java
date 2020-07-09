package de.telran.factory;

import de.telran.action.*;
import de.telran.service.ActionConfigService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageActionFactory {

    private ActionConfigService actionConfigService;

    private Map<String, ImageAction> imageActionMap = new HashMap<>();

    public ImageActionFactory(ActionConfigService actionConfigService) throws Exception {
        this.actionConfigService = actionConfigService;

        List<String> actionClassNames = actionConfigService.getActionClassNames();
        String packageName = actionConfigService.getActionPackage();
        for (String className:actionClassNames) {
            ImageAction imageAction = (ImageAction) Class.forName(packageName + "." + className).getConstructor().newInstance();
            imageActionMap.put(imageAction.getName(), imageAction);
        }
    }

    public ImageAction getImageAction(String actionName) {
        ImageAction imageAction = imageActionMap.get(actionName);
        if(imageAction == null) {
            return new DefaultImageAction();
        } else {
            return imageAction;
        }
    }

}
