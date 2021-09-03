package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPractice2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.cssSelector("a[href ='/checkboxes']")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.cssSelector("input[name= 'checkbox1']")).click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type= 'checkbox']"));

        for(WebElement each : checkboxes){
            Thread.sleep(2000);
            if(!each.isSelected()){
                each.click();
            }
        }

        Thread.sleep(2000);
        driver.quit();


    }
}

    class RadioButtonPractice{
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver  = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("http://practice.cybertekschool.com/");

            driver.findElement(By.cssSelector("a[href ='/radio_buttons']")).click();
            driver.findElement(By.id("yellow")).click();
            //List<WebElement>radioButtons = driver.findElements(By.cssSelector("input[name='color']"));


    }

}
