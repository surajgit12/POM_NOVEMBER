package com.voyager.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.voyager.qa.base.TestBase;

public class SearchMembers extends TestBase
{

	  @FindBy(name = "searchType")
	  WebElement selectsearchtype;
	
	  @FindBy(name = "planID")
	  WebElement selectplanid;
	
	  @FindBy(name = "pbp")
	  WebElement selectpbp;
	
	  @FindBy(name = "segment")
	  WebElement selectsegmentnumber;
	 
	  @FindBy(name = "birthDate")
	  WebElement selectbirthDate;
	
	  @FindBy(name = "status")
	  WebElement selectstatus;
	  
	  @FindBy(name = "memEffectiveDate")
	  WebElement selectmemEffectiveDate;
	  
	  @FindBy(name = "genderCode")
	  WebElement selectgenderCode;
	  
	  @FindBy(xpath ="//button[@class ='btn primary save-dialog' and @type = 'button']")
	  WebElement searchmemberbtn;
	  
	  @FindBy(xpath ="//font[text()= 'Total 5 Records.']")
	  WebElement recordscounts;
	  
	  @FindBy(xpath =" //a[text() ='15408']")
	  WebElement memberidlink;
	  
	  
	  @FindBy(xpath ="//a[contains(text(),'Next')]")
	  WebElement nextlink;
	  
	  @FindBy(xpath ="//a[contains(text(),'Last')]")
	  WebElement lastlink;
	  
	  @FindBy(xpath ="//a[contains(text(),'Previous')]")
	  WebElement previouslink;
	  
	  @FindBy(xpath ="//a[contains(text(),'First')]")
	  WebElement firstlink;
	  
	  @FindBy(xpath = "//font[text() ='Page Number: 1']")
	  WebElement pagecounttext;
	  
	  @FindBy(xpath ="//input[@type ='search']")
	  WebElement Searchtinput;
	  
	  @FindBy(name ="pageSize")
	  WebElement pagesizelist;
	  
	
	
	  

	  
	// Initializing the page object
			public SearchMembers() {
			PageFactory.initElements(driver, this); // this means pointing to current class object (LoginPage.class)
				
			}
	  
	  
			
			
	public void searchmemberid() {
		
		 //   driver.findElement(By.xpath("//a[text() ='Members']")).click();
	        Select select = new Select(driver.findElement(By.name("searchType")));
	        select.selectByIndex(1);
	        driver.findElement(By.id("memberIDText")).sendKeys("15408");
	        driver.findElement(By.xpath("//button[@class='btn primary save-dialog' and @type ='button']")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'15408')]")).click();
		
	}
			
			
	  public void searchNewMember(String stype, String planidd,String pbpp, String seg, String dob, 
			                      String statuss, String meffedate, String gcode) throws InterruptedException {
		  
		  Select select = new Select(driver.findElement(By.name("searchType")));
		  select.selectByVisibleText(stype);
		  
		  Select select1 = new Select(driver.findElement(By.name("planID")));
		  select1.selectByVisibleText(planidd);
		  
		  Select select2 = new Select(driver.findElement(By.name("pbp")));
		  select2.selectByVisibleText(pbpp);
		  
		  Select select3 = new Select(driver.findElement(By.name("segment")));
		  select3.selectByVisibleText(seg);
		  
		  selectbirthDate.sendKeys(dob);
	      JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("document.getElementById('memberIDText').focus();");
		  Thread.sleep(5000);
		  
		  Select select5 = new Select(driver.findElement(By.name("status")));
		  select5.selectByVisibleText(statuss);
		  
		  selectmemEffectiveDate.sendKeys(meffedate);
	      JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		  jse1.executeScript("document.getElementById('memberIDText').focus();");
		  Thread.sleep(5000);
		  
		  Select select7 = new Select(driver.findElement(By.name("genderCode")));
		  select7.selectByVisibleText(gcode);
		  
		  searchmemberbtn.click();
		  memberidlink.click();
		  
		}
	  
	  public ViewMemberDetailsPage VefifyviweMemberDetailspage() {
		  return new ViewMemberDetailsPage();
	  }
	  
	  
	      public boolean VerifyCorrectSearchmembersCount() {
	      return recordscounts.isDisplayed();
		  
	      }

	      
	      public void coresearch(String sstype, String statt) throws InterruptedException {
	    	  
			  Select select10 = new Select(driver.findElement(By.name("searchType")));
			  select10.selectByVisibleText(sstype);
			  
			  Select select9 = new Select(driver.findElement(By.name("status")));
			  select9.selectByVisibleText(statt);
			  
			  searchmemberbtn.click();
			  Thread.sleep(2000);
			  nextlink.click();
			  Thread.sleep(2000);
			  lastlink.click();
			  Thread.sleep(2000);
			  previouslink.click();
			  Thread.sleep(2000);
			  firstlink.click();
			  Thread.sleep(2000);
			  
			}
	      
	      public boolean VerifyCorrectSearchPageNumber() {
		   return pagecounttext.isDisplayed();
           }
	      
	      
 public void voyagerSearch(String sstype, String statt) throws InterruptedException {
	    	  
			  Select select10 = new Select(driver.findElement(By.name("searchType")));
			  select10.selectByVisibleText(sstype);
			  
			  Select select9 = new Select(driver.findElement(By.name("status")));
			  select9.selectByVisibleText(statt);
			  
			  searchmemberbtn.click();
			 /* Thread.sleep(9000);
			  nextlink.click();
			  Thread.sleep(2000);
			  lastlink.click();
			  Thread.sleep(2000);
			  previouslink.click();
			  Thread.sleep(2000);
			  firstlink.click();
			  Thread.sleep(2000);*/
			  
			}
	      
	      public boolean VerifyCorrectSearchPageNumberVoyger() {
		   return pagecounttext.isDisplayed();
           }
	      
	      public void searchvoyagerid() {
	       Searchtinput.sendKeys("60");
	      }
	      
	      
	      public void pageSizelistCount3000() {
	         Select select  = new Select(driver.findElement(By.name("pageSize")));
	         try {
	    	  select.selectByIndex(1);
	    	  select.selectByIndex(2);
	         }catch(StaleElementReferenceException ex) {
	        	 
	       } 
	     
	      }
	      
}	  
	  


