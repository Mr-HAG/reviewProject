package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByXPath {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropDown = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        //absolute XPath

        System.out.println(dropDown.getText());
        Thread.sleep(3000);

        //relative xpath syntax: //tagname[@attribute='value']
        WebElement ex = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(ex.getText());


        WebElement context = driver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println(context.getText());
        driver.close();

    }
}


