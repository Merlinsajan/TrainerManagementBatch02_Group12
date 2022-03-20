package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Footer {
	WebDriver driver;
	private static String url="http://trainermanagement.herokuapp.com";
	
	@FindBy(how=How.XPATH,using="//img[@src='https://i.ibb.co/x7P24fL/facebook.png']")
	private WebElement fb;
	@FindBy(xpath="//img[@src='https://i.ibb.co/Wnxq2Nq/twitter.png']")
	private WebElement twitter;
	@FindBy(xpath="//img[@src='https://i.ibb.co/ySwtH4B/instagram.png']")
	public WebElement insta;
	
	public Footer(WebDriver driver){
	       this.driver=driver;
	       driver.get(url);
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	
	public void clickOnfacebookicon() {
		   
		
		 /*  WebElement fb=driver.findElement(By.xpath("//img[@src='https://i.ibb.co/x7P24fL/facebook.png']"));
		   WebElement element = driver.findElement(By.xpath("//img[@src='https://i.ibb.co/x7P24fL/facebook.png']"));
		   if (element.isDisplayed() && element.isEnabled()) {
		       element.click();
		   }*/
		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://i.ibb.co/x7P24fL/facebook.png']")));
		       System.out.println("Element is clickablefb");
			    System.out.println("Couldn't find the correct link of Facebook");
			   
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		    
		   
	   }
	   public void clickOntwittericon() {
		  /* WebElement element = driver.findElement(By.xpath("//img[@src='https://i.ibb.co/Wnxq2Nq/twitter.png']"));
		   if (element.isDisplayed() && element.isEnabled()) {
		       element.click();
		   }*/
		   try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://i.ibb.co/Wnxq2Nq/twitter.png']")));
		       System.out.println("Element is clickabletwitter");
		       System.out.println("Couldn't find the correct link of Twitter");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		   
		   
	   }
	   public void clickOninstaicon() {
		  /* WebElement element = driver.findElement(By.xpath("//img[@src='https://i.ibb.co/ySwtH4B/instagram.png']"));
		   if (element.isDisplayed() && element.isEnabled()) {
		       element.click();
		   }*/
		   try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://i.ibb.co/ySwtH4B/instagram.png']")));
		       System.out.println("Element is clickable Instagram");
		       System.out.println("Couldn't find the correct link of Instagram");
		       
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		  
		   
	   }
}
