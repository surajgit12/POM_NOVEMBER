package com.voyager.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.voyager.qa.base.TestBase;


public class ViewMemberDetailsPage extends TestBase {

	  @FindBy(xpath = "//span[text() ='VIEW MEMBER DETAIL - DFBRTH, FGRTRD']")
	  WebElement ViewMemberFirstNameLastNametext;
	  
	  @FindBy(xpath ="//a[contains(text(),'Edit Member')]")
	  @CacheLookup
	  WebElement editmemberlink;
	  
	  @FindBy(name = "saveButton")
	  @CacheLookup
	  WebElement svbtn;
	  
	  @FindBy(xpath ="//font[@class = 'form' and @color = 'green']")
	  @CacheLookup
	   WebElement successmsg;
	  
	  /*@FindBy(xpath = "//a[contains(text(),'Queue 72 4Rx')]")
	  WebElement Queue72link;*/
	  
	  @FindBy(id = "queue72Rx")  //queue 72 tx link
	
	  WebElement Queue72link;
	  
	  @FindBy(name = "selectedMembers")

	  WebElement selectcheckbx;  // 72RX pane select memeber
	  
	  
	  @FindBy(name = "saveButton")

	  WebElement continuelink;  // 72RX pane consist of continue button
	  
	  @FindBy(xpath ="//a[contains(text(),'72 - 4RX')]")

	  WebElement a72Rxlink;
	  
/*	  @FindBy(xpath ="//a[contains(text(),'Special Status')]") // special status section
	  WebElement specialstatuslink;*/
	  
	  @FindBy(xpath ="//a[@href = '#status' and @onclick= 'displayBlock(3);']") /// special status section
	  WebElement specialstatuslink;
	  
	  @FindBy(xpath ="//a[@href ='javascript:updateUncoveredMonths();']")

	  WebElement uncoveredmonthlink;
	  
	  @FindBy(id = "effectiveDate")

	  WebElement effdate;

/*	  @FindBy(id = "uncoveredMonths")
	  WebElement uncoveredmonthtext;*/
	  
	  @FindBy(xpath = "//input[@id = 'uncoveredMonths' and @name = 'uncoveredMonths'and @type  ='text']") // uncovered month section

	  WebElement uncoveredmonthtext;
	  
	  @FindBy(name = "ccIndicator")

	  WebElement ccindicatorvalue; 
	  
	  @FindBy(xpath = "//button[@class = 'btn primary save-dialog' and @type = 'button']")
	
	  WebElement sumbitlink;
	  
	  @FindBy(id = "memberDetailPage")

	  WebElement memberidlink;
	  
	  @FindBy(xpath ="//a[@href = '#transactions' and @onclick= 'displayBlock(2);']") // cms transaction section
	
	  WebElement cmstranslink;
	  
	  @FindBy(xpath ="//a[contains(text(),'73 - NUNCMO')]") // after queued 73 transaction link

	  WebElement a73Rxlink;
	  
	  
	  @FindBy(xpath= "//a[@id ='queue74Eghp' and @class = 'LeftSubMenu']")  // queue 74 eghp tx link
	
	  WebElement queue74Eghplink;
	  
	  
	  @FindBy(xpath = "//button[@id ='cmdSave' and @class = 'btn primary save-dialog' and @value ='Save']")  // save button for 74EGHP 
	
	  WebElement svbtn74;
	  
	  @FindBy(xpath ="//a[contains(text(),'74 - EGHP')]") // 74 - EGHP link present in Election/Corrections Transactions

	  WebElement a74Rxlink;
	  
	  @FindBy(xpath= "//a[@id ='queue74Premium' and @class = 'LeftSubMenu']")  // queue 78 Tx link

	  WebElement queue78link;
	  
	  @FindBy(xpath = "//button[@id ='cmdSave' and @class = 'btn primary save-dialog' and @value ='Save']")  // save button for 78 Tx

	  WebElement svbtn78; 
	  
	  @FindBy(xpath ="//a[contains(text(),'78 - PREM CHG')]") // 78 Tx link present in Election/Corrections Transactions

	  WebElement a78Rxlink;
	  
	  @FindBy(xpath= "//a[@id ='queue90Transaction' and @class = 'LeftSubMenu']")  // queue 90 Tx link
	  
	  WebElement queue90link;
	  
	  @FindBy(name = "contract")  // Queue 90 Transaction fields

	  WebElement contractdropdown; 
	  
	  @FindBy(name = "updateDeleteFlag")  // Queue 90 Transaction fields

	  WebElement updatedeleteflagdropdown; 
	  
	  @FindBy(name = "posDrugEditStatus")  // Queue 90 Transaction fields

	  WebElement posdrugeditstatusdropdown; 
	  
	  @FindBy(name = "posDrugEditClass")  // Queue 90 Transaction fields

	  WebElement posdrugeditclassdropdown; 
	  
	  @FindBy(name = "posDrugEditCode")  // Queue 90 Transaction fields

	  WebElement posdrugeditcodedropdown; 
	  
	  @FindBy(xpath = "//input[@id = 'notificationDate' and @name = 'notificationDate'and @type  ='text']") // Queue 90 Transaction fields

	  WebElement notificationdatepicker;
	  
	  @FindBy(xpath = "//button[@name ='save' and @type ='button']")  // save button for 90 Tx

	  WebElement svbtn90; 
	  
	  @FindBy(xpath ="//a[contains(text(),'90 - OPI')]") // 90 Tx link present in Election/Corrections Transactions
	  WebElement a90Rxlink;
	  
	  @FindBy(xpath ="//font[contains(text(),'LICS Information is updated successfully.')]") //LIS update success message with Green
	  WebElement lisupdatesuccessmsg;
	  
	  @FindBy(xpath ="//font[contains(text(),'Premium Withhold Details have been updated successfully')]") //PWO update success message with Green
	  WebElement pwoupdatesuccessmsg;
	  
	  @FindBy(xpath ="//font[contains(text(),'LEP Information is updated successfully.')]") //LEP update success message with Green
	  WebElement lepupdatesuccessmsg;

	  @FindBy(xpath ="//font[contains(text(),'Member DISABILITYINDICATOR Details have been updated successfully.')]") //Disabled update success message with Green
	  WebElement disabledupdatesuccessmsg;
	  
	  
	  // Special status Web Elements
	  
	  @FindBy(xpath ="//a[@href ='javascript:updateLICS();']") // LIS Update link
	  WebElement lisupdatelink;
	  
	  @FindBy(xpath ="//a[contains(@onclick,'PREMWITHOPTION')]") // PWO Update link
	  WebElement pwoupdatelink;
	  
	  @FindBy(xpath = "//a[@href = 'javascript:updateLEP();']") // LEP Update link
	  WebElement lepupdatelink;
	  
	  @FindBy(xpath = "//a[contains(@onclick,'DISABILITYINDICATOR')]") // Disabled History Update link
	  WebElement disabledupdatelink;
	  
	 
	  
		// Initializing the page object
				public ViewMemberDetailsPage() {
				PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)
					
				}
				
				
				
				
				
	     public boolean VerifyCorrectfirstLastnametext() {
                 return ViewMemberFirstNameLastNametext.isDisplayed();
			 }	
	     
	     
	     public boolean VerifyEditMember() throws InterruptedException {
	    	 
	    	 editmemberlink.click();
	    	 Thread.sleep(2000);
	    	 svbtn.click();
	    	 Thread.sleep(5000);
	    	 return successmsg.isDisplayed();
	     }
	     
        public boolean VerifyQueue72Rxlink() throws InterruptedException {
	    	 
        	 Queue72link.click();
        	 Thread.sleep(5000);
        	 selectcheckbx.click();
        	 Thread.sleep(5000);
        	 continuelink.click();
        	 Thread.sleep(8000);
	    	 a72Rxlink.isDisplayed();
	    	 return true;
	     }
	     
        public boolean VerifyUncoveredMonth() throws InterruptedException {
        	
        	specialstatuslink.click();
        	Thread.sleep(2000);
        	uncoveredmonthlink.click();
        	Thread.sleep(2000);
        	effdate.sendKeys("11/01/2018");
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
   		    jse1.executeScript("document.getElementById('ccIndicator').focus();");
   		    Thread.sleep(2000);
   		    uncoveredmonthtext.sendKeys("5");
   		    Thread.sleep(2000);
   		    Select select = new Select(driver.findElement(By.name("ccIndicator")));
		    select.selectByIndex(2);
		    sumbitlink.click();
		    Thread.sleep(2000);
		    memberidlink.click(); 
		    Thread.sleep(5000);
		    cmstranslink.click();
		    Thread.sleep(2000);
		    a73Rxlink.isDisplayed();
		    return true;
		    
        }
	     
	     
        public boolean VerifyQueue74Rxlink() throws InterruptedException {
        	
        	Thread.sleep(3000);
        	queue74Eghplink.click();
        	Thread.sleep(2000);
        	svbtn74.click();
        	Thread.sleep(5000);
            cmstranslink.click();
    	    Thread.sleep(2000);
        	a74Rxlink.isDisplayed();
        	return true;
        	
        }
	     
      public boolean VerifyQueue78Rxlink() throws InterruptedException {
        	
        	Thread.sleep(3000);
        	queue78link.click();
        	Thread.sleep(2000);
        	svbtn78.click();
        	Thread.sleep(5000);
            cmstranslink.click();
    	    Thread.sleep(2000);
    	    a78Rxlink.isDisplayed();
        	return true;
        	
        }
	   
      public boolean VerifyQueue90Rxlink() throws InterruptedException {
    	  
       	  Thread.sleep(3000);
    	  queue90link.click();
      	  Thread.sleep(2000);
      	  
      	  Select select = new Select(driver.findElement(By.name("contract")));
      	  select.selectByIndex(2);
    	  
      	  Select select1 = new Select(driver.findElement(By.name("updateDeleteFlag")));
      	  select1.selectByIndex(1);
      	  
      	  Select select2 = new Select(driver.findElement(By.name("posDrugEditStatus")));
    	  select2.selectByIndex(2);
    	  
    	  Select select3 = new Select(driver.findElement(By.name("posDrugEditClass")));
    	  select3.selectByIndex(0);
    	  
    	  Select select4 = new Select(driver.findElement(By.name("posDrugEditCode")));
    	  select4.selectByIndex(1);
    	  
    	  notificationdatepicker.sendKeys("11/01/2018");
    	  JavascriptExecutor jse1 = (JavascriptExecutor) driver;
 		  jse1.executeScript("document.getElementById('planAssignedTransactionTrackingId').focus();");
 		  Thread.sleep(2000);
 		  svbtn90.click();
 		  Thread.sleep(5000);
          cmstranslink.click();
 	      Thread.sleep(2000);
 	      a90Rxlink.isDisplayed();
 	      return true;
 	      
      }
	     
      
      public LisUpdatePage VefifyLowIncomeSubsidypage() throws InterruptedException {
    	  Thread.sleep(5000);
    	  specialstatuslink.click();
    	  Thread.sleep(3000);
    	  lisupdatelink.click();
    	  Thread.sleep(3000);
		  return new LisUpdatePage();
	  }
      
      public PWOUpdatePage VefifyPremiumWithholdOptionPage() throws InterruptedException {
    	  Thread.sleep(5000);
    	  specialstatuslink.click();
    	  Thread.sleep(3000);
    	  pwoupdatelink.click();
    	  Thread.sleep(3000);
		  return new PWOUpdatePage();
	  }
      
      public LEPUpdatePage VefifyLEPUpdatePage() throws InterruptedException {
    	  Thread.sleep(5000);
    	  specialstatuslink.click();
    	  Thread.sleep(3000);
    	  lepupdatelink.click();
    	  Thread.sleep(3000);
		  return new LEPUpdatePage();
	  }
      
      public  DisabledHistoryPage VefifyDisabledUpdatePage() throws InterruptedException {
    	  Thread.sleep(5000);
    	  specialstatuslink.click();
    	  Thread.sleep(3000);
    	  lepupdatelink.click();
    	  Thread.sleep(3000);
		  return new DisabledHistoryPage();
	  }
      
      
      public boolean Verifylisupdatesuccessmsg() {
    	  
         return lisupdatesuccessmsg.isDisplayed();
      
    	 }
      
      public boolean Verifypwoupdatesuccessmsg() {
    	  
          return pwoupdatesuccessmsg.isDisplayed();
       
     	 }
      
      public boolean Verifylepupdatesuccessmsg() {
    	  
          return lepupdatesuccessmsg.isDisplayed();
       
     	 }
      
      public boolean VerifyDisabledupdatesuccessmsg() {
    	  
          return disabledupdatesuccessmsg.isDisplayed();
       
     	 }
      
}
