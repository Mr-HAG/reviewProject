package com.cybertek.TestNGFramework.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    //this class is used for starting and building reports
    ExtentReports report;

    //this class is used to create HTML report file
    ExtentHtmlReporter htmlReporter;

     //this will define a test, enables adding logs,authors,test steps
     ExtentTest extentLogger;


     @BeforeMethod
    public void setUp(){
         //initialize the class
         report = new ExtentReports();

         //create a report path
         String projectPath = System.getProperty("user.dir");
         String path = projectPath + "/test-output/report.html";

         //initialize the html reporter with the report path
         htmlReporter = new ExtentHtmlReporter(path);

         //attach the html report to report object
         report.attachReporter(htmlReporter);

         //title in report
         htmlReporter.config().setReportName("VYTrack Smoke Test");

         //set environment information
         report.setSystemInfo("Environment","QA");
         report.setSystemInfo("Browser","Chrome");
         report.setSystemInfo("Tester","US Tester");
     }


     @Test
    public void test1(){
         //give name to current test
         extentLogger = report.createTest("TC123 Login as Driver Test");

         //test steps
         //info() -> write test steps
         extentLogger.info("Open Browser");

         extentLogger.info("go to url");

         extentLogger.info("enter driver username and password");

         extentLogger.info("click submit");

         extentLogger.info("verify logged in");


         //pass() -> marks the test case passed
         extentLogger.pass("TC123 test case has passed");


     }


     @AfterMethod
    public void tearDown(){
         //this is when the report is actually created
         report.flush();
     }

}
