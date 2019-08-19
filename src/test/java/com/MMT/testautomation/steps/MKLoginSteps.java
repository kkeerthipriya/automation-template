package com.MMT.testautomation.steps;

import java.util.concurrent.TimeUnit;

import static com.MMT.testautomation.hooks.BrowserHooks.driver;

public class MKLoginSteps {

    public MKLoginSteps() {
        driver = driver;
    }

    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

        driver.get("https://makemytrip.com/");
    }
}
