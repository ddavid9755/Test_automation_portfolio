package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
