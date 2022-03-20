package com.trainermanagement.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.trainermanagement.constants.AutomationConstants;
import com.trainermanagement.pages.AdminLogin;
import com.trainermanagement.pages.AllocatePage;
import com.trainermanagement.pages.EditProfile;
import com.trainermanagement.pages.Footer;
import com.trainermanagement.pages.HomePage;
import com.trainermanagement.pages.InvalidAdminLogin;
import com.trainermanagement.pages.InvalidEditProfile;
import com.trainermanagement.pages.InvalidLogin;
import com.trainermanagement.pages.LoginPage;
import com.trainermanagement.pages.SignUp;
import com.trainermanagement.pages.ValidSignUp;
import com.trainermanagement.pages.InvalidSignup;
import com.trainermanagement.utilities.ExcelUtility;

public class TestClass extends TestBase {
	
	HomePage objhome;
	Footer objfooter;
	LoginPage objLogin;
	SignUp objSignup;
	EditProfile objprofile;
	AdminLogin objAdminlogin;
	AllocatePage objAllocate;
	InvalidSignup objinvalidsignup;
	InvalidLogin objinvalidlogin;
	ValidSignUp objSignUp;
	InvalidEditProfile objinvalidedit;
	InvalidAdminLogin objinvalidadminlogin;
	@Test(priority=1)
	public void homepage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a")).click();
		objhome=new HomePage(driver);
		objhome.clickhome();
		Thread.sleep(1000);
		objhome.clickOnSignupButton();
		Thread.sleep(1000);
		objhome.clickOnLoginButton();
		Thread.sleep(1000);
	
		System.out.println("Test Case1 Successfully Completed");
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);

	}
	@Test(priority=2)
	public void footer() throws InterruptedException{
		//driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a")).click();
		objfooter=new Footer(driver);
		
		
		objfooter.clickOnfacebookicon();
		Thread.sleep(1000);
		objfooter.clickOninstaicon();
		Thread.sleep(1000);
		objfooter.clickOntwittericon();
		
		System.out.println("Test Case4 Successfully Completed");
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
		Thread.sleep(1000);

	}
	@Test(priority=3)
	public void InvalidAdminLogin() throws IOException, InterruptedException{
		
   //Create Login Page object
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    objinvalidadminlogin = new InvalidAdminLogin(driver);
    //login to application
        

    objinvalidadminlogin.setUserName();
    Thread.sleep(1000);
    objinvalidadminlogin.setPassword();
    Thread.sleep(1000);
    objinvalidadminlogin.clickLogin();
    Thread.sleep(1000);
    System.out.println("Test Case Invalid Admin Login Successfully Completed");
    Thread.sleep(1000);
    
  }
	
	@Test(priority=4)
	public void InvalidLogin() throws IOException, InterruptedException{
		
   //Create Login Page object
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
	    objinvalidlogin = new InvalidLogin(driver);
    //login to application
        

    objinvalidlogin.setUserName();
    objinvalidlogin.setPassword();
    objinvalidlogin.clickLogin();
    System.out.println("Test Case5,6,7,8 Successfully Completed");
    Thread.sleep(1000);
    
  }
	
	@Test(priority=5)
	public void verifyValidLogin() throws IOException, InterruptedException{
		
   //Create Login Page object
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
	    objLogin = new LoginPage(driver);
    //login to application
        
String username = ExcelUtility.getCellData(1,0);
    String password = ExcelUtility.getCellData(2,0);
    objLogin.setUserName(username);
    objLogin.setPassword(password);
    objLogin.clickLogin();
    Thread.sleep(1000);
    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    System.out.println(actualTitle);
    Thread.sleep(2000);
    objLogin.clickAllocation();
    Thread.sleep(1000);
    System.out.println("Test Case9 Trainer Login Successfully Completed");
      
    
  }
		
	
	@Test(priority=6)
	public void editprofile() throws IOException, InterruptedException {
		//clicking my profile button
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a")).click();
		objprofile=new EditProfile(driver);
		//clicking edit profile button
		driver.findElement(By.xpath("/html/body/app-root/app-trainerprofile/div/div/div/div[1]/div/div/button")).click();
		//Editing details
		
	String name = ExcelUtility.getCellData(3,0);
	   objprofile.setName(name);
	   
	    String email = ExcelUtility.getCellData(4,1);
	    objprofile.setEmail(email);
	   String phone = ExcelUtility.getCellData(5,1);
	   objprofile.setPhone(phone);
	    String address = ExcelUtility.getCellData(6,1);
	    objprofile.setaddress(address);
	    String h_qualification = ExcelUtility.getCellData(7,1);
	    objprofile.setQualification(h_qualification);
	    String skillSet = ExcelUtility.getCellData(8,1);
	    objprofile.setskillset(skillSet);
	    String company_name = ExcelUtility.getCellData(9,1);
	    objprofile.setcompanyname(company_name);
	    String designation = ExcelUtility.getCellData(10,1);
	    objprofile.setdesignation(designation);
	    
	    objprofile.setImage("D:\\Selenium_Project\\Trainer Management\\src\\test\\resources\\panda.jpg");
		objprofile.clickEditprofile();
		String expectedUrlpro="http://trainermanagement.herokuapp.com/profile";
	    String actualUrlpro =driver.getCurrentUrl();
	    Assert.assertEquals(expectedUrlpro,actualUrlpro);
	    System.out.println(actualUrlpro);
	    Thread.sleep(1000);
		//objprofile.clickAllocation();
	    //Thread.sleep(1000);
	   objprofile.clickLogoutpro();
		
	    System.out.println("Test Case14,15 Successfully Completed");
		
	}
	
	
	
	
	@Test(priority=7)
	public void verifyValidAdminLogin() throws IOException, InterruptedException{
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
   //Create Login Page object
		
	    objAdminlogin = new AdminLogin(driver);
    //login to application
        

    objAdminlogin.setUserName("admin@gmail.com");
    objAdminlogin.setPassword("1234");
    objAdminlogin.clickLogin();
    Thread.sleep(2000);
  
    //objAdminlogin.clickviewAllocation();
    Thread.sleep(2000);
   
  
    System.out.println("Test Case17 Successfully Completed");
  }
	@Test(priority=8)
	public void verifyAllocatePage() throws IOException, InterruptedException{
		//objAllocate.search();
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
   //Create Login Page object
		
	    objAllocate = new AllocatePage(driver);
    //login to application
	    objAllocate.search();
	    Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-search-trainer/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
        String expectedUrl ="http://trainermanagement.herokuapp.com/admin/allocate";
	       String actualUrl =driver.getCurrentUrl();
	       Assert.assertEquals(expectedUrl,actualUrl);
	       System.out.println(actualUrl);
	       
    
Thread.sleep(2000);
objAllocate.clickcourse();
Thread.sleep(2000);
objAllocate.clickbatch();
Thread.sleep(2000);
objAllocate.clicktime();
Thread.sleep(1000);
objAllocate.startdate("04-10-2022");
Thread.sleep(1000);
objAllocate.enddate("05-11-2022");
objAllocate.setvenue("https://meet.google.com/wth-wtcp-goe");
System.out.println("Test Case18 Successfully Completed");
objAllocate.clickallocate();
System.out.println("Allocation Successful");
Thread.sleep(1000);
objAllocate.clickLogoutAdmin();
System.out.println("Logout Successful");
Thread.sleep(1000);

    
  }

	@Test(priority=9)
	public void varifyInvalidSignup() throws IOException, InterruptedException{
		
   //Create SignUp Page object
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[3]/a")).click();
		objinvalidsignup = new InvalidSignup(driver);
	    
    //SignUp to application
          
    String name = ExcelUtility.getCellData(15,0);
    objinvalidsignup.setName(name);
    Thread.sleep(1000);
    String email = ExcelUtility.getCellData(16,0);
    objinvalidsignup.setEmail(email);
    Thread.sleep(1000);
   String phone = ExcelUtility.getCellData(17,0);
   objinvalidsignup.setPhone(phone);
   Thread.sleep(1000);
    String address = ExcelUtility.getCellData(18,0);
    objinvalidsignup.setaddress(address);
    Thread.sleep(1000);
    String h_qualification = ExcelUtility.getCellData(19,0);
    objinvalidsignup.setQualification(h_qualification);
    Thread.sleep(1000);
    String skillSet = ExcelUtility.getCellData(20,0);
    objinvalidsignup.setskillset(skillSet);
    Thread.sleep(1000);
    String company_name = ExcelUtility.getCellData(21,0);
    objinvalidsignup.setcompanyname(company_name);
    Thread.sleep(1000);
    String designation = ExcelUtility.getCellData(22,0);
    objinvalidsignup.setdesignation(designation);
    Thread.sleep(1000);
   
    
  objinvalidsignup.setImage();
    
    Thread.sleep(1000);
    
    //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    
    
   // Thread.sleep(1000);
   
   objinvalidsignup.setpassword("lll");
   Thread.sleep(1000);
    
    objinvalidsignup.setrepassword("kk");
   Thread.sleep(1000);
   objinvalidsignup.setcheck();
   Thread.sleep(1000);
    
    System.out.println("Test Case19,20,21 Successfully Completed");
	
    String expectedurl ="http://trainermanagement.herokuapp.com/signup";
    String actualurl =driver.getCurrentUrl();
    Assert.assertEquals(expectedurl,actualurl);
    System.out.println(actualurl);
    Thread.sleep(1000);
    driver.navigate().to("http://trainermanagement.herokuapp.com/signup");  
    
  }
	
	
	@Test(priority=10)

	public void signup() throws IOException, InterruptedException{
		Thread.sleep(2000);
   //Create SignUp Page object
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[3]/a")).click();
	    objSignup = new SignUp(driver);
	    
    //SignUp to application
    System.out.println("Checking Valid Signup");
    System.out.println("-----------------------------------------------------");
	        
    String name = ExcelUtility.getCellData(3,0);
    objSignup.setName(name);
    String email = ExcelUtility.getCellData(4,0);
    objSignup.setEmail(email);
   String phone = ExcelUtility.getCellData(5,0);
   objSignup.setPhone(phone);
    String address = ExcelUtility.getCellData(6,0);
    objSignup.setaddress(address);
    String h_qualification = ExcelUtility.getCellData(7,0);
    objSignup.setQualification(h_qualification);
    String skillSet = ExcelUtility.getCellData(8,0);
    objSignup.setskillset(skillSet);
    String company_name = ExcelUtility.getCellData(9,0);
    objSignup.setcompanyname(company_name);
    String designation = ExcelUtility.getCellData(10,0);
    objSignup.setdesignation(designation);
    
    objSignup.setImage("D:\\Selenium_Project\\Trainer Management\\src\\test\\resources\\panda.jpg");
    
  		
  
   
    
    String password =ExcelUtility.getCellData(11, 0);
    objSignup.setpassword("Merlin@1");
    String repassword =ExcelUtility.getCellData(11, 0);
    objSignup.setrepassword("Merlin@1");
    
	Thread.sleep(2000);
	 objSignup.setcheck();
	 objSignup.clickSignUp();
    Thread.sleep(2000);
    System.out.println("Test Case22 Successfully Completed - You are Registered Successfully ");
    Thread.sleep(2000);
    driver.quit();
    
  }
	
	
}
