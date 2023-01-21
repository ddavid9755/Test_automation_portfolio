package addRemoveElements;

import base.BaseConfig;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;
import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTests extends BaseConfig {

    @Test
    public void checkAddElementButton() {
        log.info("Execute checkAddElementButton test.");
        log.info("Click to Add Element button 3 times");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        log.info("Check Delete Button count.");
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
    }

    @Test
    public void checkRemoveOneElementButton() {
        log.info("Execute checkRemoveOneElementButton test.");
        log.info("Click to Add Element button 3 times.");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        log.info("Check Delete button count.");
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
        addRemoveElementsPage.clickDeleteElementButton(1);
        log.info("Click Delete button one time.");
        int actualDeleteButtonNumberAfterClick = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumberAfterClick = 2;
        log.info("Check Delete button count");
        assertEquals(actualDeleteButtonNumberAfterClick, expectedDeleteButtonNumberAfterClick);
    }

    @Test
    public void checkRemoveAllElementsButton() {
        log.info("Execute checkRemoveAllElementsButton test.");
        log.info("Click to Add Element button 3 times.");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        log.info("Check Delete button count.");
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
        log.info("Click Delete button 3 times.");
        addRemoveElementsPage.clickDeleteElementButton(3);
        int actualDeleteButtonNumberAfterClick = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumberAfterClick = 0;
        log.info("Check Delete button count.");
        assertEquals(actualDeleteButtonNumberAfterClick, expectedDeleteButtonNumberAfterClick);
    }

}
