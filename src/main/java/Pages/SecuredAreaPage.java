package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecuredAreaPage {

    WebDriver driver;
    public SecuredAreaPage(WebDriver driver) {
        this.driver=driver;
    }

    private final By validationMessage = By.id("flash");
    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }

}
