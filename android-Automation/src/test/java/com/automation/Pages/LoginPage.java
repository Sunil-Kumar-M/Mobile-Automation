package com.automation.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Login']")
    private WebElement login;


    @FindBy(xpath = "//android.widget.EditText[@content-desc='input-email']" )
    private WebElement emailField;


    @FindBy(xpath = "//android.widget.EditText[@content-desc='input-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='button-LOGIN']")
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginTab(){
        login.click();
    }

    public void typeEmail(String emailID){
        emailField.sendKeys(emailID);
    }

    public void tapLogin(){
        loginButton.click();
    }

    public void typePassword(String password){
        passwordField.sendKeys(password);
    }



}
