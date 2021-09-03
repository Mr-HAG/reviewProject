package com.cybertek.TestNGFramework.POM;

import com.cybertek.TestNGFramework.TestBase;
import com.cybertek.pages_POM.CalenderEventsPage;
import com.cybertek.pages_POM.CreateCalenderEventsPage;
import com.cybertek.pages_POM.DashBoard;
import com.cybertek.pages_POM.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTest extends TestBase {

    /*
       VERIFY RADIO BUTTONS
       open browser
       login as driver
       go to activities-calender events
       click on repeat
       verify that repeat every days is checked
       verify that repeat weekday is not checked
     */

    @Test
    public void test1(){
        LoginPage login = new LoginPage();
        login.loginAsDriver();
        BrowserUtils.waitFor(3);


        DashBoard dash = new DashBoard();
        CalenderEventsPage calender = new CalenderEventsPage();
        dash.navigateToModule("Activities" , "Calendar Events");
        BrowserUtils.waitFor(3);
        calender.createCalendarEvent.click();
        BrowserUtils.waitFor(3);
        CreateCalenderEventsPage createEvent = new CreateCalenderEventsPage();
        createEvent.repeat.click();
        BrowserUtils.waitFor(3);

        Assert.assertTrue(createEvent.days.isSelected());
        Assert.assertTrue(!createEvent.weekday.isSelected());

    }

    /*
       VERIFY REPEAT OPTIONS
       open browser
       login as driver
       go to activities-calender events
       click on repeat
       verify that repeat options are daily weekly monthly yearly(in this order)
     */


    @Test
    public void test2(){
        LoginPage login = new LoginPage();
        login.loginAsDriver();
        BrowserUtils.waitFor(3);

        DashBoard dash = new DashBoard();
        CalenderEventsPage calender = new CalenderEventsPage();
        dash.navigateToModule("Activities" , "Calendar Events");
        BrowserUtils.waitFor(3);
        calender.createCalendarEvent.click();
        BrowserUtils.waitFor(3);
        CreateCalenderEventsPage createEvent = new CreateCalenderEventsPage();
        createEvent.repeat.click();
        BrowserUtils.waitFor(3);

        Select repeatDropDown = createEvent.repeatOptionsList();

        List<String> expected = Arrays.asList("Daily","Weekly","Monthly","Yearly");
        List<WebElement> actualOptions = repeatDropDown.getOptions();
        List<String> actualList = new ArrayList<>();

        for (WebElement option : actualOptions){
            //option.getText();
            actualList.add(option.getText());
        }

        //another way of getting list with ready method from BrowserUtils Class
        //List<String> actualList2 = BrowserUtils.getElementsText(actualOptions);

        Assert.assertEquals(expected,actualList,"verify dropdown options");
    }
}
