package com.jalasoft.testing.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Igor Santa Cruz on 5/26/2016.
 */

public class AbstractBasePage {

    protected WebDriver driver;

    protected WebDriverWait wait;

    public AbstractBasePage() {
        driver = WebDriverManager.getInstance().getDriver();
        wait = WebDriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }
}
