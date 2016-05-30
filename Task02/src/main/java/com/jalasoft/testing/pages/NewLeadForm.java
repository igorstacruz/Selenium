package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/20/2016.
 */
public class NewLeadForm extends AbstractForm {

    @FindBy(id = "name_firstlea2")
    private WebElement firstNameTextField;

    @FindBy(id = "name_salutationlea2")
    private WebElement salutationCombobox;

    @FindBy(id = "name_lastlea2")
    private WebElement lastNameTextField;

    @FindBy(id = "lea3")
    private WebElement companyTextField;

    @FindBy(id = "lea4")
    private WebElement titleTextField;

    @FindBy(id = "lea5")
    private WebElement leadSourceCombobox;

    @FindBy(id = "lea6")
    private WebElement industryCombobox;

    @FindBy(id = "lea7")
    private WebElement annualRevenueTextField;

    @FindBy(id = "lea8")
    private WebElement phoneTextField;

    @FindBy(id = "lea9")
    private WebElement movileTextField;

    @FindBy(id = "lea10")
    private WebElement faxTextField;

    @FindBy(id = "lea11")
    private WebElement emailTextField;

    @FindBy(id = "lea12")
    private WebElement websideTextField;

    @FindBy(id = "lea13")
    private WebElement leadStatusCombobox;

    @FindBy(id = "lea14")
    private WebElement ratingCombobox;

    @FindBy(id = "lea15")
    private WebElement NoOfEmployeesTextField;

    @FindBy(id = "lea16street")
    private WebElement addressStreetTextField;

    @FindBy(id = "lea16city")
    private WebElement addressCityTextField;

    @FindBy(id = "lea16state")
    private WebElement addressStateTextField;

    @FindBy(id = "lea16zip")
    private WebElement addressZipTextField;

    @FindBy(id = "lea16country")
    private WebElement addressCountryTextField;

    @FindBy(id = "00N3600000D6qiv")
    private WebElement productInterestCombobox;

    @FindBy(id = "lea17")
    private WebElement descriptionTextField;

    @FindBy(id = "lea21")
    private WebElement activeAssignmentCheckbox;

    @FindBy(id = "lea20_lkwgt")
    private WebElement campaignLookupButton;

    public void setFirstNameTextField(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameTextField));
        FormFunctions.fillTextBox(firstNameTextField,firstName);
    }

    public void selectSalutationCombobox(String salutation) {
        wait.until(ExpectedConditions.visibilityOf(salutationCombobox));
        FormFunctions.selectOptionByValue(salutationCombobox, salutation);
    }

    public void setLastNameTextField(String lastName) {
        wait.until(ExpectedConditions.visibilityOf(lastNameTextField));
        FormFunctions.fillTextBox(lastNameTextField,lastName);
    }

    public void setCompanyTextField(String company) {
        wait.until(ExpectedConditions.visibilityOf(companyTextField));
        FormFunctions.fillTextBox(companyTextField,company);
    }

    public void settitleTextField(String title) {
        wait.until(ExpectedConditions.visibilityOf(titleTextField));
        FormFunctions.fillTextBox(titleTextField,title);
    }

    public void selectLeadSourceCombobox(String leadSource) {
        wait.until(ExpectedConditions.visibilityOf(leadSourceCombobox));
        FormFunctions.selectOptionByValue(leadSourceCombobox, leadSource);
    }

    public void selectIndustryCombobox(String industry) {
        wait.until(ExpectedConditions.visibilityOf(industryCombobox));
        FormFunctions.selectOptionByValue(industryCombobox, industry);
    }

    public void setAnnualRevenueTextField(String annualRevenue) {
        wait.until(ExpectedConditions.visibilityOf(annualRevenueTextField));
        FormFunctions.fillTextBox(annualRevenueTextField,annualRevenue);
    }

    public void setPhoneTextField(String phone) {
        wait.until(ExpectedConditions.visibilityOf(phoneTextField));
        FormFunctions.fillTextBox(phoneTextField,phone);
    }

    public void setMovileTextField(String movile) {
        wait.until(ExpectedConditions.visibilityOf(movileTextField));
        FormFunctions.fillTextBox(movileTextField,movile);
    }

    public void setFaxTextField(String fax) {
        wait.until(ExpectedConditions.visibilityOf(faxTextField));
        FormFunctions.fillTextBox(faxTextField,fax);
    }

    public void setEmailTextField(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        FormFunctions.fillTextBox(emailTextField,email);
    }

    public void setWebsideTextField(String webside) {
        wait.until(ExpectedConditions.visibilityOf(websideTextField));
        FormFunctions.fillTextBox(websideTextField,webside);
    }

    public void selectLeadStatusCombobox(String leadStatus) {
        wait.until(ExpectedConditions.visibilityOf(leadStatusCombobox));
        FormFunctions.selectOptionByValue(leadStatusCombobox, leadStatus);
    }

    public void selectRatingCombobox(String rating) {
        wait.until(ExpectedConditions.visibilityOf(ratingCombobox));
        FormFunctions.selectOptionByValue(ratingCombobox, rating);
    }

    public void setNoOfEmployeesTextField(String NoOfEmployees) {
        wait.until(ExpectedConditions.visibilityOf(NoOfEmployeesTextField));
        FormFunctions.fillTextBox(NoOfEmployeesTextField,NoOfEmployees);
    }

    public void setAddressStreetTextField(String addressStreet) {
        wait.until(ExpectedConditions.visibilityOf(addressStreetTextField));
        FormFunctions.fillTextBox(addressStreetTextField,addressStreet);
    }

    public void setAddressCityTextField(String addressCity) {
        wait.until(ExpectedConditions.visibilityOf(addressCityTextField));
        FormFunctions.fillTextBox(addressCityTextField,addressCity);
    }

    public void setAddressStateTextField(String addressState) {
        wait.until(ExpectedConditions.visibilityOf(addressStateTextField));
        FormFunctions.fillTextBox(addressStateTextField,addressState);
    }

    public void setAddressZipTextField(String zip) {
        wait.until(ExpectedConditions.visibilityOf(addressZipTextField));
        FormFunctions.fillTextBox(addressZipTextField,zip);
    }

    public void setAddressCountryTextField(String addressCountry) {
        wait.until(ExpectedConditions.visibilityOf(addressCountryTextField));
        FormFunctions.fillTextBox(addressCountryTextField,addressCountry);
    }

    public void selectProductInterestCombobox(String productInterest) {
        wait.until(ExpectedConditions.visibilityOf(productInterestCombobox));
        FormFunctions.selectOptionByValue(productInterestCombobox, productInterest);
    }


    public void setDescriptionTextField(String description) {
        wait.until(ExpectedConditions.visibilityOf(descriptionTextField));
        FormFunctions.fillTextBox(descriptionTextField,description);
    }

    public void checkActiveAssignmentCheckbox() {
        wait.until(ExpectedConditions.visibilityOf(activeAssignmentCheckbox));
        FormFunctions.checkACheckBox(activeAssignmentCheckbox);
    }

    public LeadDetail clickSaveButton() {
        saveButton.click();
        return new LeadDetail();
    }

    public Lookup clickCampaignLookupButton() {
        campaignLookupButton.click();
        return new Lookup();
    }
}
