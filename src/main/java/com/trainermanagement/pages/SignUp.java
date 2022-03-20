package com.trainermanagement.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUp {
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
    @FindBy(name="skillSet")
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
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id="re_password")
    private WebElement re_password;
    @FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
	public WebElement Submit;
    
    public SignUp(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //Set name in textbox
    public void setName(String strName){
    	name.clear();
    	name.sendKeys(strName);     
    }
  //Set email in password textbox
    public void setEmail(String strEmail){
    	email.clear();
       email.sendKeys(strEmail);
    }
    //Set phone in textbox
    public void setPhone(String strPhone){
    	phone.clear();
    	phone.sendKeys(strPhone);     
    }
  //Set address in address textbox
    public void setaddress(String strAddress){
    	address.clear();
    	address.sendKeys(strAddress);
    }
  //Set address in highest qualification textbox
    public void setQualification(String strqualification){
    	h_qualification.clear();
    	h_qualification.sendKeys(strqualification);
    }
  //Set email in skillset textbox
    public void setskillset(String strskill){
    	skillSet.clear();
    	skillSet.sendKeys(strskill);
    }
    //Set current company name in textbox
    public void setcompanyname(String strcompany){
    	company_name.clear();
    	company_name.sendKeys(strcompany);     
    }
  //Set designation in textbox
    public void setdesignation(String strdesignation){
    	designation.clear();
    	designation.sendKeys(strdesignation);
    }
  /*  //Set Profile photo
    public void setprofilepic() {
    File file = new File(getClass().getClassLoader().getResource("Profile_Picture.png").getFile());
    String imagePath = file.getAbsolutePath();
    WebElement chooseFile3 = driver.findElement(By.id("img"));
    chooseFile3.sendKeys(imagePath);
    }*/
    public void setImage(String strimg)
    {
    	img.sendKeys("D:\\Selenium_Project\\Trainer Management backup-18-03-2022\\src\\test\\resources\\panda.jpg");
    }
  //Setup  checkbox
    public void setcheck() 
    {
   
    	dropdown.click();
    	//dropdown1.click();
    	list1.click();
    	//list2.click();*/
    	
		dropdown1.click();
		/*list2.click();
		list2.sendKeys(Keys.TAB);
		list2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();*/

	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("//span[text()='Data Science &amp; Analytics&nbsp']")).click();
		
		
    }
    
  //Set password in  textbox
    public void setpassword(String strpassword){
    	
    	
    	password.sendKeys("Merlin@1");
    }
  //Set re_password in  textbox
    public void setrepassword(String strrepassword){
    
    	re_password.sendKeys("Merlin@1");
    }
  //Click on signup button
    public void clickSignUp(){
    	Submit.sendKeys(Keys.RETURN);
    	
            
    }  
    

}