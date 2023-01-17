package workInProgress;

import base.BaseConfig;
import helper.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbTestingPage;
import pages.HomePage;

public class Sandbox extends BaseConfig {

    private ConfigFileReader configFileReader = new ConfigFileReader();

    @Test
    public void testAbTestingPage(){
        //AbTestingPage abTestingPage = homePage.openAbTestingPage();
        //String actualText = abTestingPage.getAbTestingPageText();
        //Assert.assertEquals(actualText, "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).");
    }
}
