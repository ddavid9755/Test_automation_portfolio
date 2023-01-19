package abTesting;

import base.BaseConfig;
import helper.ConfigFileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.AbTestingPage;

import static org.testng.Assert.assertEquals;

public class AbTestingTests extends BaseConfig {
    public static final Logger log = LogManager.getLogger();
    ConfigFileReader configFileReader = new ConfigFileReader();


    @Test
    public void testAbTestingPage(){
        log.info("Execute testAbTestingPage test.");
        AbTestingPage abTestingPage = homePage.openAbTestingPage();
        String actualText = abTestingPage.getAbTestingPageText();
        String expectedText = configFileReader.getABTestingPageExpectedTitle();
        assertEquals(actualText, expectedText);
    }


}
