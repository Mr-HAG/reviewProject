package com.cybertek.TestNGFramework.POM;

import com.cybertek.TestNGFramework.TestBase;
import com.cybertek.pages_POM.BasePage;
import com.cybertek.pages_POM.CalenderEventsPage;
import com.cybertek.pages_POM.DashBoard;
import com.cybertek.pages_POM.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    /*
        test case
        open browser
        login as a driver
        verify that page subtitle is Quick Launchpad
        go to activities
        verify that page subtitle is Calender Events
     */


    @Test
    public void test1(){
        LoginPage login = new LoginPage();
        login.loginAsDriver();
        BrowserUtils.waitFor(3);

        //dash object is used for invoking the methods and properties from BasePage Class
        DashBoard dash = new DashBoard();

        // verify that page subtitle is Quick Launchpad
        String expectedSub = "Quick Launchpad";
        Assert.assertEquals(dash.getPageSubTitle(),expectedSub,"verify subtitle");

        //go to activities
        dash.navigateToModule("Activities" , "Calendar Events");

        //you can use another object like calender
        //2- CalenderEventsPage calender = new CalenderEventsPage();
        //   calender.navigateToModule("Activities" , "Calendar Events");

        BrowserUtils.waitFor(3);
        expectedSub = "Calendar Events";
        Assert.assertEquals(dash.getPageSubTitle(), expectedSub, "verify subtitle");




    }
}
