package abTesting;

import base.BaseConfig;
import com.sun.security.auth.login.ConfigFile;
import helper.ConfigFileReader;
import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AbTestingPage;

import java.io.ObjectInputFilter;

import static org.testng.Assert.assertEquals;

public class AbTestingTests extends BaseConfig {
    @Test
    public void testAbTestingPage(){
        AbTestingPage abTestingPage = homePage.openAbTestingPage();
        String actualText = abTestingPage.getAbTestingPageText();
        String expectedText = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        assertEquals(actualText, expectedText);
    }


}
