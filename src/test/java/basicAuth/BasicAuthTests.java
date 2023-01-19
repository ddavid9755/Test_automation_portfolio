package basicAuth;

import base.BaseConfig;
import helper.ConfigFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.BasicAuthPage;

import java.awt.*;

import static org.testng.Assert.assertEquals;

public class BasicAuthTests extends BaseConfig {

    public static final Logger log = LogManager.getLogger();
    ConfigFileReader configFileReader = new ConfigFileReader();

    @Test
    public void authWithValidUser(){
        log.info("Execute authWithValidUser test.");
        String basicAuthUsername = configFileReader.getBasicAuthUsername();
        String basicAuthPassword = configFileReader.getBasicAuthPassword();
        BasicAuthPage basicAuthPage = homePage.openBasicAuthPage();
        basicAuthPage.fillCredentials(basicAuthUsername, basicAuthPassword);
        String actualTitleText = basicAuthPage.checkTitleIsVisible();
        String expectedTitleText = configFileReader.getAfterAuthExpectedTitle();
        assertEquals(expectedTitleText, actualTitleText);
    }

    @Test
    public void stopAuth() throws AWTException {
        log.info("Execute stopAuth test.");
        BasicAuthPage basicAuthPage = homePage.openBasicAuthPage();
        basicAuthPage.stopAuth();
    }

}
