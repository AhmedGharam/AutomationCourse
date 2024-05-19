package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode500Page {

    WebDriver driver;
    public StatusCode500Page(WebDriver driver){
        this.driver=driver;
    }
    private final By statusCode500Result = By.xpath("//p[contains(text(),'This page returned a 500 status code.')]");

    public boolean getStatusCode500Result(){
        return driver.findElement(statusCode500Result).isDisplayed();
    }
}
