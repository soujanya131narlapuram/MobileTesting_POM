package com.appium.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass
{
    public static AndroidDriver driver;
    public DesiredCapabilities capabilities;

    public void setUp() throws InterruptedException, MalformedURLException
    {
            capabilities = new DesiredCapabilities();
           capabilities.setCapability("deviceName","b1bdef0d");
           capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","12");
            capabilities.setCapability("appPackage", "com.whatsapp");
            capabilities.setCapability("appActivity","com.whatsapp.HomeActivity");
            System.out.println("Whatsapp launched!!");
           driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
           Thread.sleep(10000);
    }
}
