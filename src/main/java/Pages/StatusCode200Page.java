package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class StatusCode200Page {

    WebDriver driver;
    public StatusCode200Page(WebDriver driver){
        this.driver=driver;
    }

    private final By statusCode200Result = By.xpath("//p[contains(text(),'This page returned a 200 status code.')]");

    public boolean getStatusCode200Result(){
        return driver.findElement(statusCode200Result).isDisplayed();
    }

}
