package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    public static void loadConfig(String env) {
        try {
            FileInputStream fis = new FileInputStream(
                    ".//src//main//resources//config//" + env + ".properties"
            );
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config for environment: " + env);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
