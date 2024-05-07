package firstPackage;

import Base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FormAuthenticationTests extends Base {


    @Test(priority = 1)
    public void loginValidCredentials()
    {
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
    }

    //Second test case finding element by Xpath
    @Test(priority = 2)
    public void loginInvalidUsername()
    {
        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Hambozo");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        assertTrue(driver.findElement(By.xpath("//div[@class='flash error']")).getText().contains("Your username is invalid!"));
    }

    //Second test case finding element by CSS selector

    @Test(priority = 3)
    public void loginInvalidPassword()
    {
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("AboTreka!");
        driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
        assertTrue(driver.findElement(By.cssSelector(".flash.error")).getText().contains("Your password is invalid!"));
    }
}
