package fileUploadTests;

import Pages.FileUploadPage;
import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FileUploadTests extends Base {

    //Upload file and assert if uploaded successfully
    @Test
    public void uploadExistingFileFromDevice()
    {
        FileUploadPage fileUploadPage = homePage.clickOnFileUploadLink();
        fileUploadPage.uploadFileFromDevice("/Users/ahmedgharam/Documents/OTA File.rtf");
        fileUploadPage.clickOnSubmitBtn();
        assertTrue(fileUploadPage.getUploadResult().contains("OTA File.rtf"));
    }
}
