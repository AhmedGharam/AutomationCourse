package formAuthenticationTests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecuredAreaPage;
import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.net.ssl.SNIHostName;

import static org.testng.Assert.assertTrue;

public class FormAuthenticationTests extends Base {


    @Test(priority = 1)
    public void loginValidCredentials()
    {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUserName("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecuredAreaPage securedAreaPage = loginPage.clickOnLoginButton();
        assertTrue(securedAreaPage.getValidationMessage().contains("You logged into a secure area!"));
    }
    @Test(priority = 2)
    public void loginInvalidUsername()
    {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUserName("Ali");
        loginPage.insertPassword("SuperSecretPassword!");
        SecuredAreaPage securedAreaPage = loginPage.clickOnLoginButton();
        assertTrue(securedAreaPage.getValidationMessage().contains("Your username is invalid!"));
    }
    @Test(priority = 3)
    public void loginInvalidPassword()
    {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUserName("tomsmith");
        loginPage.insertPassword("ddd");
        SecuredAreaPage securedAreaPage = loginPage.clickOnLoginButton();
        assertTrue(securedAreaPage.getValidationMessage().contains("Your password is invalid!"));
    }
}
