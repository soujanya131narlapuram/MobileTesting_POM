package com.appium.mobile.testing;

import com.appium.base.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.appium.pages.*;
import java.net.MalformedURLException;

public class WhatsappTest extends BaseClass
{
    public WhatsappPage whatsAppScreen;


    @BeforeTest
    public void initDriver() throws MalformedURLException, InterruptedException
    {

        setUp();
        whatsAppScreen =new WhatsappPage();
    }
    @Test
    public void launchSession() throws InterruptedException {
        Thread.sleep(2000);
        whatsAppScreen.loginToWhatsApp();
    }


}
