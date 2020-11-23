package com.voyager.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voyager.qa.base.TestBase;

public class LEPUpdatePage extends TestBase {
	
	@FindBy(xpath = " //input[@type ='text' and @name ='amt1' and @value = '0.00']") // LEP Amount text
	WebElement lepamounttext;
	
	@FindBy(id = "effectiveDate0") // LEP Amount Effective date
	WebElement lepeffectivedate;
	
	@FindBy(id = "endDate0") // LEP Amount End date
	WebElement lependdate;
	
	@FindBy(xpath = "//button[@class ='btn primary' and @type = 'button']") // LEP Save button
	WebElement lepSavebutton;
	
	
	// Initializing the page object
		public LEPUpdatePage() {
			
			PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)			
			    }
	
	
	
	   public void VerifyLepUpdatePages() throws InterruptedException {
		   
		   lepamounttext.clear();
		   lepamounttext.sendKeys("10.25");
		   Thread.sleep(2000);
		   lepeffectivedate.clear();
		   lepeffectivedate.sendKeys("01/01/2018");
		   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		   jse1.executeScript("document.getElementById('endDate0').focus();");
		   Thread.sleep(5000);
		   lependdate.sendKeys("12/31/2018");
		   JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		   jse2.executeScript("document.getElementById('effectiveDate1').focus();");
		   Thread.sleep(5000);
		   lepSavebutton.click();
		   
	   }
	
	
	
	
	
	

}
