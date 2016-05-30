package com.jalasoft.testing.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */

public class CampaignHome extends AbstractHome {

    public NewCampaignForm clickNewButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        newButton.click();
        return new NewCampaignForm();
    }

}
