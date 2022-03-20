package com.trainermanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidSignUp {

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
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="re_password")
	private WebElement re_password;
//	@FindBy(css=".btn btn-primary")
//	private WebElement bttn2;
	
	
	
	@FindBy(xpath="//button[@type='submit]")
	private WebElement bttn11;
	@FindBy(xpath="/html/body/app-root/app-sign-up/form/button")
	private WebElement bttn1;
	
	////span[@class='dropdown-btn']
	//private WebElement password;
	////input[@type='checkbox']
	////div[@class='dropdown-list']
	
	@FindBy(xpath="//span[@class='dropdown-btn']")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[@class='dropdown-list']")
	private WebElement dropdown1;
	
	@FindBy(xpath="//div[text()='Full Stack Development']")
	private WebElement list1;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement list2;
	
	
	//By.cssselector("btn btn-primary")
	//@FindBy(cssselector='btn btn-primary')
//	Driver.Instance.FindElement(By.CssSelector("btn btn-primary"))
	
/*	@FindBy(xpath="//span[@class='dropdown-btn']]")
	private WebElement hide;
	
	
	
	*/
	//@FindBy(className=("button[class='btn btn-lg new-meeting']"))
	
	//@FindBy(how=How.CSS, using="button:contains('Sign Up')") WebElement bttn;
	
	//@FindBy(xpath="//button[text()='Sign Up']")
	//private WebElement bttn;

	
	@FindBy(id="img")
	private WebElement img;
	
	
	public ValidSignUp(WebDriver driver){
	    this.driver = driver;
	    
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	


	public void setName(String strName)
	{
		name.sendKeys(strName);
	}
	public void setQualification(String strQualification){
		h_qualification.sendKeys(strQualification);     
	}
	public void setSkillSet(String strSkill)
	{
		   skillSet.sendKeys(strSkill);
	}

	public void setCompanyName(String strCompanyName)
	{
			company_name.sendKeys(strCompanyName);     
	}
		
	public void setDesignation(String strDesignation)
	{
			designation.sendKeys(strDesignation);
	}
		
	public void setAddress(String strAddress)
		{
		   address.sendKeys(strAddress);
		}

	public void setPhone(String strph)
		{
			   phone.sendKeys(strph);
		}

	public void setEmail(String strrepass)
		{
			email.sendKeys(strrepass);
		}

	public void setPassword(String strpass)
		{
			   password.sendKeys(strpass);
		}

	public void setRePassword(String strrepass)
		{
			re_password.sendKeys(strrepass);
		}
	
	/*public void setProfilePic()
	{
		File file=new File(getClass().getClassLoader().getResource("image.jpg").getFile());
		String imgPath=file.getAbsolutePath();
		WebElement choosefile=driver.findElement(By.id("img"));
		choosefile.sendKeys(imgPath);
	}
	*/
	
	
	public void setImage(String strimg)
	{
		img.sendKeys("D:\\Selenium_Project\\Trainer Management\\src\\test\\resources\\panda.jpg");
		
	}
	public void setButton(){
	//	org.openqa.selenium.Point p= bttn.getLocation();

	//	Actions actions = new Actions(driver);

		//actions.moveToElement(bttn).moveByOffset(p.x,p.y).click().perform();
		
	/*	Actions actions = new Actions(driver);
		actions.moveToElement(bttn).click().perform();   */
		//   bttn2.click();  
		   bttn1.sendKeys(Keys.RETURN);
		 
		   
	}
	public void setDropdown()
	{
		dropdown.click();
		dropdown1.click();
		list1.click();
	//	list2.click();
		//dropdown.click();
		//dropdown1.click();
	//hide.click();
		
	dropdown1.click();
driver.findElement(By.xpath("/html/body/app-root/app-sign-up/form/div[5]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")).click();
	}
	

}
