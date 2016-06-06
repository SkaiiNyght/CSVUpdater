/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ag User
 */
public class Props {

    public static Properties getProperties() {
        Properties properties = new Properties();
        try {
            FileReader reader = new FileReader("./src/resources/configuration.properties");
            properties.load(reader);
        } catch (Exception ex) {
            Message.Message.displayError("Locating File", "Unable to locate the properties file.\n" + ex.getMessage());
            System.exit(0);
        }
        return properties;
    }

    public static void saveProperties(Map<String, String> columnMap) {
        Properties properties = new Properties();
        String current = "";
        try {
            for (Map.Entry<String, String> entry : columnMap.entrySet()) {
                current = entry.getKey();
                properties.setProperty(entry.getKey().replaceAll(" ", "_"), entry.getValue());
            }
        }catch(Exception ex){
            System.out.println(current);
            System.exit(0);
        }

        File f = new File("./src/resources/configuration.properties");

        try {
            properties.store(new FileOutputStream(new File("./src/resources/configuration.properties")), "Updated on " + new Date());
        } catch (Exception ex) {
            Message.Message.displayError("IO Error", "An error occurred when saving properties\n" + ex.getMessage());
        }

    }
}
