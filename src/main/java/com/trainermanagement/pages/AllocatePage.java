package com.trainermanagement.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class AllocatePage {
	private static String urlallocate="http://trainermanagement.herokuapp.com/admin/searchtrainer";
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
    private WebElement allocation;
	@FindBy(xpath="/html/body/app-root/app-allocation/form/div[3]/div[2]/select")
    private WebElement idcourse;
	@FindBy(xpath="//*[@id=\"batchid\"]")
	private WebElement idbatch;
	@FindBy(xpath="//*[@id=\"scheduletime\"]")
	private WebElement timebox;
	@FindBy(xpath="//*[@id=\"startdate\"]")
	private WebElement dateBox;
	@FindBy(id="enddate")
	private WebElement dateBoxend;
	@FindBy(xpath="/html/body/app-root/app-search-trainer/div/div[1]/input")
	private WebElement search;
	
	@FindBy(id="venue")
	private WebElement venue;
	@FindBy(xpath = "//button[normalize-space()='Allocate']")
   
	private WebElement allocate;
	
	 @FindBy(how=How.XPATH, using="//a[@routerlink='logout']")
	    
	private WebElement logoutallocate;
	public AllocatePage(WebDriver driver){
        this.driver = driver;
       
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	public void search() {
		driver.findElement(By.xpath("/html/body/app-root/app-search-trainer/div/div[1]/input")).sendKeys("mer");
		search.clear();
		System.out.println("Searchbox working fine");
		
	}
	
	
	   public void clickAllocation(){
		   
	       allocation.click();
	       driver.findElement(By.xpath("/html/body/app-root/app-search-trainer/div/div[2]/table/tbody/tr[1]/td[10]/a")).click();
	       
	        } 
	   public void clickcourse() {
		   idcourse.click();
		   //courses.click();
		   
		   Select courses = new Select(driver.findElement(By.id("courseid")));
			courses.selectByVisibleText("FSD");
	   }
	   
	   public void clickbatch() {
		   idbatch.click();
		   //courses.click();
		   
		   Select courses = new Select(driver.findElement(By.id("batchid")));
			courses.selectByVisibleText("FSD001");
	   }
	   public void clicktime() {
		  
	    
	       timebox.sendKeys("10:45AM");
	       
	   }
		  
	        public void startdate(String date1) throws InterruptedException {
	       
	        	/*Date date = new Date();
		       	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		       	String formattedDate = sdf.format(date);
		       	dateBox.sendKeys(formattedDate);
		       	System.out.println(formattedDate);*/
	        	dateBox.sendKeys("04-10-2022");
	        	
	        }
	        public void enddate(String date2) throws InterruptedException {
	   
	        	/*Date date = new Date();
		       	SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		       	String formattedDate = sdf.format(date);
		       	dateBoxend.sendKeys(formattedDate);
		       	System.out.println(formattedDate);*/
	        	dateBoxend.sendKeys("05-11-2022");
	        	
	        	

	   }
	 //Set user name in textbox
	    public void setvenue(String strvenue){
	    	venue.sendKeys("https://meet.google.com/wth-wtcp-goe"); 
	    	
	    	
	    }
	   public void clickallocate()  {
	
		   allocate.sendKeys(Keys.RETURN);
		   
		    
	   }
	  
	   public void clickLogoutAdmin() {
		   
		 
		   logoutallocate.sendKeys(Keys.RETURN);
	   }  

}
