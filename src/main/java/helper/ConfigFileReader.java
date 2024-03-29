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

    public String getBasicAuthUsername() {
        String basicAuthUsername = properties.getProperty("basicAuthUsername");
        if(basicAuthUsername != null) return basicAuthUsername;
        else throw new RuntimeException("BasicAuthUsername not specified in configuration.properties file");
    }

    public String getBasicAuthPassword() {
        String basicAuthPassword = properties.getProperty("basicAuthPassword");
        if(basicAuthPassword != null) return basicAuthPassword;
        else throw new RuntimeException("BasicAuthPassword not specified in configuration.properties file");
    }

    public String getAfterAuthExpectedTitle() {
        String afterAuthExpectedTitle = properties.getProperty("afterAuthExpectedTitle");
        if(afterAuthExpectedTitle != null) return afterAuthExpectedTitle;
        else throw new RuntimeException("AfterAuthExpectedTitle not specified in configuration.properties file");
    }

    public String getABTestingPageExpectedTitle() {
        String aBTestingPageExpectedTitle = properties.getProperty("aBTestingPageExpectedTitle");
        if(aBTestingPageExpectedTitle != null) return aBTestingPageExpectedTitle;
        else throw new RuntimeException("ABTestingPageExpectedTitle not specified in configuration.properties file");
    }

    public String getAfterNoAuthExpectedTitle() {
        String afterNoAuthExpectedTitle = properties.getProperty("afterNoAuthExpectedTitle");
        if(afterNoAuthExpectedTitle != null) return afterNoAuthExpectedTitle;
        else throw new RuntimeException("afterNoAuthExpectedTitle not specified in configuration.properties file");
    }

}
