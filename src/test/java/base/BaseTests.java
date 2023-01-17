package base;

import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class BaseTests extends BaseConfig{

    @Test
    public void checkBrokenLinksAndImages(){
        Helper helper = homePage.openAbTestingHelperPage();
        helper.checkLinks();
        helper.checkImages();
        helper = homePage.openAddRemoveElementsHelperPage();
        helper.checkLinks();
        helper.checkImages();

    }
}
