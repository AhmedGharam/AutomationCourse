package firstPackage;

import Base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodesTests extends Base {

    @Test(priority = 1)
    public void successfulRequestStatusCode()
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("200")).click();
        assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]")).isDisplayed());
    }

    @Test(priority = 2)
    public void pageMovedStatusCode()
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("301")).click();
        assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]")).isDisplayed());
    }

    @Test(priority = 3)
    public void notFoundStatusCode()
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("404")).click();
        assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]")).isDisplayed());
    }

    @Test(priority = 4)
    public void internalServerErrorStatusCode()
    {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("500")).click();
        assertTrue(driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]")).isDisplayed());
    }


}
