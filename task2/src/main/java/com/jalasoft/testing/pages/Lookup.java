package com.jalasoft.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/23/2016.
 */
public class Lookup extends AbstractBasePage {

    private AbstractBasePage currentForm;

    @FindBy(id = "searchFrame")
    private WebElement searchFrame;

    @FindBy(id = "lksrch")
    private WebElement lookupSearchTextField;

    @FindBy(css = ".btn")
    private WebElement lookupGoButton;

    @FindBy(id = "resultsFrame")
    private WebElement resultFrame;

    @FindBy(css = ".list")
    private WebElement lookupTableResults;


    public Lookup(AbstractBasePage currentFormWithLookup) {
        currentForm = currentFormWithLookup;
        WebDriverManager.getInstance().switchToLastWindow();
    }

    public void setLookupSearchTextField(String searchText) {
        driver.switchTo().frame(searchFrame);
        wait.until(ExpectedConditions.visibilityOf(lookupSearch));
        FormFunctions.fillTextBox(lookupSearch,searchText);
    }

    public void ClickLookupGoButton() {
        wait.until(ExpectedConditions.visibilityOf(lookupGoButton));
        lookupGoButton.click();
        driver.switchTo().defaultContent();
    }

    public AbstractBasePage ClickFirstResultWithText(String searchText) {
        driver.switchTo().frame(resultFrame);
        wait.until(ExpectedConditions.visibilityOf(lookupTableResults));
        lookupTableResults.findElement(By.XPath("//a[contains(.,searchText)]")).click();
        WebDriverManager.getInstance().switchMainWindow();
        return currentForm;
    }

}
