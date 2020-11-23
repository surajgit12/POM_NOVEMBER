package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.voyager.qa.base.TestBase;

public class DisabledHistoryPage extends TestBase {
	
	
	@FindBy(name = "specialstatusList") // Disabled History status
	WebElement disabledstatus; 
	
	@FindBy(id = "effectiveDate0") // Disabled History Effective date
	WebElement disabledeffectivedate;
	
	@FindBy(id = "endDate0") // Disabled History End date
	WebElement disabledenddate;
	
	@FindBy(xpath = "//button[@class ='btn primary save-dialog' and @type = 'button']") // Disabled History Save button
	WebElement disabledSavebutton;
	
	
	// Initializing the page object
			public DisabledHistoryPage() {
				PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)			
				    }
		

			   public void VerifyDisabledUpdatePages() throws InterruptedException {
				   
				   Select select  = new Select(driver.findElement(By.name("specialstatusList")));
				   select.selectByIndex(1);
				   Thread.sleep(2000);
				   disabledeffectivedate.clear();
				   disabledeffectivedate.sendKeys("01/01/2018");
				   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
				   jse1.executeScript("document.getElementById('endDate0').focus();");
				   Thread.sleep(5000);
				   disabledenddate.sendKeys("12/31/2018");
				   JavascriptExecutor jse2 = (JavascriptExecutor) driver;
				   jse2.executeScript("document.getElementById('effectiveDate1').focus();");
				   Thread.sleep(5000);
				   disabledSavebutton.click();
			   }
			

}
