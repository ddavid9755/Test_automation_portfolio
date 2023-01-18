package abTesting;

import base.BaseConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.AbTestingPage;

import static org.testng.Assert.assertEquals;

public class AbTestingTests extends BaseConfig {
    public static final Logger log = LogManager.getLogger();


    @Test
    public void testAbTestingPage(){
        log.info("Execute testAbTestingPage test.");
        AbTestingPage abTestingPage = homePage.openAbTestingPage();
        String actualText = abTestingPage.getAbTestingPageText();
        String expectedText = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
        assertEquals(actualText, expectedText);
    }


}
