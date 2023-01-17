package addRemoveElements;

import base.BaseConfig;
import helper.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTests extends BaseConfig {

    @Test
    public void checkAddElementButton() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;

        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);
    }

    @Test
    public void checkRemoveElementButton() {
        AddRemoveElementsPage addRemoveElementsPage = homePage.openAddRemoveElementsPage();
        addRemoveElementsPage.clickAddElementButton(3);
        int actualDeleteButtonNumber = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumber = 3;
        assertEquals(actualDeleteButtonNumber, expectedDeleteButtonNumber);

        addRemoveElementsPage.clickDeleteElementButton();
        int actualDeleteButtonNumberAfterClick = addRemoveElementsPage.getDeleteElementButtonsNumber();
        int expectedDeleteButtonNumberAfterClick = 2;
        assertEquals(actualDeleteButtonNumberAfterClick, expectedDeleteButtonNumberAfterClick);

    }

}
