package checkBoxesTests;

import Pages.CheckBoxesPage;
import base.Base;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTests extends Base {


    //Select the first checkbox and unselect the second checkbox
    @Test
    public void changeCheckBoxesSelection()
    {
        CheckBoxesPage checkBoxesPage = homePage.clickOnCheckBoxesLink();
        checkBoxesPage.setCheckBox1();
        checkBoxesPage.setCheckBox2();
        assertTrue(checkBoxesPage.checkBox1IsSelected());
        assertFalse(checkBoxesPage.checkBox2IsSelected());
    }

}
