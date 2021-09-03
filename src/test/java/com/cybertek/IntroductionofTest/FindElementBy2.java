package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementBy2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        driver.close();

        Thread.sleep(3000);
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().fullscreen();
        driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver1.get("http://practice.cybertekschool.com/");

        List<WebElement> classList = driver1.findElements(By.className("list-group-item"));
        System.out.println(classList.size());

        //print each text of element
        for(WebElement each : classList){
            System.out.println(each.getText());
        }



    }
}
