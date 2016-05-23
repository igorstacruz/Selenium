package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
public final class FormFunctions {

    public  static void fillTextBox(WebElement textField, String textToSet) {
        textField.clear();
        textField.sendKeys(textToSet);
    }

    public  static void checkACheckBox(WebElement checkbox) {
        checkBoxHandle(checkbox, true);
    }

    public  static void UncheckACheckBox(WebElement checkbox) {
        checkBoxHandle(checkbox, false);
    }

    public  static void checkBoxHandle(WebElement checkbox, Boolean option) {
        if(!checkbox.isSelected() == option) {
            checkbox.click();
        }
    }

    public static void selectOptionByValue(WebElement select, String textValue){
        Select comboBox = new Select(select);
        comboBox.selectByValue(textValue);
    }
}
