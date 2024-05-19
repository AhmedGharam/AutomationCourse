package dynamicLoadingTests;

import Pages.DynamicLoadingExample1Page;
import Pages.DynamicLoadingExample2Page;
import Pages.DynamicLoadingPage;

import base.Base;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DynamicLoadingTests extends Base {

    @Test(priority = 1)
    public void example1Test()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clinkOnExample1Link();
        dynamicLoadingExample1Page.clickOnStartBtn();
        assertEquals(dynamicLoadingExample1Page.getValidationMessage(),"Hello World!");
    }

    @Test(priority = 2)
    public void example2Test() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        DynamicLoadingExample2Page dynamicLoadingExample2Page = dynamicLoadingPage.clickOnExample2Link();
        dynamicLoadingExample2Page.clickOnStartBtn();
        assertEquals(dynamicLoadingExample2Page.getValidationMessage(),"Hello World!");
    }
}
