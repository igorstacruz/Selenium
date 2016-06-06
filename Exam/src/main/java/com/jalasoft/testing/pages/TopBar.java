package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class TopBar extends AbstractBasePage {
    @FindBy(id = "icon_add_task")
    private WebElement iconAddQuickTask;

    public QuickTaskDialog clickAddQuickTask() {
        wait.until(ExpectedConditions.elementToBeClickable(iconAddQuickTask));
        iconAddQuickTask.click();
        return new QuickTaskDialog();
    }
}
