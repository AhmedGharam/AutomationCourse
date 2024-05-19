package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode301Page {
    WebDriver driver;
    public StatusCode301Page(WebDriver driver){
        this.driver=driver;
    }

    private final By statusCode301Result = By.xpath("//p[contains(text(),'This page returned a 301 status code.')]");

    public boolean getStatusCode301Result(){
        return driver.findElement(statusCode301Result).isDisplayed();
    }
}
