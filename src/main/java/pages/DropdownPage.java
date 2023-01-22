package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {

    By elementDropdown = By.id("dropdown");
    private WebDriver driver;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
}
