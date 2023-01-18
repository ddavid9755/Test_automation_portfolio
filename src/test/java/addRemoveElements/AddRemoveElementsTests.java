package addRemoveElements;

import base.BaseConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;
import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTests extends BaseConfig {
    public static final Logger log = LogManager.getLogger();

    @Test
    public void checkAddElementButton() {
        log.info("Execute checkAddElementButton test.");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
    }

    @Test
    public void checkRemoveOneElementButton() {
        log.info("Execute checkRemoveOneElementButton test.");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
        addRemoveElementsPage.clickDeleteElementButton(1);
        int actualDeleteButtonNumberAfterClick = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumberAfterClick = 2;
        assertEquals(actualDeleteButtonNumberAfterClick, expectedDeleteButtonNumberAfterClick);
    }

    @Test
    public void checkRemoveAllElementsButton() {
        log.info("Execute checkRemoveAllElementsButton test.");
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);

        addRemoveElementsPage.clickDeleteElementButton(3);
        int actualDeleteButtonNumberAfterClick = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumberAfterClick = 0;
        assertEquals(actualDeleteButtonNumberAfterClick, expectedDeleteButtonNumberAfterClick);
    }

}
