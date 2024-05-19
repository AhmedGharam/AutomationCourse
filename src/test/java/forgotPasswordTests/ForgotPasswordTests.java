package forgotPasswordTests;

import Pages.ForgotPasswordPage;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends Base {


    @Test
    public void retrievePassword()
    {
        ForgotPasswordPage forgotPasswordPage = homePage.clickOnForgotPasswordLink();
        forgotPasswordPage.insertEmail("agharam@qa.team");
        forgotPasswordPage.clickOnRetrievePasswordBtn();
        assertTrue(forgotPasswordPage.getForgotPasswordResult().contains("Internal Server Error"));
    }


}
