package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	/**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
   
    private static String urladmin="http://trainermanagement.herokuapp.com/login";
    @FindBy(name="email")
    private WebElement username;
    @FindBy(name="password")
    private WebElement password;    
    @FindBy(xpath="/html/body/app-root/app-login/main/form/button")
    private WebElement login;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
    private WebElement allocation;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement logout;
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get(urladmin);
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Set user name in textbox
    public void setUserName(String strUserName){
    	username.sendKeys(strUserName);     
    }
  //Set password in password textbox
    public void setPassword(String strPassword){
       password.sendKeys(strPassword);
    }
 
  //Click on login button
  
   public void clickLogin() throws InterruptedException{
          login.click();
          Thread.sleep(2000);
    }  
   
   public void clickAllocation() throws InterruptedException{
       allocation.click();
       Thread.sleep(2000);
 } 
 //Click on login button
   
   public void clickLogout(){
          logout.click();
    }  
  
 //Click on login button
   
   

}
