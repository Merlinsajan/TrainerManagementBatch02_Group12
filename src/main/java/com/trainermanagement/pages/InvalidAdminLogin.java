package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidAdminLogin {

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
    
    
    public InvalidAdminLogin(WebDriver driver){
        this.driver = driver;
        driver.get(urladmin);
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    //Set user name in textbox
    public void setUserName() throws InterruptedException{
    	
    	driver.findElement(By.id("floatingInput")).sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("mersk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-login/main/form/button")).click();
		Thread.sleep(2000);
		
		
		System.out.println("Testing with Valid Username and Invalid Password");
		System.out.println("------------------------------------------------------");
		String Actual_Message1=driver.findElement(By.xpath("/html/body/app-root/app-login/main/div")).getText();
		
		String Expected_Message1="Invalid Login Credintials";
		org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
		org.testng.Assert.assertTrue(Actual_Message1.contains("Invalid Login Credintials"));
		System.out.println(Actual_Message1);
		System.out.println("Test Case Completed");
		driver.navigate().refresh();
    	
    }
  //Set password in password textbox
    public void setPassword() throws InterruptedException{
    	driver.findElement(By.id("floatingInput")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(2000);
		
		System.out.println("Testing with Invalid Username and valid Password");
		System.out.println("------------------------------------------------------");
		String Actual_Message1=driver.findElement(By.xpath("/html/body/app-root/app-login/main/form/div[1]/small")).getText();
		
		String Expected_Message1="Enter valid mail Id";
		org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
		org.testng.Assert.assertTrue(Actual_Message1.contains("Enter valid mail Id"));
		System.out.println(Actual_Message1);
		System.out.println("Test Case Completed");
		driver.navigate().refresh();
     }
    
 
  //Click on login button
  
   public void clickLogin() throws InterruptedException{
	   driver.findElement(By.id("floatingInput")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Merlin");
		Thread.sleep(2000);
		
		System.out.println("Testing with Invalid Username and Invalid Password");
		System.out.println("------------------------------------------------------");
		String Actual_Message1=driver.findElement(By.xpath("/html/body/app-root/app-login/main/form/div[1]/small")).getText();
		
		String Expected_Message1="Enter valid mail Id";
		org.testng.Assert.assertEquals(Actual_Message1, Expected_Message1);
		org.testng.Assert.assertTrue(Actual_Message1.contains("Enter valid mail Id"));
		System.out.println(Actual_Message1);
		System.out.println("Test Case Completed");
    }  

	
}
