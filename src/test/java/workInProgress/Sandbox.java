package workInProgress;

import base.BaseConfig;
import helper.ConfigFileReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbTestingPage;
import pages.BasicAuthPage;
import pages.HomePage;

import java.awt.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Sandbox extends BaseConfig {

    private ConfigFileReader configFileReader = new ConfigFileReader();
    WebDriver driver;

    @Test
    public void sandboxTests() {
        String basicAuthUsername = "admin";
        String basicAuthPassword = "admin";
        BasicAuthPage basicAuthPage = homePage.openBasicAuthPage();
        basicAuthPage.fillCredentials(basicAuthUsername, basicAuthPassword);
        String actualTitleText = basicAuthPage.checkTitleIsVisible();
        String expectedTitleText = "Basic Auth";
        assertEquals(expectedTitleText, actualTitleText);


    }
}
