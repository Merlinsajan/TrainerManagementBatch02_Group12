package com.trainermanagement.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VarifyLoginPage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/app-root/app-login/main/form/h1")
	   private WebElement heading;
	@FindBy(xpath = "//*[@id=\"navbarNav\"]/ul/li[2]/a")
	   private WebElement Login;
	public VarifyLoginPage (WebDriver driver){
	       this.driver=driver;

	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	public boolean isPageOpened(){
	       return heading.getText().toString().contains("Please sign in");
	   }
	public void clikOnLogin(){
	       Login.click();
	   }

}
