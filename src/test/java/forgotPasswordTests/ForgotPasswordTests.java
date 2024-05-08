package forgotPasswordTests;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {


    @Test
    public void retrievePassword()
    {
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("agharam@qa.team");
        driver.findElement(By.id("form_submit")).click();
        WebElement forgetPasswordResult = driver.findElement(By.xpath("//h1[contains(text(),'Internal Server Error')]"));
        assertTrue(forgetPasswordResult.getText().contains("Internal Server Error"));
    }

}
