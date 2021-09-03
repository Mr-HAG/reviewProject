package com.cybertek.IntroductionofTest;

import com.cybertek.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frames {
    WebDriver driver;

    @Test
    public void testFrame() throws InterruptedException {
        driver = DriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        //how to switch frames
        //1.switch by using name or id attribute of frame
        driver.switchTo().frame("mce_0_ifr");

        //clear before sendKeys
        WebElement element = driver.findElement(By.id("tinymce"));
        element.clear();
        element.sendKeys("Mike Smith");

        Thread.sleep(2000);
        //goes back to first frame
        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        //2.Using Index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith with Index");

        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        // second one is
        //driver.switchTo().parentFrame();

        //3. Using WebElement
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameElement);
        Thread.sleep(2000);

        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Mike Smith with WebElement");

    }
}
