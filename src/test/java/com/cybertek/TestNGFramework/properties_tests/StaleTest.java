package com.cybertek.TestNGFramework.properties_tests;

import com.cybertek.TestNGFramework.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaleTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("selenium" + Keys.ENTER);

        WebElement result = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(result.isDisplayed());

        //go to google again
        driver.navigate().back();
        //stale element exception: if you want to use same locator in same page after navigate or refresh method
        //that exception always will happen even if locator is correct.
        //this exception is about selenium issues and you should implement locator again then you can send sth to it
        input = driver.findElement(By.name("q"));
        input.sendKeys("Java" + Keys.ENTER);
        result = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(result.isDisplayed());

    }
}
