package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    private final By emailField = By.id("email");
    private final By retrievePasswordBtn = By.id("form_submit");
    private final By forgotPasswordResult = By.xpath("//h1[contains(text(),'Internal Server Error')]");

    public void insertEmail(String mail){
        driver.findElement(emailField).sendKeys(mail);
    }
    public void clickOnRetrievePasswordBtn(){
        driver.findElement(retrievePasswordBtn).click();
    }
    public String getForgotPasswordResult (){
        return driver.findElement(forgotPasswordResult).getText();
    }

}
