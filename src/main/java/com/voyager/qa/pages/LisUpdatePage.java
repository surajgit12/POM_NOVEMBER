package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.voyager.qa.base.TestBase;

public class LisUpdatePage extends TestBase {
	
	
	   @FindBy(id ="effectiveDate0")
	   @CacheLookup
	   WebElement effdate0;
	
	   @FindBy(id ="endDate0")
	   @CacheLookup
	   WebElement enddate0;
	
	   @FindBy(id ="subSidy0")
	   @CacheLookup
	   WebElement subsidy0; 
	
	   @FindBy(id ="coPaySelect0")
	   @CacheLookup
	   WebElement copay0;

	   @FindBy(id ="subSidySource0")
	   @CacheLookup
	   WebElement source0;
	   
	   @FindBy(id ="effectiveDate1")
	   @CacheLookup
	   WebElement effdate1;
	
	   @FindBy(id ="endDate1")
	   @CacheLookup
	   WebElement enddate1;
	
	   @FindBy(id ="subSidy1")
	   @CacheLookup
	   WebElement subsidy1; 
	
	   @FindBy(id ="coPaySelect1")
	   @CacheLookup
	   WebElement copay1;

	   @FindBy(id ="subSidySource1")
	   @CacheLookup
	   WebElement source1;
	   
	   @FindBy(xpath= "//button[@class = 'btn primary' and @type ='button']") // Save button lis
	   @CacheLookup
	   WebElement lissavebtn;
	   
	   
	   
	   
		// Initializing the page object
		public LisUpdatePage() {
		PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)			
	    }
				
       public void lisupdate(String eff0, String end0, String sub0, String copay0 , String source0,
    		   String eff1, String end1,String sub1,String copay1,String source1 ) throws InterruptedException {
    	  
    	   effdate0.clear();
    	   effdate0.sendKeys(eff0);
    	   JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("document.getElementById('endDate0').focus();");
		   Thread.sleep(5000);
    	   enddate0.sendKeys(end0);
    	   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		   jse1.executeScript("document.getElementById('subSidy0').focus();");
		   Thread.sleep(5000);
    	   Select select = new Select(driver.findElement(By.id("subSidy0")));
 		   select.selectByVisibleText(sub0);
 		   Select select2 = new Select(driver.findElement(By.id("coPaySelect0")));
 		   select2.selectByVisibleText(copay0);
 		   Select select3 = new Select(driver.findElement(By.id("subSidySource0")));
		   select3.selectByVisibleText(source0);
		   
		   
		   effdate1.sendKeys(eff1);
		   JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		   jse2.executeScript("document.getElementById('endDate1').focus();");
		   Thread.sleep(5000);
		   
		   enddate1.sendKeys(end1);
		   JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		   jse3.executeScript("document.getElementById('subSidy1').focus();");
		   Thread.sleep(5000);
    	   Select select4 = new Select(driver.findElement(By.id("subSidy1")));
 		   select4.selectByVisibleText(sub1);
 		   Select select6 = new Select(driver.findElement(By.id("coPaySelect1")));
 		   select6.selectByVisibleText(copay1);
 		   Select select7 = new Select(driver.findElement(By.id("subSidySource1")));
		   select7.selectByVisibleText(source1);
		   
		   lissavebtn.click();
    	   
       }
	   
	   
	   
	   
	   
}
