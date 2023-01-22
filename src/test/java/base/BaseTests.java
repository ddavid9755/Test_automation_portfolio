package base;

import helper.Helper;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class BaseTests extends BaseConfig{

    private int expectedBrokenImagesAndLinks = 0;

    @Test
    public void openBrokenImagesHelperPage(){
        log.info("Check ABTesting page links and images.");
        Helper helper = homePage.openAbTestingHelperPage();
        int actualBrokenLinksCountAbTestingPage = helper.checkLinks();
        int actualBrokenImagesCountAbTestingPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountAbTestingPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesCountAbTestingPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Add Remove Elements page links and images.");
        helper = homePage.openAddRemoveElementsHelperPage();
        int actualBrokenLinksCountAddRemoveElementsPage = helper.checkLinks();
        int actualBrokenImagesCountAddRemoveElementsPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountAddRemoveElementsPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesCountAddRemoveElementsPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Broken Images page links and images.");
        helper = homePage.openBrokenImagesHelperPage();
        log.info("Check Broken images count. Expected: 2 images are broken");
        int actualBrokenLinksCountBrokenImagesPage = helper.checkLinks();
        int actualBrokenImagesCountBrokenImagesPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountBrokenImagesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesCountBrokenImagesPage, 2);
        driver.navigate().back();
        log.info("Check Checkboxes Page links and images.");
        helper = homePage.openCheckboxesHelperPage();
        int actualBrokenLinksCountCheckboxesPage = helper.checkLinks();
        int actualBrokenImagesCountCheckboxesPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountCheckboxesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesCountCheckboxesPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Context Menu Page links and images.");
        helper = homePage.openContextMenuHelperPage();
        int actualBrokenLinksCountContextMenuPage = helper.checkLinks();
        int actualBrokenImagesCountContextMenuPage = helper.checkImages();
        assertEquals(actualBrokenLinksCountContextMenuPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesCountContextMenuPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Drag and Drop Page links and images.");
        helper = homePage.openDragAndDropHelperPage();
        int actualBrokenLinksDragAndDropPage = helper.checkLinks();
        int actualBrokenImagesDragAndDropPage = helper.checkImages();
        assertEquals(actualBrokenLinksDragAndDropPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesDragAndDropPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Dropdown Page links and images.");
        helper = homePage.openDropdownHelperPage();
        int actualBrokenLinksDropdownPage = helper.checkLinks();
        int actualBrokenImagesDropdownPage = helper.checkImages();
        assertEquals(actualBrokenLinksDropdownPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesDropdownPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check File Download Page links and images.");
        helper = homePage.openFileDownloadHelperPage();
        int actualBrokenLinksFileDownloadPage = helper.checkLinks();
        int actualBrokenImagesFileDownloadPage = helper.checkImages();
        assertEquals(actualBrokenLinksFileDownloadPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesFileDownloadPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check File Upload Page links and images.");
        helper = homePage.openFileUploadHelperPage();
        int actualBrokenLinksFileUploadPage = helper.checkLinks();
        int actualBrokenImagesFileUploadPage = helper.checkImages();
        assertEquals(actualBrokenLinksFileUploadPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesFileUploadPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Frames Page links and images.");
        helper = homePage.openFramesHelperPage();
        int actualBrokenLinksFramesPage = helper.checkLinks();
        int actualBrokenImagesFramesPage = helper.checkImages();
        assertEquals(actualBrokenLinksFramesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesFramesPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Horizontal Slider Page links and images.");
        helper = homePage.openHorizontalSliderHelperPage();
        int actualBrokenLinksHorizontalSliderPage = helper.checkLinks();
        int actualBrokenImagesHorizontalSliderPage = helper.checkImages();
        assertEquals(actualBrokenLinksHorizontalSliderPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesHorizontalSliderPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Hovers Page links and images.");
        helper = homePage.openHoversHelperPage();
        int actualBrokenLinksHoversPage = helper.checkLinks();
        int actualBrokenImagesHoversPage = helper.checkImages();
        assertEquals(actualBrokenLinksHoversPage, 3);
        assertEquals(actualBrokenImagesHoversPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check JavascriptAlerts Page links and images.");
        helper = homePage.openJavascriptAlertsHelperPage();
        int actualBrokenLinksJavascriptAlertsPage = helper.checkLinks();
        int actualBrokenImagesJavascriptAlertsPage = helper.checkImages();
        assertEquals(actualBrokenLinksJavascriptAlertsPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesJavascriptAlertsPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Key Presses Page links and images.");
        helper = homePage.openKeyPressesHelperPage();
        int actualBrokenLinksKeyPressesPage = helper.checkLinks();
        int actualBrokenImagesKeyPressesPage = helper.checkImages();
        assertEquals(actualBrokenLinksKeyPressesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesKeyPressesPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Multiple Windows Page links and images.");
        helper = homePage.openMultipleWindowsHelperPage();
        int actualBrokenLinksMultipleWindowsPage = helper.checkLinks();
        int actualBrokenImagesMultipleWindowsPage = helper.checkImages();
        assertEquals(actualBrokenLinksMultipleWindowsPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesMultipleWindowsPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Nested Frames Page links and images.");
        helper = homePage.openNestedFramesHelperPage();
        int actualBrokenLinksNestedFramesPage = helper.checkLinks();
        int actualBrokenImagesNestedFramesPage = helper.checkImages();
        assertEquals(actualBrokenLinksNestedFramesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesNestedFramesPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Notification Messages Page links and images.");
        helper = homePage.openNotificationMessagesHelperPage();
        int actualBrokenLinksNotificationMessagesPage = helper.checkLinks();
        int actualBrokenImagesNotificationMessagesPage = helper.checkImages();
        assertEquals(actualBrokenLinksNotificationMessagesPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesNotificationMessagesPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();
        log.info("Check Wysiwyg Editor Page links and images.");
        helper = homePage.openWysiwygEditorHelperPage();
        int actualBrokenLinksWysiwygEditorPage = helper.checkLinks();
        int actualBrokenImagesWysiwygEditorPage = helper.checkImages();
        assertEquals(actualBrokenLinksWysiwygEditorPage, expectedBrokenImagesAndLinks);
        assertEquals(actualBrokenImagesWysiwygEditorPage, expectedBrokenImagesAndLinks);
        driver.navigate().back();



    }
}
