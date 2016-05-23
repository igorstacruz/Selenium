package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/23/2016.
 */

public class Privacy extends AbstractBasePage {

    @FindBy(css = ".cell-content > h3")
    private WebElement titleText;

    public Privacy() {
        WebDriverManager.getInstance().switchToLastWindow();
    }

    public String getTitleText() {
        return titleText.getText();
    }

}
