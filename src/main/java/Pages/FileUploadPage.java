package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage (WebDriver driver){
        this.driver=driver;
    }

    private final By fileUpload = By.id("file-upload");
    private final By submitBtn = By.id("file-submit");
    private final By uploadResult = By.id("uploaded-files");

    public void uploadFileFromDevice(String path){
        driver.findElement(fileUpload).sendKeys(path);
    }
    public void clickOnSubmitBtn(){
        driver.findElement(submitBtn).click();
    }
    public String getUploadResult(){
        return driver.findElement(uploadResult).getText();
    }
}
