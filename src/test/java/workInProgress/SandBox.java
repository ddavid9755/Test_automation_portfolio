package workInProgress;

import base.BaseConfig;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class SandBox extends BaseConfig {

    @Test
    public void SandBoxTests() {
        CheckboxesPage checkboxesPage = homePage.openCheckboxesPage();
        checkboxesPage.selectCheckbox("First Checkbox");
    }


}
