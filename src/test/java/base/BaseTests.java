package base;

import helper.Helper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class BaseTests extends BaseConfig{

    @Test
    public void openBrokenImagesHelperPage(){
        log.info("Check ABTesting page links and images.");
        Helper helper = homePage.openAbTestingHelperPage();
        int actualBrokenLinksCountAbTestingPage = helper.checkLinks();
        int actualBrokenImagesCountAbTestingPage = helper.checkImages();
        driver.navigate().back();
        assertEquals(actualBrokenLinksCountAbTestingPage, 0);
        assertEquals(actualBrokenImagesCountAbTestingPage, 0);
        log.info("Check Add Remove Elements page links and images.");
        helper = homePage.openAddRemoveElementsHelperPage();
        int actualBrokenLinksCountAddRemoveElementsPage = helper.checkLinks();
        int actualBrokenImagesCountAddRemoveElementsPage = helper.checkImages();
        driver.navigate().back();
        assertEquals(actualBrokenLinksCountAddRemoveElementsPage, 0);
        assertEquals(actualBrokenImagesCountAddRemoveElementsPage, 0);
        log.info("Check Broken Images page links and images.");
        helper = homePage.openBrokenImagesHelperPage();
        log.info("Check Broken images count. Expected: 2 images are broken");
        int actualBrokenLinksCountBrokenImagesPage = helper.checkLinks();
        int actualBrokenImagesCountBrokenImagesPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountBrokenImagesPage, 0);
        assertEquals(actualBrokenImagesCountBrokenImagesPage, 2);

    }
}
