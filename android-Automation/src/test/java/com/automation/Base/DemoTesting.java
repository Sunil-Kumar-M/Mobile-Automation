package com.automation.Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DemoTesting {

    public AppiumDriverLocalService service;
    public AppiumDriver driver;

    @BeforeSuite
    public void startServer() throws Exception{
        service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder());
        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.1");
        capabilities.setCapability("deviceName", "Nexus 5x");
        capabilities.setCapability("udid", "00c73e7f3d7bafb7");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appActivity","com.wdiodemoapp.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        System.out.println(capabilities.getCapability("devceName"));

    }


    @AfterSuite
    public void stopServer(){
        driver.quit();
        service.stop();
    }
}
