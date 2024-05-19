package statusCodesTests;

import Pages.*;
import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StatusCodesTests extends Base {

    @Test(priority = 1)
    public void successfulRequestStatusCode()
    {
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        StatusCode200Page statusCode200Page = statusCodePage.clickOnStatusCode200Link();
        assertTrue(statusCode200Page.getStatusCode200Result());
    }

    @Test(priority = 2)
    public void pageMovedStatusCode() {
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        StatusCode301Page statusCode301Page = statusCodePage.clickOnStatusCode301Link();
        assertTrue(statusCode301Page.getStatusCode301Result());
    }

    @Test(priority = 3)
    public void notFoundStatusCode()
    {
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        StatusCode404Page statusCode404Page = statusCodePage.clickOnStatusCode404Link();
        assertTrue(statusCode404Page.getStatusCode404Result());
    }

    @Test(priority = 4)
    public void internalServerErrorStatusCode()
    {
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        StatusCode500Page statusCode500Page = statusCodePage.clickOnStatusCode500Link();
        assertTrue(statusCode500Page.getStatusCode500Result());
    }

}
