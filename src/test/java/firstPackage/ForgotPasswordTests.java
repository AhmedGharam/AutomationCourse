package firstPackage;

import Base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends Base {


    @Test
    public void retrievePassword()
    {
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("agharam@qa.team");
        driver.findElement(By.id("form_submit")).click();
        assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Internal Server Error')]")).isDisplayed());
    }

}
