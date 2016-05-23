package com.jalasoft.testing;

import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.MainContainer;
import org.testng.annotations.Test;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
public class LoginTest {

    @Test
    public void testLogin() {
        String expectedCampaignName = "New Campaign 00001";

        Login login = new Login();
        MainContainer mainContainer =
                login.loginAs("igorsant@cruz.com", "sasori97");
    }
}
