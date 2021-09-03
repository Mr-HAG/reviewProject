package com.cybertek.IntroductionofTest;

import com.cybertek.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsPractice {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
       driver = DriverFactory.getDriver("chrome");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("http://practice.cybertekschool.com/dynamic_controls");
    }


    @Test
    public void test1(){
        String locator = "button[type = 'button']";
        driver.findElement(By.cssSelector(locator)).click();

        WebElement element = driver.findElement(By.id("message"));

        //how to wait explicitly

        //create explicit wait object
        WebDriverWait wait = new WebDriverWait(driver,10);
        //calling until method from wait object
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
