package com.cybertek.IntroductionofTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);

        Select select1 = new Select(driver.findElement(By.id("state")));
        select1.selectByVisibleText("District Of Columbia");
        Thread.sleep(2000);


        Select select2 = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = select2.getOptions();

        for (WebElement option : options) {
            Thread.sleep(1000);
            select2.selectByVisibleText(option.getText());
        }

        Thread.sleep(2000);
        select2.deselectAll();
        Thread.sleep(1000);


        WebElement element = driver.findElement(By.id("dropdownMenuLink"));
        element.click();
        Thread.sleep(1000);

        WebElement option = driver.findElement(By.xpath("//a[text()='Amazon']"));
        option.click();


        Thread.sleep(1000);

        driver.close();
    }




}
