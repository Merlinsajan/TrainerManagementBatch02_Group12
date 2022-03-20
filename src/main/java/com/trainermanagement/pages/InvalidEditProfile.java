package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidEditProfile {
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
    @FindBy(name="skillSet")
    private WebElement skillSet;
    @FindBy(id="company_name")
    private WebElement company_name;
    @FindBy(id="designation")
    private WebElement designation;
    /*@FindBy(id="img")
    private WebElement img;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
    private WebElement allocation;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement logoutpro;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/button")
    private WebElement edit;*/
    
    public void InvalidEditprofile(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    public void invalideditdata() {
    	System.out.println("No Data");
 		System.out.println("------------------------------------------------------");
    }
    //Set name in textbox
    public void setNameinvalid(String strName){
    
    	
 		name.clear();
    	name.sendKeys(strName); 
String Actual_Message1=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[1]/div[1]/small")).getText();
		
		String Expected_Message1="Enter valid name";
		org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
		org.testng.Assert.assertTrue(Actual_Message1.contains("Enter valid name"));
		System.out.print("Displaying the error message  ");
		System.out.println(Actual_Message1);
    }
  //Set email in password textbox
    public void setEmail(String strEmail){
    	
       email.sendKeys(strEmail);
       String Actual_Message2=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[1]/div[2]/small")).getText();
		
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
    	String Actual_Message3=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[2]/div[1]/small")).getText();
		
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
    	String Actual_Message4=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[2]/div[2]/small")).getText();
		
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
    	String Actual_Message5=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[3]/div[1]/small")).getText();
		
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
    	String Actual_Message6=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[3]/div[2]/small")).getText();
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
    	String Actual_Message7=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[4]/div[1]/small")).getText();
		
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
    	String Actual_Message8=driver.findElement(By.xpath("/html/body/app-root/app-edit-details-form/form/div[4]/div[2]/small")).getText();
		
		String Expected_Message8="Enter valid designation";
		org.testng.Assert.assertEquals(Actual_Message8, Expected_Message8);
		org.testng.Assert.assertTrue(Actual_Message8.contains("Enter valid designation"));
		System.out.print("Displaying the error message  ");
		System.out.println(Actual_Message8);
		
    }

}
