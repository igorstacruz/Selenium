package com.jalasoft.testing.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Integer.parseInt;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class PageContent extends AbstractTaskFormPage {

    @FindBy(xpath = "//a[contains(.,'Add Task')]")
    private WebElement addTaskLink;

    @FindBy(css = ".task_item.not_shared")
    private List<WebElement> listTasks;

    public void clickAddTaskLink() {
        wait.until(ExpectedConditions.elementToBeClickable(addTaskLink));
        addTaskLink.click();
    }

    public String getLastCreatedTaskName() {
        WebElement lastCreatedTask = listTasks.get(listTasks.size() -1);
        return lastCreatedTask.getText();
    }

    public Integer getLastCreatedTaskPriority() {
        System.out.println("Number of Tasks: " + listTasks.size());
        WebElement lastCreatedTask = listTasks.get(listTasks.size() -1);
        String lastCreatedCls = lastCreatedTask.getAttribute("class");
        String priorityClass = lastCreatedCls.substring(lastCreatedCls.indexOf("priority_") + 9,
                lastCreatedCls.indexOf("priority_") + 10);
        System.out.println("Priority on class Element: " + priorityClass);
        int priority = 5 - parseInt(priorityClass);
        return priority;
    }

    public TaskContextMenu openContextMenuForLastCreatedTask() {
        WebElement lastCreatedTask = listTasks.get(listTasks.size() -1);
        Actions mouseHover = new Actions(driver);
        mouseHover.moveToElement(lastCreatedTask).perform();
        WebElement menuButton = lastCreatedTask.findElement(By.cssSelector(".menu > .icon.menu.cmp_menu_on"));
        wait.until(ExpectedConditions.visibilityOf(menuButton));
        menuButton.click();
        return new TaskContextMenu();
    }
}
