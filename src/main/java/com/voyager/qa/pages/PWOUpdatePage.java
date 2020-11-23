package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.voyager.qa.base.TestBase;

public class PWOUpdatePage extends TestBase {

	

	  /* @FindBy(name ="specialstatusList")
	   WebElement specialstatuslistoption;
	   */
	   @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[2]/table[1]/tbody/tr[2]/td[1]/select")
	   WebElement specialstatuslistoption;
	
	   @FindBy(id ="effectiveDate0")
	   WebElement effdate0;
	   
	   @FindBy(id ="endDate0")
	   WebElement enddate0;
	   
	   @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[2]/table[2]/tbody/tr[2]/td[1]/select")
	   WebElement specialstatuslistoption1;
	   
	   
	   @FindBy(id ="effectiveDate1")
	   WebElement effdate1;
	   
	   @FindBy(id ="endDate1")
	   WebElement enddate1;
	   
	   @FindBy(xpath= "//button[@name ='button2']")
	   WebElement pwosvbtn;
	   
	   
	// Initializing the page object
	public PWOUpdatePage() {
		PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)			
		    }
					
	   
	    public void PWOUpdatePages(String eff0, String end0, String eff1, String end1 ) throws InterruptedException {
		    	  
	    	      Thread.sleep(5000);
		    	  Select select = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/table[1]/tbody/tr[2]/td[1]/select")));
		 		 // select.selectByVisibleText(specialstatus0);
		 		  select.selectByIndex(1);
		 		  
		 		  effdate0.clear(); 
		 		  effdate0.sendKeys(eff0);
		    	  JavascriptExecutor jse = (JavascriptExecutor) driver;
				  jse.executeScript("document.getElementById('endDate0').focus();");
				  Thread.sleep(5000);
				   
				  enddate0.sendKeys(end0);
		    	  JavascriptExecutor jse1 = (JavascriptExecutor) driver;
				  jse1.executeScript("document.getElementById('queue75OptionList').focus();");
				  Thread.sleep(5000);
				   
				  Select select1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/table[2]/tbody/tr[2]/td[1]/select")));
		 		  //select1.selectByVisibleText(specialstatus1);
		 		  select1.selectByIndex(2);
		 		   
		 		  effdate1.sendKeys(eff1);
		    	  JavascriptExecutor jse2 = (JavascriptExecutor) driver;
				  jse2.executeScript("document.getElementById('endDate1').focus();");
				  Thread.sleep(5000);
				   
				  enddate1.sendKeys(end1);
		    	  JavascriptExecutor jse3 = (JavascriptExecutor) driver;
				  jse3.executeScript("document.getElementById('queue75OptionList').focus();");
				  Thread.sleep(5000);
	   
				  pwosvbtn.click();

	   
	   
			 }
	   
}
