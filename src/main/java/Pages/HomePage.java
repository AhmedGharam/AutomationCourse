package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private final By formAuthenticationLink =By.linkText("Form Authentication");
    private final By checkBoxesLink =By.linkText("Checkboxes");
    private final By forgotPasswordLink = By.linkText("Forgot Password");
    private final By fileUploadLink = By.linkText("File Upload");
    private final By statusCodeLink = By.linkText("Status Codes");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public CheckBoxesPage clickOnCheckBoxesLink(){
        driver.findElement(checkBoxesLink).click();
        return new CheckBoxesPage(driver);
    }
    public ForgotPasswordPage clickOnForgotPasswordLink(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }
    public FileUploadPage clickOnFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }
    public StatusCodePage clickOnStatusCodeLink(){
        driver.findElement(statusCodeLink).click();
        return new StatusCodePage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }



}
