package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    WebDriver driver;
    WebDriverWait wait;

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver=driver;
    }

    private final By startBtn = By.tagName("Button");
    private final By validationMessage = By.xpath("//div[@id='finish']/h4");
    private final By loadingBar = By.id("loading");

    public void clickOnStartBtn(){
        driver.findElement(startBtn).click();
    }
    public String getValidationMessage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
        return driver.findElement(validationMessage).getText();
    }
}
