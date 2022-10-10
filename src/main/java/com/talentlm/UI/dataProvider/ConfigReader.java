package com.talentlm.UI.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties; // что бы могли читать что храниться в фвйле проретииис

    static {
        try {
            String path = "src/main/resources/configurations.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){


        return properties.getProperty(key).trim();
    }
}
