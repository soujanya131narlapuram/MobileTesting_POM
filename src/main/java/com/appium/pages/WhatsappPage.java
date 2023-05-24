package com.appium.pages;

import com.appium.base.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

public class WhatsappPage extends BaseClass {


    public void loginToWhatsApp() throws InterruptedException {
        driver.findElements(AppiumBy.className("android.widget.LinearLayout")).get(0).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.whatsapp:id/eula_accept")).click();
        Thread.sleep(1000);
        driver.setClipboardText("1980922093");
        driver.findElement(AppiumBy.id("com.whatsapp:id/registration_phone")).sendKeys(driver.getClipboardText());
        Thread.sleep(4000);
        driver.findElement(AppiumBy.id("com.whatsapp:id/registration_submit")).click();
        Thread.sleep(8000);
        driver.findElement(AppiumBy.id("android:id/button1")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("com.whatsapp:id/submit")).click();
        Thread.sleep(10000);
        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(10000);
        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("android:id/button2")).click();
        Thread.sleep(6000);
        driver.findElement(AppiumBy.id("com.whatsapp:id/register_name_accept")).click();
        Thread.sleep(8000);



    }
}



