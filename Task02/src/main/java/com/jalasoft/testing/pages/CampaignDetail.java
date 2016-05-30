package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */

public class CampaignDetail extends AbstractBasePage{

    @FindBy(id = "cpn1_ileinner")
    private WebElement campaignText;

    @FindBy(css = "#cpn16_ileinner > img")
    private WebElement campaignActive;

    @FindBy(id = "cpn2_ileinner")
    private WebElement campaignType;

    @FindBy(id = "cpn3_ileinner")
    private WebElement campaignStatus;

    @FindBy(id = "cpn5_ileinner")
    private WebElement campaignStartDate;

    @FindBy(id = "cpn6_ileinner")
    private WebElement campaignEndDate;

    @FindBy(id = "cpn8_ileinner")
    private WebElement campaignExpectedRev;

    @FindBy(id = "cpn9_ileinner")
    private WebElement campaignBudgetedCost;

    @FindBy(id = "cpn10_ileinner")
    private WebElement campaignActualCost;

    @FindBy(id = "cpn11_ileinner")
    private WebElement campaignExpectedResponse;

    @FindBy(id = "cpn13_ileinner")
    private WebElement campaignNumSent;

    @FindBy(id = "cpn4_ileinner")
    private WebElement campaignDescription;

    public String getCampaignName() {
        return campaignText.getText();
    }

    public String getCampaignActive() {
        return campaignActive.getAttribute("alt");
    }

    public String getCampaignType() {
        return campaignType.getText();
    }

    public String getCampaignStatus() {
        return campaignStatus.getText();
    }

    public String getCampaignStartDate() {
        return campaignStartDate.getText();
    }

    public String getCampaignEndDate() {
        return campaignEndDate.getText();
    }

    public String getCampaignExpectedRev() {
        return campaignExpectedRev.getText();
    }

    public String getCampaignBudgetedCost() {
        return campaignBudgetedCost.getText();
    }

    public String getCampaignActualCost() {
        return campaignActualCost.getText();
    }

    public String getCampaignExpectedResponse() {
        return campaignExpectedResponse.getText();
    }

    public String getCampaignNumSent() {
        return campaignNumSent.getText();
    }

    public String getCampaignDescription() {
        return campaignDescription.getText();
    }

}
