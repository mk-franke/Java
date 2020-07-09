package de.telran.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ActionConfigService {

    Properties prop = new Properties();

    public ActionConfigService() {
        try (InputStream input = ConfigService.class.getClassLoader().getResourceAsStream("action.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find action.properties");
                return;
            }
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getActionPackage() {
        return (String) prop.get("action.package");
    }

    public List<String> getActionClassNames() {
        return Arrays.asList(((String) prop.get("action.names")).split(","));
    }

}
