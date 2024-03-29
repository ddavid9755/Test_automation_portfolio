package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddRemoveElementsPage {
    private WebDriver driver;
    private By addElementButton = By.cssSelector("button[onclick='addElement()']");
    private By deleteButton = By.cssSelector("button[class='added-manually']:nth-child(1)");
    private By deleteButtonNumber = By.cssSelector("button[onclick='deleteElement()']");
    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElementButton(int clickCount){
        for(int i=1; i <= clickCount; i++) {
            driver.findElement(addElementButton).click();
        }
    }

    public void clickDeleteElementButton(int clickCount) {
        for (int i = 1; i <= clickCount; i++) {
            driver.findElement(deleteButton).click();
        }
    }

    public int getDeleteElementButtonsNumber(){
        int buttonNumber = driver.findElements(deleteButtonNumber).size();
        return buttonNumber;
    }



}
