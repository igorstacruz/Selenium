package com.jalasoft.testing.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/23/2016.
 */
public class Lookup extends AbstractBasePage {

    //private AbstractBasePage currentForm;

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


    public Lookup() {
        //currentForm = currentFormWithLookup;
        WebDriverManager.getInstance().switchToLastWindow();
    }

    public void setLookupSearchTextField(String searchText) {
        driver.switchTo().frame(searchFrame);
        wait.until(ExpectedConditions.visibilityOf(lookupSearchTextField));
        FormFunctions.fillTextBox(lookupSearchTextField,searchText);
    }

    public void clickLookupGoButton() {
        wait.until(ExpectedConditions.visibilityOf(lookupGoButton));
        lookupGoButton.click();
        driver.switchTo().defaultContent();
    }

    public void clickFirstResultWithText(String searchText) {
        driver.switchTo().frame(resultFrame);
        wait.until(ExpectedConditions.visibilityOf(lookupTableResults));
        List<WebElement> listResult = driver.findElements(By.xpath("//a[contains(.,searchText)]"));
        System.out.println("number of match: " + listResult.size());

        //for (WebElement option: listFirstResult ) {
        //    System.out.println(option.getText());
        //}

        //wait.until(ExpectedConditions.elementToBeClickable(firstResult));

        listResult.get(1).click();
        //a[contains(.,'New Campaign 00001')]
        WebDriverManager.getInstance().switchMainWindow();
    }

}
