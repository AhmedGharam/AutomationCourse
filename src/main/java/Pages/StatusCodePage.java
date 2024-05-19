package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {

    WebDriver driver;

    public StatusCodePage(WebDriver driver){
        this.driver=driver;
    }

    private final By statusCode200Link = By.linkText("200");
    private final By statusCode301Link = By.linkText("301");
    private final By statusCode404Link = By.linkText("404");
    private final By statusCode500Link = By.linkText("500");

    public StatusCode200Page clickOnStatusCode200Link(){
        driver.findElement(statusCode200Link).click();
        return new StatusCode200Page(driver);
    }
    public StatusCode301Page clickOnStatusCode301Link(){
        driver.findElement(statusCode301Link).click();
        return new StatusCode301Page(driver);
    }
    public StatusCode404Page clickOnStatusCode404Link(){
        driver.findElement(statusCode404Link).click();
        return new StatusCode404Page(driver);
    }
    public StatusCode500Page clickOnStatusCode500Link(){
        driver.findElement(statusCode500Link).click();
        return new StatusCode500Page(driver);
    }

}
