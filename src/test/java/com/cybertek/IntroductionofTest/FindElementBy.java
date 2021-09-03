package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElementBy {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");

        WebElement home = driver.findElement(By.className("navbar-nav"));
        System.out.println(home.getText());
        driver.close();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver1.findElement(By.id("disappearing_button"));
        button.click();

        WebElement result = driver1.findElement(By.id("result"));
        System.out.println(result.getText());
        driver1.close();


    }

}

