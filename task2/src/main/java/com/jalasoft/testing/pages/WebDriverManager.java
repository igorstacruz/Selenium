package com.jalasoft.testing.pages;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverManager {

    private static WebDriverManager instance;

    private WebDriver driver;

    private WebDriverWait wait;

    private LinkedList<String> windowsList;

    private WebDriverManager() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
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

    public void closePageAndSwitchMainWindow() {
        driver.close();
        driver.switchTo().window(windowsList.getFirst());
    }

    public void switchMainWindow() {
        driver.switchTo().window(windowsList.getFirst());
    }

    public void switchToLastWindow() {
        windowsList = new LinkedList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowsList.getLast());
    }
}
