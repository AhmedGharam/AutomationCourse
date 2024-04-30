package firstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class loginClass {


    @Test(priority = 1)
    public void loginValidCredentials()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
        driver.close();
    }

    //Second test case finding element by Xpath
    @Test(priority = 2)
    public void loginInvalidUsername()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Hambozo");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        assertTrue(driver.findElement(By.xpath("//div[@class='flash error']")).getText().contains("Your username is invalid!"));
        driver.close();
    }

    //Second test case finding element by CSS selector

    @Test(priority = 3)
    public void loginInvalidPassword()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("AboTreka!");
        driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
        assertTrue(driver.findElement(By.cssSelector(".flash.error")).getText().contains("Your password is invalid!"));
        driver.close();
    }
}
