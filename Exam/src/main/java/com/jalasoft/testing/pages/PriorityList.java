package com.jalasoft.testing.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/29/2016.
 */
public class PriorityList extends AbstractBasePage {

    @FindBy(css = ".AmiMenu.priority_menu .priorities > .a_priority > .cmp_priority1")
    private WebElement priority1_link;

    @FindBy(css = ".AmiMenu.priority_menu .priorities > .a_priority > .cmp_priority2")
    private WebElement priority2_link;

    @FindBy(css = ".AmiMenu.priority_menu .priorities > .a_priority > .cmp_priority3")
    private WebElement priority3_link;

    @FindBy(css = ".AmiMenu.priority_menu .priorities > .a_priority > .cmp_priority4")
    private WebElement priority4_link;

    Map<String, WebElement> priorityMap;

    public PriorityList() {
        priorityMap = new HashMap<String, WebElement>();
        wait.until(ExpectedConditions.visibilityOf(priority1_link));
        priorityMap.put("Priority 1", priority1_link);
        priorityMap.put("Priority 2", priority2_link);
        priorityMap.put("Priority 3", priority3_link);
        priorityMap.put("Priority 4", priority4_link);
    }

    public void selectPriority(String priority) {
        WebElement priorityToSelect = priorityMap.get(priority);
        priorityToSelect.click();
    }
}
