package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage {

    By dragAreaA = By.id("column-a");
    By dragAreaB = By.id("column-b");

    private WebDriver driver;
    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

}
