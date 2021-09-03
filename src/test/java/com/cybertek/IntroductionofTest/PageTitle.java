package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        System.out.println("Amazon.com page title is: " + title);

    }
}
