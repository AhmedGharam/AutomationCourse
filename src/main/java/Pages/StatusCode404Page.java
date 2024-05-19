package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode404Page {
    WebDriver driver;
    public StatusCode404Page(WebDriver driver){
        this.driver=driver;
    }
    private final By statusCode404Result = By.xpath("//p[contains(text(),'This page returned a 404 status code.')]");

    public boolean getStatusCode404Result(){
        return driver.findElement(statusCode404Result).isDisplayed();
    }
}
