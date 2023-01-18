package helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "src//main//resources//configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("configuration.properties file not found at: " + propertyFilePath);
            }
        }

        public String getApplicationUrl() {
        String homePage = properties.getProperty("homePage");
        if(homePage != null) return homePage;
        else throw new RuntimeException("Url not specified in configuration.properties file");
        }

}
