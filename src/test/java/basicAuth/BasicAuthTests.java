package basicAuth;

import base.BaseConfig;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import java.awt.*;

import static org.testng.Assert.assertEquals;

public class BasicAuthTests extends BaseConfig {

    @Test
    public void authWithValidUser(){
        log.info("Execute authWithValidUser test.");
        String basicAuthUsername = configFileReader.getBasicAuthUsername();
        String basicAuthPassword = configFileReader.getBasicAuthPassword();
        BasicAuthPage basicAuthPage = homePage.openBasicAuthPage();
        log.info("Fill valid credentials.");
        basicAuthPage.fillCredentials(basicAuthUsername, basicAuthPassword);
        String actualTitleText = basicAuthPage.checkTitleIsVisible();
        String expectedTitleText = configFileReader.getAfterAuthExpectedTitle();
        log.info("Check Page title after successful login.");
        assertEquals(actualTitleText, expectedTitleText);
    }

    @Test
    public void stopAuth() throws AWTException {
        log.info("Execute stopAuth test.");
        BasicAuthPage basicAuthPage = homePage.openBasicAuthPage();
        log.info("Abort authentication.");
        basicAuthPage.stopAuth();
        String actualContentText = basicAuthPage.checkContentAfterStopAuth();
        String expectedContentText = configFileReader.getAfterNoAuthExpectedTitle();
        log.info("Check page content after aborted authentication.");
        assertEquals(actualContentText, expectedContentText);
    }

}
