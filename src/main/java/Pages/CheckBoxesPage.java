package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {

    WebDriver driver;
     public CheckBoxesPage(WebDriver driver){
        this.driver=driver;
    }

    private final By checkBox1 =By.xpath("(//*[@type='checkbox'])[1]");
    private final By checkBox2 =By.xpath("(//input[@type='checkbox'])[2]");
    public void setCheckBox1(){
        driver.findElement(checkBox1).click();
    };
    public void setCheckBox2(){
        driver.findElement(checkBox2).click();
    };
    public boolean checkBox1IsSelected (){
        return driver.findElement(checkBox1).isSelected();
    };
    public boolean checkBox2IsSelected (){
        return driver.findElement(checkBox2).isSelected();

    }



}
