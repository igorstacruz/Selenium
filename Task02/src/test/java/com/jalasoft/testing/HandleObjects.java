package com.jalasoft.testing;

import com.jalasoft.testing.pages.CampaignDetail;
import com.jalasoft.testing.pages.CampaignHome;
import com.jalasoft.testing.pages.Footer;
import com.jalasoft.testing.pages.LeadDetail;
import com.jalasoft.testing.pages.LeadHome;
import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.Lookup;
import com.jalasoft.testing.pages.MainContainer;
import com.jalasoft.testing.pages.NewCampaignForm;
import com.jalasoft.testing.pages.NewLeadForm;
import com.jalasoft.testing.pages.Privacy;
import com.jalasoft.testing.pages.TabBar;
import com.jalasoft.testing.pages.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Igor Santa Cruz on 5/16/2016.
 */

public class HandleObjects {

    private MainContainer mainContainer;

    private TabBar tabBar;

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        mainContainer = login.loginAs("igorsant@cruz.com", "sasori97");
    }

    @BeforeMethod
    public void beforeMethod() {
        tabBar = mainContainer.goToTabBar();
    }

    @Test
    public void testCreateCampaign() {
        String expectedCampaignName = "New Campaign 00001";
        String expectedCampaignType = "Telemarketing";
        String expectedCampaignStatus = "In Progress";
        String expectedCampaignStartDate = "5/9/2016";
        String expectedCampaignEndDate = "5/13/2016";
        String expectedCampaignExpectedRev = "950";
        String expectedCampaignBudgetedCost = "800";
        String expectedCampaignActualCost = "500";
        String expectedCampaignResponse = "50.00";
        String expectedCampaignNumSent = "2";
        String expectedCampaignDescription = "Test Campaign of Telemarketing type";

        CampaignHome campaignHome = tabBar.clickCampaignsTab();
        NewCampaignForm newCampaignForm = campaignHome.clickNewButton();
        newCampaignForm.setCampaignNameTextField(expectedCampaignName);
        newCampaignForm.checkCampaignActiveCheckbox();
        newCampaignForm.selectTypeCombobox(expectedCampaignType);
        newCampaignForm.selectStatusCombobox(expectedCampaignStatus);
        newCampaignForm.setStartDateTextField(expectedCampaignStartDate);
        newCampaignForm.setEndDateTextField(expectedCampaignEndDate);
        newCampaignForm.setExpectedRevTextField(expectedCampaignExpectedRev);
        newCampaignForm.setBudgetedCostTextField(expectedCampaignBudgetedCost);
        newCampaignForm.setActualCostTextField(expectedCampaignActualCost);
        newCampaignForm.setExpectedResponseTextField(expectedCampaignResponse);
        newCampaignForm.setNumSentTextField(expectedCampaignNumSent);
        newCampaignForm.setDescriptionTextField(expectedCampaignDescription);

        CampaignDetail campaignDetail = newCampaignForm.clickSaveButton();

        assertEquals(campaignDetail.getCampaignName(),
                expectedCampaignName + " [View Hierarchy]");
        assertEquals(campaignDetail.getCampaignActive(), "Checked");
        assertEquals(campaignDetail.getCampaignType(), expectedCampaignType);
        assertEquals(campaignDetail.getCampaignStatus(), expectedCampaignStatus);
        assertEquals(campaignDetail.getCampaignStartDate(), expectedCampaignStartDate);
        assertEquals(campaignDetail.getCampaignEndDate(), expectedCampaignEndDate);
        assertEquals(campaignDetail.getCampaignExpectedRev(),
                "$" + expectedCampaignExpectedRev);
        assertEquals(campaignDetail.getCampaignBudgetedCost(),
                "$" + expectedCampaignBudgetedCost);
        assertEquals(campaignDetail.getCampaignActualCost(),
                "$" + expectedCampaignActualCost);
        assertEquals(campaignDetail.getCampaignExpectedResponse(),
                expectedCampaignResponse + "%");
        assertEquals(campaignDetail.getCampaignNumSent(), expectedCampaignNumSent);
        assertEquals(campaignDetail.getCampaignDescription(), expectedCampaignDescription);
    }

    @Test
    public void testCreateLead() {
        String expectedLeadFirstName = "Jhon";
        String expectedLeadSalutation = "Mr.";
        String expectedLeadLastName = "Doe";
        String expectedLeadCompany = "MyCompany";
        String expectedLeadTitle = "Eng.";
        String expectedLeadSource = "Web";
        String expectedLeadIndustry = "Energy";
        String expectedLeadAnnualRev = "500";
        String expectedLeadPhone = "4444444";
        String expectedLeadStatus = "Working - Contacted";
        String expectedLeadRating = "Hot";
        String expectedLeadStreet = "Av. First";
        String expectedLeadCity = "LAX";
        String expectedLeadCountry = "USA";
        String expectedLeadProductInterest = "GC1000 series";
        String expectedLeadCampaign = "New Campaign 00001";

        LeadHome leadHome = tabBar.clickLeadsTab();
        NewLeadForm newLeadForm = leadHome.clickNewButton();
        newLeadForm.setFirstNameTextField(expectedLeadFirstName);
        newLeadForm.selectSalutationCombobox(expectedLeadSalutation);
        newLeadForm.setLastNameTextField(expectedLeadLastName);
        newLeadForm.setCompanyTextField(expectedLeadCompany);
        newLeadForm.settitleTextField(expectedLeadTitle);
        newLeadForm.selectLeadSourceCombobox(expectedLeadSource);
        newLeadForm.selectIndustryCombobox(expectedLeadIndustry);
        newLeadForm.setAnnualRevenueTextField(expectedLeadAnnualRev);
        newLeadForm.setPhoneTextField(expectedLeadPhone);
        newLeadForm.selectLeadStatusCombobox(expectedLeadStatus);
        newLeadForm.selectRatingCombobox(expectedLeadRating);
        Lookup campaignLookup = newLeadForm.clickCampaignLookupButton();
        campaignLookup.setLookupSearchTextField(expectedLeadCampaign);
        campaignLookup.clickLookupGoButton();
        campaignLookup.clickFirstResultWithText(expectedLeadCampaign);
        newLeadForm.setAddressStreetTextField(expectedLeadStreet);
        newLeadForm.setAddressCityTextField(expectedLeadCity);
        newLeadForm.setAddressCountryTextField(expectedLeadCountry);
        newLeadForm.selectProductInterestCombobox(expectedLeadProductInterest);
        LeadDetail leadDetail = newLeadForm.clickSaveButton();

        assertEquals(leadDetail.getLeadNameText(), expectedLeadSalutation + " "
                + expectedLeadFirstName + " " + expectedLeadLastName);
        assertEquals(leadDetail.getLeadCompany(),  expectedLeadCompany);
        assertEquals(leadDetail.getLeadTitle(),  expectedLeadTitle);
        assertEquals(leadDetail.getLeadSource(),  expectedLeadSource);
        assertEquals(leadDetail.getLeadIndustry(),  expectedLeadIndustry);
        assertEquals(leadDetail.getLeadAnnualRev(),  "$" + expectedLeadAnnualRev);
        assertEquals(leadDetail.getLeadPhone(),  expectedLeadPhone);
        assertEquals(leadDetail.getLeadStatus(),  expectedLeadStatus);
        assertEquals(leadDetail.getLeadRating(),  expectedLeadRating);
        assertEquals(leadDetail.getLeadAdress(),  expectedLeadStreet + "\n"
                + expectedLeadCity + ",\n" + expectedLeadCountry);
        assertEquals(leadDetail.getLeadProductInterest(),  expectedLeadProductInterest);
        leadDetail.campaignExist(expectedLeadCampaign);
    }

    @Test
    public void testPrivacyLink() {
        Footer footer = mainContainer.goToFooter();
        Privacy privacy =  footer.clickPrivacyLink();

        assertEquals(privacy.getTitleText(), "Privacy Statements");

        WebDriverManager.getInstance().closePageAndSwitchMainWindow();
    }
}