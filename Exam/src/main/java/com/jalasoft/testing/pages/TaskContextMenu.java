package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/30/2016.
 */
public class TaskContextMenu extends AbstractBasePage {

    @FindBy(css = ".AmiMenu .sel_delete_task")
    private WebElement deleteButton;

    public ConfirmDialog clickDeleteTask() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        deleteButton.click();
        return new ConfirmDialog();
    }
}

