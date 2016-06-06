package com.jalasoft.testing.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Igor Santa Cruz on 5/26/2016.
 */

public class WebDriverManager {

    private static final int TIMEOUT_NORMAL = 15;
    private static WebDriverManager instance;
    private WebDriver driver;

    private WebDriverWait wait;

    private WebDriverManager() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, TIMEOUT_NORMAL);
    }

    public static WebDriverManager getInstance() {
        if (instance == null) {
            instance = new WebDriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
