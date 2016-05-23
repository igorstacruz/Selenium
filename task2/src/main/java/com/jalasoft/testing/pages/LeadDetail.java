package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/20/2016.
 */
public class LeadDetail extends AbstractBasePage {

    @FindBy(id = "lea2_ileinner")
    private WebElement leadNameText;

    @FindBy(id = "lea3_ileinner")
    private WebElement leadCompany;

    @FindBy(id = "lea4_ileinner")
    private WebElement leadTitle;

    @FindBy(id = "lea5_ileinner")
    private WebElement leadSource;

    @FindBy(id = "lea6_ileinner")
    private WebElement leadIndustry;

    @FindBy(id = "lea7_ileinner")
    private WebElement leadAnnualRev;

    @FindBy(id = "lea16_ileinner")
    private WebElement leadAdress;

    @FindBy(id = "lea8_ileinner")
    private WebElement leadPhone;

    @FindBy(id = "lea9_ileinner")
    private WebElement leadMovile;

    @FindBy(id = "lea10_ileinner")
    private WebElement leadFax;

    @FindBy(id = "lea11_ileinner")
    private WebElement leadEmail;

    @FindBy(id = "lea12_ileinner")
    private WebElement leadWebsite;

    @FindBy(id = "lea13_ileinner")
    private WebElement leadStatus;

    @FindBy(id = "lea14_ileinner")
    private WebElement leadRating;

    @FindBy(id = "lea15_ileinner")
    private WebElement leadNoOfEmployees;

    @FindBy(id = "00N3600000D6qiv_ileinner")
    private WebElement leadProductInterest;

    @FindBy(id = "lea17_ileinner")
    private WebElement leadDescription;


    public String getLeadNameText() {
        return leadNameText.getText();
    }

    public String getLeadCompany() {
        return leadCompany.getText();
    }

    public String getLeadTitle() {
        return leadTitle.getText();
    }

    public String getLeadSource() {
        return leadSource.getText();
    }

    public String getLeadIndustry() {
        return leadIndustry.getText();
    }

    public String getLeadAnnualRev() {
        return leadAnnualRev.getText();
    }

    public String getLeadAdress() {
        return leadAdress.getText();
    }

    public String getLeadPhone() {
        return leadPhone.getText();
    }

    public String getLeadMovile() {
        return leadMovile.getText();
    }

    public String getLeadFax() {
        return leadFax.getText();
    }

    public String getLeadEmail() {
        return leadEmail.getText();
    }

    public String getLeadWebsite() {
        return leadWebsite.getText();
    }

    public String getLeadStatus() {
        return leadStatus.getText();
    }

    public String getLeadRating() {
        return leadRating.getText();
    }

    public String getLeadNoOfEmployees() {
        return leadNoOfEmployees.getText();
    }

    public String getLeadProductInterest() {
        return leadProductInterest.getText();
    }

    public String getLeadDescription() {
        return leadDescription.getText();
    }

}
