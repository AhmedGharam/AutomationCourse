package firstPackage;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FileUploadTests extends Base {

    //Upload file and assert if uploaded successfully
    @Test
    public void changeCheckBoxesSelection()
    {
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("/Users/ahmedgharam/Documents/OTA File.rtf");
        driver.findElement(By.id("file-submit")).click();
        assertTrue(driver.findElement(By.id("uploaded-files")).getText().contains("OTA File"));
    }
}
