package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {
    private WebDriver driver;

    By firstCheckbox = By.xpath("//*[@type='checkbox'][1]");
    By secondCheckbox = By.xpath("//*[@type='checkbox'][2]");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCheckbox(String element) {
        if (element.equalsIgnoreCase("First Checkbox")){
            driver.findElement(firstCheckbox).click();
            boolean isSelected1 = driver.findElement(firstCheckbox).isSelected();
            System.out.println(isSelected1);
        } else if (element.equalsIgnoreCase("Second Checkbox")){
            driver.findElement(secondCheckbox).click();
            boolean isSelected2 = driver.findElement(secondCheckbox).isSelected();
            System.out.println(isSelected2);
        }
    }


}
