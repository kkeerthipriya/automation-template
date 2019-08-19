package com.MMT.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MKLogin {

    @FindBy(how= How.LINK_TEXT, using="Log in")
    public static WebElement login;
}
