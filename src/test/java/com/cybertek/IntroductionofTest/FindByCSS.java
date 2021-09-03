package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByCSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href = '/registration_form']")).click();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name= 'firstname']")).sendKeys("Mike");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name= 'lastname']")).sendKeys("White");

       //driver.quit();
    }
}
