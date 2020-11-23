package com.voyager.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voyager.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory -Object Repository 
	// @FindBy is equivalent to the driver.findByElement
	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(id = "u2")
	WebElement Btn;
	
	@FindBy(xpath = "//div[@class='logo-login']//img")
	WebElement logo;
	
	// Initializing the page object
	
		public LoginPage() 
		{
			PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)
			
		}
		
		public boolean voygerlogo() {
			
         	 return logo.isDisplayed();
		}
		
	
		public HomePage login(String un, String pwd ) throws InterruptedException 
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			Thread.sleep(3000);
			Btn.click();
			
		    return new HomePage(); // HomePage is landing page of LoginPage

		}
		

}
