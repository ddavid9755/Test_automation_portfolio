package base;


import helper.BrowserCapabilities;
import helper.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;


import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class BaseConfig {

    private WebDriver driver;
    private ConfigFileReader configFileReader;
    protected HomePage homePage;


    @BeforeMethod
    @Parameters("browserType")
    public void setUp(String browserType) {
        configFileReader = new ConfigFileReader();

        if (browserType.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver(BrowserCapabilities.getChromeOptions());
        }
        else if (browserType.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver(BrowserCapabilities.getFirefoxOptions());
        }
        else if (browserType.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver(BrowserCapabilities.getEdgeOptions());
        }
        driver.get(configFileReader.getApplicationUrl());
        homePage = new HomePage(driver);
        String actualTitle = homePage.checkTitle();
        assertEquals(actualTitle, "Welcome to the-internet");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
