package pages;

import helper.Helper;
import helper.PageEnums;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private static final Logger log = LogManager.getLogger();
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

    public Helper openBrokenImagesHelperPage() {
        clickMenuElement(PageEnums.PageNames.BROKENIMAGES.name);
        return new Helper(driver);
    }

    public CheckboxesPage openCheckboxesPage() {
        clickMenuElement(PageEnums.PageNames.CHECKBOXES.name);
        return new CheckboxesPage(driver);
    }

    public Helper openCheckboxesHelperPage() {
        clickMenuElement(PageEnums.PageNames.CHECKBOXES.name);
        return new Helper(driver);
    }

    public ContextMenuPage openContextMenuPage() {
        clickMenuElement(PageEnums.PageNames.CONTEXTMENU.name);
        return new ContextMenuPage(driver);
    }

    public Helper openContextMenuHelperPage() {
        clickMenuElement(PageEnums.PageNames.CONTEXTMENU.name);
        return new Helper(driver);
    }

    public DragAndDropPage openDragAndDropPage() {
        clickMenuElement(PageEnums.PageNames.DND.name);
        return new DragAndDropPage(driver);
    }

    public Helper openDragAndDropHelperPage() {
        clickMenuElement(PageEnums.PageNames.DND.name);
        return new Helper(driver);
    }

    public DropdownPage openDropdownPage() {
        clickMenuElement(PageEnums.PageNames.DROPDOWN.name);
        return new DropdownPage(driver);
    }

    public Helper openDropdownHelperPage() {
        clickMenuElement(PageEnums.PageNames.DROPDOWN.name);
        return new Helper(driver);
    }

    public EntryAdPage openEntryAdPage() {
        clickMenuElement(PageEnums.PageNames.ENTRYAD.name);
        return new EntryAdPage(driver);
    }

    public Helper openEntryAdHelperPage() {
        clickMenuElement(PageEnums.PageNames.ENTRYAD.name);
        return new Helper(driver);
    }

    public FileDownloadPage openFileDownloadPage() {
        clickMenuElement(PageEnums.PageNames.FILEDOWNLOAD.name);
        return new FileDownloadPage(driver);
    }

    public Helper openFileDownloadHelperPage() {
        clickMenuElement(PageEnums.PageNames.FILEDOWNLOAD.name);
        return new Helper(driver);
    }

    public FileUploadPage openFileUploadPage() {
        clickMenuElement(PageEnums.PageNames.FILEUPLOAD.name);
        return new FileUploadPage(driver);
    }

    public Helper openFileUploadHelperPage() {
        clickMenuElement(PageEnums.PageNames.FILEUPLOAD.name);
        return new Helper(driver);
    }

    public FormAuthenticationPage openFormAuthenticationPage() {
        clickMenuElement(PageEnums.PageNames.FORMAUTH.name);
        return new FormAuthenticationPage(driver);
    }

    public Helper openFormAuthenticationHelperPage() {
        clickMenuElement(PageEnums.PageNames.FORMAUTH.name);
        return new Helper(driver);
    }

    public FramesPage openFramesPage() {
        clickMenuElement(PageEnums.PageNames.FRAMES.name);
        return new FramesPage(driver);
    }

    public Helper openFramesHelperPage() {
        clickMenuElement(PageEnums.PageNames.FRAMES.name);
        return new Helper(driver);
    }

    public HorizontalSliderPage openHorizontalSliderPage() {
        clickMenuElement(PageEnums.PageNames.HORIZONTALSLIDER.name);
        return new HorizontalSliderPage(driver);
    }

    public Helper openHorizontalSliderHelperPage() {
        clickMenuElement(PageEnums.PageNames.HORIZONTALSLIDER.name);
        return new Helper(driver);
    }

    public HoversPage openHoversPage() {
        clickMenuElement(PageEnums.PageNames.HOVERS.name);
        return new HoversPage(driver);
    }

    public Helper openHoversHelperPage() {
        clickMenuElement(PageEnums.PageNames.HOVERS.name);
        return new Helper(driver);
    }

    public JavascriptAlertsPage openJavascriptAlertsPage() {
        clickMenuElement(PageEnums.PageNames.JAVASCRIPTALERT.name);
        return new JavascriptAlertsPage(driver);
    }

    public Helper openJavascriptAlertsHelperPage() {
        clickMenuElement(PageEnums.PageNames.JAVASCRIPTALERT.name);
        return new Helper(driver);
    }

    public KeyPressesPage openKeyPressesPage() {
        clickMenuElement(PageEnums.PageNames.KEYPRESSES.name);
        return new KeyPressesPage(driver);
    }

    public Helper openKeyPressesHelperPage() {
        clickMenuElement(PageEnums.PageNames.KEYPRESSES.name);
        return new Helper(driver);
    }

    public MultipleWindowsPage openMultipleWindowsPage() {
        clickMenuElement(PageEnums.PageNames.MULTIPLEWINDOWS.name);
        return new MultipleWindowsPage(driver);
    }

    public Helper openMultipleWindowsHelperPage() {
        clickMenuElement(PageEnums.PageNames.MULTIPLEWINDOWS.name);
        return new Helper(driver);
    }

    public NestedFramesPage openNestedFramesPage() {
        clickMenuElement(PageEnums.PageNames.NESTEDFRAMES.name);
        return new NestedFramesPage(driver);
    }

    public Helper openNestedFramesHelperPage() {
        clickMenuElement(PageEnums.PageNames.NESTEDFRAMES.name);
        return new Helper(driver);
    }

    public NotificationMessagesPage openNotificationMessagesPage() {
        clickMenuElement(PageEnums.PageNames.NOTIFICATIONMESSAGES.name);
        return new NotificationMessagesPage(driver);
    }

    public Helper openNotificationMessagesHelperPage() {
        clickMenuElement(PageEnums.PageNames.NOTIFICATIONMESSAGES.name);
        return new Helper(driver);
    }

    public WysiwygEditorPage openWysiwygEditorPage() {
        clickMenuElement(PageEnums.PageNames.WYSIWYGEDITOR.name);
        return new WysiwygEditorPage(driver);
    }

    public Helper openWysiwygEditorHelperPage() {
        clickMenuElement(PageEnums.PageNames.WYSIWYGEDITOR.name);
        return new Helper(driver);
    }

}
