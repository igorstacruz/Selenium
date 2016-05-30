package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/30/2016.
 */
public class ConfirmDialog extends AbstractBasePage {
    @FindBy(css = ".alert_holder.gb_iframe_html")
    private WebElement alertFrame;

    @FindBy(css = "div > .amibutton.amibutton_red")
    private WebElement okButton;

    public ConfirmDialog(){
        wait.until(ExpectedConditions.visibilityOf(alertFrame));
    }

    public  void clickOK() {
        wait.until(ExpectedConditions.elementToBeClickable(okButton));
        okButton.click();
    }
}
