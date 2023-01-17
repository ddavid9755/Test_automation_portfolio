package pages;

import com.gargoylesoftware.htmlunit.Page;
import helper.Helper;
import helper.PageEnums;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By homePageTitle = By.className("heading");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuElement(String linkText) { driver.findElement(By.linkText(linkText)).click();
    }

    public String checkTitle() {
        return driver.findElement(homePageTitle).getText();
    }

    public AbTestingPage openAbTestingPage(){
        clickMenuElement(PageEnums.PageNames.ABTESTING.name);
        return new AbTestingPage(driver);
    }

    public Helper openAbTestingHelperPage(){
        clickMenuElement(PageEnums.PageNames.ABTESTING.name);
        return new Helper(driver);
    }
    public AddRemoveElementsPage openAddRemoveElementsPage(){
        clickMenuElement(PageEnums.PageNames.ADDREMOVE.name);
        return new AddRemoveElementsPage(driver);
    }

    public Helper openAddRemoveElementsHelperPage(){
        clickMenuElement(PageEnums.PageNames.ADDREMOVE.name);
        return new Helper(driver);
    }

    public BasicAuthPage openBasicAuthPage(){
        clickMenuElement(PageEnums.PageNames.BASICAUTH.name);
        return new BasicAuthPage(driver);
    }

}
