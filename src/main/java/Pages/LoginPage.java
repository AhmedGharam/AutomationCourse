package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By userNameField =By.id("username");
    private final By passwordField =By.id("password");
    private final By loginButton =By.className("radius");

    public void insertUserName (String username){
        driver.findElement(userNameField).sendKeys(username);
    };
    public void insertPassword (String password){
        driver.findElement(passwordField).sendKeys(password);
    };
    public SecuredAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecuredAreaPage(driver);
    }
}
