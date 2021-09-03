package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url1 = "http://google.com";
        String url2 = "http://amazon.com";

        driver.get(url1);
        driver.manage().window().maximize(); //maximize window instead of fullscreen mode
        Thread.sleep(3000);

        driver.navigate().to(url2);

        Thread.sleep(3000);

        driver.navigate().back(); //back to google.com

        Thread.sleep(3000);

        driver.navigate().forward(); // forward to amazon again

        Thread.sleep(3000);
        Thread.sleep(2000);
        driver.navigate().refresh(); //refresh amazon.com

        Thread.sleep(2000);


        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        System.out.println("title = " + title);
        System.out.println("currentURL = " + currentUrl);
        //System.out.println("pageSource = " + pageSource);
        driver.close();
    }
}
