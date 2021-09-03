package com.cybertek.TestNGFramework.ExtentReport;
import com.cybertek.TestNGFramework.TestBase;
import com.cybertek.pages_POM.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestwithReport extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void wrongPasswordTest(){
        extentLogger = report.createTest("Wrong Password Test");
        loginPage.usernameInput.sendKeys("User1");
        extentLogger.info("Enter Username = User1");
        loginPage.passwordInput.sendKeys("somepassword");
        extentLogger.info("Enter password = somepassword");
        loginPage.loginBtn.click();
        extentLogger.info("click login button");

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        //if the assertion failed, it will not send pass to html report
        extentLogger.pass("Wrong password has passed");
    }

    @Test
    public void wrongUserNameTest() throws InterruptedException {

        extentLogger = report.createTest("Wrong Username Test");
        loginPage.usernameInput.sendKeys("someuser");
        extentLogger.info("Enter Username = someuser");
        loginPage.passwordInput.sendKeys("UserUser123");
        extentLogger.info("Enter Password = UserUser123");
        loginPage.loginBtn.click();
        extentLogger.info("click login button");

        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("Wrong usernameTest has passed");
    }
}
