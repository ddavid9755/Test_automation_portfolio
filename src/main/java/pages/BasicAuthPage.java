package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BasicAuthPage {
    private WebDriver driver;
    private By title = By.cssSelector("h3");
    private By noAuthMsg = By.cssSelector("body");

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCredentials(String username, String password){
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
    }

    public String checkTitleIsVisible() {
        String titleText = driver.findElement(title).getText();
            return titleText;
    }

    public void stopAuth() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        driver.findElement(noAuthMsg).isDisplayed();
    }

}
