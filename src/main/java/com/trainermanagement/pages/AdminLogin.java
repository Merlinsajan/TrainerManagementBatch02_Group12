package com.trainermanagement.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.trainermanagement.constants.AutomationConstants;

public class AdminLogin {
	
WebDriver driver;
   
	private static String urladmin="http://trainermanagement.herokuapp.com/login";
    @FindBy(name="email")
    private WebElement username;
    @FindBy(name="password")
    private WebElement password;    
    @FindBy(xpath="/html/body/app-root/app-login/main/form/button")
    private WebElement login;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[4]/a")
    private WebElement logoutadmin;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement viewallocation;
    @FindBy(how=How.XPATH, using="//a[@class='btn btn-success']")
    private WebElement Approve;
    @FindBy(how=How.XPATH, using="//a[@class='btn btn-danger']")
    private WebElement Reject;
    
    public AdminLogin(WebDriver driver){
        this.driver = driver;
        driver.get(urladmin);
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set user name in textbox
    public void setUserName(String strUserName){
    	username.sendKeys("admin@gmail.com");     
    }
  //Set password in password textbox
    public void setPassword(String strPassword){
       password.sendKeys("1234");
    }
 
  //Click on login button
  
   public void clickLogin(){
          login.click();
          
    }  

public void clickapprove() {
	Approve.sendKeys(Keys.RETURN);
	System.out.println("Approved Profile");
}
   
   public void clickviewAllocation() {
       viewallocation.sendKeys(Keys.RETURN);
       
 } 

   public void clickLogoutadmin(){
       logoutadmin.sendKeys(Keys.RETURN);
 }  

   
	
}
