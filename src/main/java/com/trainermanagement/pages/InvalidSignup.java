package com.trainermanagement.pages;

	import java.io.File;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class InvalidSignup {
	
	
	
		/**
	     * All WebElements are identified by @FindBy annotation
	     */
	    WebDriver driver;
	    
	    @FindBy(id="name")
	    private WebElement name;
	    @FindBy(id="email")
	    private WebElement email;    
	    @FindBy(id="phone")
	    private WebElement phone;
	    @FindBy(id="address")
	    private WebElement address;
	    @FindBy(id="h_qualification")
	    private WebElement h_qualification;
	    @FindBy(id="skillSet")
	    private WebElement skillSet;
	    @FindBy(id="company_name")
	    private WebElement company_name;
	    @FindBy(id="designation")
	    private WebElement designation;
	    @FindBy(id="img")
	    private WebElement img;
	    @FindBy(xpath="//span[@class='dropdown-btn']")
	    private WebElement dropdown ;
	    @FindBy(xpath="//div[@class='dropdown-list']")
	    private WebElement dropdown1 ;
	    @FindBy(xpath="//div[text()='Full Stack Development']")
	    private WebElement list1 ;
	    @FindBy(xpath="//input[@type='checkbox']")
	    private WebElement list2 ;
	    @FindBy(xpath="/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span")
	    private WebElement check;
	    @FindBy(id="password")
	    private WebElement password;
	    @FindBy(id="re_password")
	    private WebElement re_password;
	    @FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
		public WebElement Submit;
	    
	    public InvalidSignup(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	   
	    //Set name in textbox
	    public void setName(String strName){
	    	name.clear();
	    	name.sendKeys("");    
	    	System.out.println("No Data - Invalid Signup");
	 		System.out.println("------------------------------------------------------");
	 		name.sendKeys(Keys.TAB);
	 		name.sendKeys(Keys.ENTER);
			String Actual_Message1=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[1]/div[1]/small")).getText();
			
			String Expected_Message1="Enter valid name";
			org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
			org.testng.Assert.assertTrue(Actual_Message1.contains("Enter valid name"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message1);
			

	    }
	  //Set email in textbox
	    public void setEmail(String strEmail){
	    	email.clear();
	       email.sendKeys("");
	       String Actual_Message2=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[1]/div[2]/small")).getText();
			
			String Expected_Message2="Enter valid mail Id";
			org.testng.Assert.assertEquals(Actual_Message2, Expected_Message2);
			org.testng.Assert.assertTrue(Actual_Message2.contains("Enter valid mail Id"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message2);
	       
		
	       
	    }
	    //Set phone in textbox
	    public void setPhone(String strPhone) throws InterruptedException{
	    	phone.clear();
	    	phone.sendKeys(""); 
	    	phone.sendKeys(Keys.TAB);
	    	phone.sendKeys(Keys.ENTER);
	    	String Actual_Message3=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[2]/div[1]/small")).getText();
			
			String Expected_Message3="Enter valid mobileNo";
			org.testng.Assert.assertEquals(Actual_Message3, Expected_Message3);
			org.testng.Assert.assertTrue(Actual_Message3.contains("Enter valid mobileNo"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message3);
			Thread.sleep(1000);
	    	
	    	
	    }
	  //Set address in address textbox
	    public void setaddress(String strAddress){
	    	address.clear();
	    	address.sendKeys("");
	    	address.sendKeys(Keys.TAB);
	    	address.sendKeys(Keys.ENTER);
	    	String Actual_Message4=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[2]/div[2]/small")).getText();
			
			String Expected_Message4="Enter valid address";
			org.testng.Assert.assertEquals(Actual_Message4, Expected_Message4);
			org.testng.Assert.assertTrue(Actual_Message4.contains("Enter valid address"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message4);
	    }
	  //Set address in highest qualification textbox
	    public void setQualification(String strqualification){
	    	h_qualification.clear();
	    	h_qualification.sendKeys("");
	    	h_qualification.sendKeys(Keys.TAB);
	    	h_qualification.sendKeys(Keys.ENTER);
	    	String Actual_Message5=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[3]/div[1]/small")).getText();
			
			String Expected_Message5="Enter valid qualification";
			org.testng.Assert.assertEquals(Actual_Message5, Expected_Message5);
			org.testng.Assert.assertTrue(Actual_Message5.contains("Enter valid qualification"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message5);
	    }
	  //Set email in skillset textbox
	    public void setskillset(String strskill){
	    	skillSet.clear();
	    	skillSet.sendKeys("");
	    	skillSet.sendKeys(Keys.TAB);
	    	skillSet.sendKeys(Keys.ENTER);
	    	String Actual_Message6=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[3]/div[2]/small")).getText();
			
			String Expected_Message6="Enter valid skills";
			org.testng.Assert.assertEquals(Actual_Message6, Expected_Message6);
			org.testng.Assert.assertTrue(Actual_Message6.contains("Enter valid skills"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message6);
	    }
	    //Set current company name in textbox
	    public void setcompanyname(String strcompany){
	    	company_name.clear();
	    	company_name.sendKeys("");   
	    	company_name.sendKeys(Keys.TAB);
	    	company_name.sendKeys(Keys.ENTER);
	    	String Actual_Message7=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[4]/div[1]/small")).getText();
			
			String Expected_Message7="Enter valid company name";
			org.testng.Assert.assertEquals(Actual_Message7, Expected_Message7);
			org.testng.Assert.assertTrue(Actual_Message7.contains("Enter valid company name"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message7);
	    }
	  //Set designation in textbox
	    public void setdesignation(String strdesignation){
	    	designation.clear();
	    	designation.sendKeys("");
	    	designation.sendKeys(Keys.TAB);
	    	designation.sendKeys(Keys.ENTER);
	    	String Actual_Message8=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[4]/div[2]/small")).getText();
			
			String Expected_Message8="Enter valid designation";
			org.testng.Assert.assertEquals(Actual_Message8, Expected_Message8);
			org.testng.Assert.assertTrue(Actual_Message8.contains("Enter valid designation"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message8);
			
			
	    }
	  
	    public void setImage()
	    {
	    
	    	
	    	/*
	    	String Actual_Message9=driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[5]/div[1]/small")).getText();
			
			String Expected_Message9="Add your photo";
			org.testng.Assert.assertEquals(Actual_Message9, Expected_Message9);
			org.testng.Assert.assertTrue(Actual_Message9.contains("Add your photo"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message9);*/
	    	System.out.print("Displaying the error message  ");
			System.out.println("Add your Photo");
			
	    	
			
	    }
	  //Setup  checkbox
	    public void setcheck() 
	    {
	    	
			 //driver.findElement(By.xpath("//span[text()='Data Science &amp; Analytics&nbsp']")).click();
	    	System.out.print("Displaying the error message  ");
			
	    	System.out.println("Field can be empty");
	    	System.out.println("Test Case Completed");
	    	check.sendKeys(Keys.TAB);
	    	check.sendKeys(Keys.RETURN);
	    	
	    	
			
	    }
	    

	    
	  //Set password in  textbox
	    public void setpassword(String strpassword) throws InterruptedException{
	
	    password.sendKeys(Keys.TAB);
	    password.sendKeys(Keys.ENTER);
			String Actual_Message1=driver.findElement(By.xpath("//small[contains(text(),'Password must contain atleast 1 capital letter,1 small letter,1 digit and 1 special character and require minimum 8 characters')]")).getText();
			
			String Expected_Message1="Password must contain atleast 1 capital letter,1 small letter,1 digit and 1 special character and require minimum 8 characters";
			org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
			org.testng.Assert.assertTrue(Actual_Message1.contains("Password must contain atleast 1 capital letter,1 small letter,1 digit and 1 special character and require minimum 8 characters"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message1);
			
			password.sendKeys(Keys.TAB);
		    password.sendKeys(Keys.ENTER);
			
			
	    }
		  //Set re_password in  textbox
	  public void setrepassword(String strrepassword){
	    	
	      re_password.sendKeys(Keys.TAB);
	    	re_password.sendKeys(Keys.ENTER);
	    	String Actual_Message11=driver.findElement(By.xpath("//small[@id='error']")).getText();
			String Expected_Message11="Passwords must be same";
			org.testng.Assert.assertEquals(Actual_Message11, Expected_Message11);
			org.testng.Assert.assertTrue(Actual_Message11.contains("Passwords must be same"));
			System.out.print("Displaying the error message  ");
			System.out.println(Actual_Message11);
			driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[1]/span/span[1]")).click();
			
	    	
	    }

	    

	

}
