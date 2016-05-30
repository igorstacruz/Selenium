package com.jalasoft.testing.pages;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewCampaignForm extends AbstractForm {

    @FindBy(id = "cpn1")
    private WebElement campaignNameTextField;

    @FindBy(id = "cpn16")
    private WebElement campaignActiveCheckbox;

    @FindBy(id = "cpn2")
    private WebElement typeCombobox;

    @FindBy(id = "cpn3")
    private WebElement statusCombobox;

    @FindBy(id = "cpn5")
    private WebElement startDateTextField;

    @FindBy(id = "cpn6")
    private WebElement endDateTextField;

    @FindBy(id = "cpn8")
    private WebElement expectedRevTextField;

    @FindBy(id = "cpn9")
    private WebElement budgetedCostTextField;

    @FindBy(id = "cpn10")
    private WebElement actualCostTextField;

    @FindBy(id = "cpn11")
    private WebElement expectedResponseTextField;

    @FindBy(id = "cpn13")
    private WebElement numSentTextField;

    @FindBy(id = "cpn4")
    private WebElement descriptionTextField;

    public void setCampaignNameTextField(String campaignName) {
        wait.until(ExpectedConditions.visibilityOf(campaignNameTextField));
        FormFunctions.fillTextBox(campaignNameTextField,campaignName);
    }

    public void checkCampaignActiveCheckbox() {
        wait.until(ExpectedConditions.visibilityOf(campaignActiveCheckbox));
        FormFunctions.checkACheckBox(campaignActiveCheckbox);
    }

    public void selectTypeCombobox(String type) {
        wait.until(ExpectedConditions.visibilityOf(typeCombobox));
        FormFunctions.selectOptionByValue(typeCombobox, type);
    }

    public void selectStatusCombobox(String status) {
        wait.until(ExpectedConditions.visibilityOf(statusCombobox));
        FormFunctions.selectOptionByValue(statusCombobox, status);
    }

    public void setStartDateTextField(String startDate) {
        wait.until(ExpectedConditions.visibilityOf(startDateTextField));
        FormFunctions.fillTextBox(startDateTextField,startDate);
    }

    public void setEndDateTextField(String endDate) {
        wait.until(ExpectedConditions.visibilityOf(endDateTextField));
        FormFunctions.fillTextBox(endDateTextField,endDate);
    }

    public void setExpectedRevTextField(String expectedRev) {
        wait.until(ExpectedConditions.visibilityOf(expectedRevTextField));
        FormFunctions.fillTextBox(expectedRevTextField,expectedRev);
    }

    public void setBudgetedCostTextField(String budgetedCost) {
        wait.until(ExpectedConditions.visibilityOf(budgetedCostTextField));
        FormFunctions.fillTextBox(budgetedCostTextField,budgetedCost);
    }

    public void setActualCostTextField(String actualCost) {
        wait.until(ExpectedConditions.visibilityOf(actualCostTextField));
        FormFunctions.fillTextBox(actualCostTextField,actualCost);
    }

    public void setExpectedResponseTextField(String expectedResponse) {
        wait.until(ExpectedConditions.visibilityOf(expectedResponseTextField));
        FormFunctions.fillTextBox(expectedResponseTextField,expectedResponse);
    }

    public void setNumSentTextField(String numSent) {
        wait.until(ExpectedConditions.visibilityOf(numSentTextField));
        FormFunctions.fillTextBox(numSentTextField,numSent);
    }

    public void setDescriptionTextField(String description) {
        wait.until(ExpectedConditions.visibilityOf(descriptionTextField));
        FormFunctions.fillTextBox(descriptionTextField,description);
    }

    public CampaignDetail clickSaveButton() {
        saveButton.click();
        return new CampaignDetail();
    }
}
