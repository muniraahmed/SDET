package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    WebElement txtUserName;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    WebElement loginButton;

    @FindBy(xpath= "//div//ul//li//a[text()='Log out']")
    //@FindBy(xpath="/html/body/div[3]/div/ul/li[10]/a")
    WebElement logout;

    public void setUserName(String uname) {
        txtUserName.sendKeys(uname);

    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);

    }

    public void clickLogin() {
        loginButton.click();

    }
    public  void clickLogout() {
        logout.click();


    }


}
