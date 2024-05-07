package firstPackage;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxesTests extends Base {


    //Select the first checkbox and unselect the second checkbox
    @Test
    public void changeCheckBoxesSelection()
    {
        driver.findElement(By.linkText("Checkboxes")).click();
        WebElement checkBox1 = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!checkBox1.isSelected())
        {
            checkBox1.click();
        }
        if (checkBox2.isSelected())
        {
            checkBox2.click();
        }
        assertTrue(checkBox1.isSelected());
        assertFalse(checkBox2.isSelected());
    }

}
