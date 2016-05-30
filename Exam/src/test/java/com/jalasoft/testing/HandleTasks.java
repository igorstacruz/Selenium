package com.jalasoft.testing;

import com.jalasoft.testing.pages.ConfirmDialog;
import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.MainContainer;
import com.jalasoft.testing.pages.PageContent;
import com.jalasoft.testing.pages.ProjectsSection;
import com.jalasoft.testing.pages.QuickTaskDialog;
import com.jalasoft.testing.pages.TaskContextMenu;
import com.jalasoft.testing.pages.TopBar;
import com.jalasoft.testing.pages.TopSection;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class HandleTasks {
    private MainContainer mainContainer;
    private PageContent pageContent;


    @BeforeClass
    public void setUp() {
        Login login = new Login();
        mainContainer = login.loginAs("igor.stacruz@gmail.com", "sasori97");
    }

    @AfterMethod
    public void tierDown() {
        TaskContextMenu taskContextMenu = pageContent.openContextMenuForLastCreatedTask();
        ConfirmDialog confirmDialog = taskContextMenu.clickDeleteTask();
        confirmDialog.clickOK();
    }

    @Test
    public void testCreateInboxTask() {
        String expectedInboxTaskName = "Task1";
        int expectedInboxTaskPriority = 2;

        TopSection topSection = mainContainer.goToTopSection();
        pageContent = topSection.goToInbox();
        pageContent.clickAddTaskLink();
        pageContent.setTaskNameTextField(expectedInboxTaskName);
        pageContent.selectPriorityForCurrentTask("Priority "+ expectedInboxTaskPriority);
        pageContent.clickAddTaskButton();
        assertEquals(expectedInboxTaskName, pageContent.getLastCreatedTaskName(),
                "Task Name displayed on Inbox Page");
        int taskPriority = pageContent.getLastCreatedTaskPriority();
        assertEquals(expectedInboxTaskPriority, taskPriority, "Priority on Created Task");
    }

    @Test
    public void testCreateQuickTask() {
        String expectedQuickTaskName = "Task2";
        int expectedQuickTaskPriority = 1;
        String expectedQuickTaskProject = "Trabajo";

        TopBar topBar = mainContainer.goToTopBar();
        QuickTaskDialog  addQuickTaskDialog = topBar.clickAddQuickTask();
        addQuickTaskDialog.setTaskNameTextField(expectedQuickTaskName);
        addQuickTaskDialog.selectPriorityForCurrentTask("Priority "+ expectedQuickTaskPriority);
        assertTrue(addQuickTaskDialog.selectProject(expectedQuickTaskProject),
                "The expected Project was found");
        addQuickTaskDialog.clickAddTaskButton();
        ProjectsSection projectsSection = mainContainer.goToProjectsSection();
        pageContent = projectsSection.goToProject(expectedQuickTaskProject);
        assertEquals(expectedQuickTaskName, pageContent.getLastCreatedTaskName(),
                "Task name displayed on selected Project");
        int taskPriority = pageContent.getLastCreatedTaskPriority();
        assertEquals(expectedQuickTaskPriority, taskPriority, "Priority on Created Quick Task");
    }
}
