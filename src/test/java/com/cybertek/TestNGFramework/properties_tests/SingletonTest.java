package com.cybertek.TestNGFramework.properties_tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
        String s1 = Singleton.getInstance();//str is null in here but assign a value because of this
        String s2 = Singleton.getInstance();//after assigning value

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }


    @Test
    public void test2(){
        WebDriver driver = Driver.get();
        driver.get("http://www.google.com");

        driver.quit();
    }

    @Test
    public void test3(){
        Driver.get().get("http://www.amazon.com");
    }



}
