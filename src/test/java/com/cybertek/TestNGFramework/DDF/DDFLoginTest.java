package com.cybertek.TestNGFramework.DDF;

import com.cybertek.TestNGFramework.TestBase;
import com.cybertek.pages_POM.DashBoard;
import com.cybertek.pages_POM.LoginPage;
import com.cybertek.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DDFLoginTest extends TestBase {

    @DataProvider
    public Object[][] userData(){
        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");
        String[][] dataArray = qa3short.getDataArrayWithoutFirstRow();
        return dataArray;
    }

    @Test(dataProvider = "userData")
    public void loginTestData(String username, String password,String firstname,String lastname){
        extentLogger = report.createTest("Test " + firstname + " " + lastname);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        DashBoard dash = new DashBoard();
        dash.waitUntilLoaderScreenDisappear();

        String actualFullName = dash.getUserName();
        String expectedFullName = firstname + " " + lastname;

        Assert.assertEquals(actualFullName,expectedFullName);
        extentLogger.pass("PASS");
    }




}
