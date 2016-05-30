package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/27/2016.
 */
public class TopSection extends AbstractBasePage {

    @FindBy(id = "filter_inbox")
    private WebElement inboxLink;

    @FindBy(className = "cmp_filter_today")
    private WebElement todayLink;

    @FindBy(className = "cmp_filter_days")
    private WebElement nextDays;

    public PageContent goToInbox() {
        wait.until(ExpectedConditions.elementToBeClickable(inboxLink));
        inboxLink.click();
        return new PageContent();
    }
}
