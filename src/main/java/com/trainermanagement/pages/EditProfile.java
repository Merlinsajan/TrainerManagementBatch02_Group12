package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {
	
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
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
    private WebElement allocation;
    @FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
    private WebElement logoutpro;
    @FindBy(xpath="/html/body/app-root/app-edit-details-form/form/button")
    private WebElement edit;
    
    public EditProfile(WebDriver driver){
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
    public void clickEditprofile(){
    	edit.sendKeys(Keys.RETURN);

    }
    public void clickAllocation() throws InterruptedException{
        allocation.click();
        
        Thread.sleep(2000);
  } 
    public void clickLogoutpro() {
    	logoutpro.sendKeys(Keys.RETURN);;
    }
}
