package com.trainermanagement.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	private static String url="http://trainermanagement.herokuapp.com/";
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[1]/a")
	private WebElement home;
	
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
    private WebElement login;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
	private WebElement signup;
	
	
	
	public HomePage(WebDriver driver){
	       this.driver=driver;
	       driver.get(url);
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	 public void clickhome() {
	       	home.click();
	       	
	       	System.out.println("Home Page is Working Fine");
	       	System.out.println("----------------------------------------------------");
	       	Date date = new Date();
	       	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	       	String formattedDate = sdf.format(date);
	       	System.out.println(formattedDate);
	      
	          }

	   public void clickOnLoginButton(){

	       login.sendKeys(Keys.RETURN);
	       String expectedUrlhomelogin="http://trainermanagement.herokuapp.com/login";
		    String actualUrlhomelogin =driver.getCurrentUrl();
		    Assert.assertEquals(expectedUrlhomelogin,actualUrlhomelogin);
		    System.out.println(actualUrlhomelogin);
		    System.out.println("Login Link Working Fine");
		    System.out.println("----------------------------------------------------");
	   }
	   public void clickOnSignupButton(){

	       signup.sendKeys(Keys.RETURN);
	       String expectedUrlhomesignup="http://trainermanagement.herokuapp.com/signup";
		    String actualUrlhomesignup =driver.getCurrentUrl();
		    Assert.assertEquals(expectedUrlhomesignup,actualUrlhomesignup);
		    System.out.println(actualUrlhomesignup);
		    System.out.println("Signup Link Working Fine");
		    System.out.println("----------------------------------------------------");
		   

	   }
	   

	   
	
}
