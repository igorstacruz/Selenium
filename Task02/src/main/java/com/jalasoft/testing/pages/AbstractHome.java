package com.jalasoft.testing.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/20/2016.
 */
public abstract class AbstractHome extends AbstractBasePage {

    @FindBy(name = "new")
    protected WebElement newButton;

    abstract public AbstractBasePage clickNewButton();

}
