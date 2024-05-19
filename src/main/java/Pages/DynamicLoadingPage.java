package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    private final By example1Link = By.partialLinkText("Example 1");
    private final By example2Link = By.partialLinkText("Example 2");

    public DynamicLoadingExample1Page clinkOnExample1Link(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickOnExample2Link(){
        driver.findElement(example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

}
