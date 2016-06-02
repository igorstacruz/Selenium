package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/30/2016.
 */
public abstract class AbstractTaskFormPage extends AbstractBasePage {

    @FindBy(xpath = "//div[@class='richtext_editor sel_richtext_editor']")
    protected WebElement taskNameTextField;

    @FindBy(css=".form_icon_holder > img[class^='cmp_priority']")
    protected WebElement defaultPriorityIcon;

    @FindBy(css = ".td_submit > .amibutton_red")
    protected WebElement addTaskButton;


    public void setTaskNameTextField(String taskName) {
        wait.until(ExpectedConditions.visibilityOf(taskNameTextField));
        FormFunctions.fillTextBox(taskNameTextField,taskName);
    }

    public void selectPriorityForCurrentTask(String priority) {
        defaultPriorityIcon.click();
        PriorityList priorityList = new PriorityList();
        priorityList.selectPriority(priority);
    }

    public void clickAddTaskButton() {
        addTaskButton.click();
    }

}
