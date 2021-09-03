package com.cybertek.pages_POM;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //I should make storage of web elements
    public LoginPage(){ PageFactory.initElements(Driver.get(),this); }

    //driver.findElement(By.id("prependedInput"));
    //@FindBy(id = "prependedInput")
    @FindAll({
            @FindBy(id = "prependedInput"),
            @FindBy(name = "_username"),
    })
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String userStr, String passwordStr){
        usernameInput.sendKeys(userStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }

    public void loginAsDriver(){
        String userName = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}
