package com.jalasoft.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class ProjectsSection extends AbstractBasePage {

    @FindBy(css = "#project_list")
    private WebElement projectsMenu;

    public PageContent goToProject(String project) {
        projectsMenu.findElement(By.xpath(".//li/table/tbody/tr/td/span[contains(.,'" + project + "')]")).click();
        return new PageContent();
    }
}
