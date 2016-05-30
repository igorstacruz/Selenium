package com.jalasoft.testing.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/30/2016.
 */
public class QuickTaskDialog extends AbstractTaskFormPage {

    @FindBy(css = ".select_project .project_select_item > .truncated.p_name")
    private WebElement projectSelect;

    @FindBy(css = "tr td .project_select_item")
    private List<WebElement> listProjects;

    public void clickSelectProject() {
        projectSelect.click();
    }

    public Boolean selectProject(String project) {
        clickSelectProject();
        System.out.println("Number of Projects on Select: " + listProjects.size());
        Boolean projectFound = false;
        for (WebElement currentProject : listProjects) {
            if (currentProject.getText().equals(project)){
                System.out.println("the Project: " + project + " was found: ");
                projectFound = true;
                currentProject.click();
                break;
            }
        }
        return projectFound;
    }

}
