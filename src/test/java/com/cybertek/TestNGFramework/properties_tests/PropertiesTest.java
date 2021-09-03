package com.cybertek.TestNGFramework.properties_tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test
    public void test1(){
        String browser = ConfigurationReader.get("browser");
        System.out.println("browser = " + browser);

        System.out.println(ConfigurationReader.get("driver_username"));

        WebDriver driver = DriverFactory.getDriver(ConfigurationReader.get("browser"));
        //this is the last time that we used DriverFactory class, because we will use Driver class after that
    }
}
