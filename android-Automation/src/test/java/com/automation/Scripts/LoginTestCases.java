package com.automation.Scripts;

import com.automation.Base.DemoTesting;
import com.automation.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTestCases extends DemoTesting {

    @Test
    public void validLoginTating(){

        LoginPage act = new LoginPage(driver);
        act.clickOnLoginTab();
        act.typeEmail("testing@testing.com");
        act.typePassword("123456789");
        act.tapLogin();
        boolean element = driver.findElement(By.id("android:id/content")).isDisplayed();
        System.out.println(element);

//        WebElement a = driver.findElementByXPath("jdfs");
    }

}
//D:\Automation Projects\Mobile-Automation\android-Automation\application\DemoApp.apk
