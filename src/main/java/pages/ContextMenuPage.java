package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage {
    private WebDriver driver;

    By contextArea = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }


}
