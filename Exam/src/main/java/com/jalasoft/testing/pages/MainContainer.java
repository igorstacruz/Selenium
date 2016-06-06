package com.jalasoft.testing.pages;

/**
 * Created by Igor Santa Cruz on 5/26/2016.
 */
public class MainContainer extends AbstractBasePage {
    public TopBar goToTopBar() {
        return new TopBar();
    }

    public TopSection goToTopSection() {
        return new TopSection();
    }

    public ProjectsSection goToProjectsSection() {
        return new ProjectsSection();
    }
}