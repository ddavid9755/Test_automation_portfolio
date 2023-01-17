package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class AbTestingPage {
    private WebDriver driver;
    private By abTestingPageText = By.cssSelector(".example>p");

    public AbTestingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAbTestingPageText() {
        return driver.findElement(abTestingPageText).getText();
    }





}
