package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class FormFunctions {
    public static void fillTextBox(WebElement textField, String textToSet) {
        textField.clear();
        textField.sendKeys(textToSet);
    }
}
