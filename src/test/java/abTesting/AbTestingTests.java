package abTesting;

import base.BaseConfig;
import org.testng.annotations.Test;
import pages.AbTestingPage;
import static org.testng.Assert.assertEquals;

public class AbTestingTests extends BaseConfig {

    @Test
    public void testAbTestingPage(){
        log.info("Execute testAbTestingPage test.");
        AbTestingPage abTestingPage = homePage.openAbTestingPage();
        log.info("Open ABTesting page.");
        String actualText = abTestingPage.getAbTestingPageText();
        log.info("Check title of page");
        String expectedText = configFileReader.getABTestingPageExpectedTitle();
        assertEquals(actualText, expectedText);
    }
}
