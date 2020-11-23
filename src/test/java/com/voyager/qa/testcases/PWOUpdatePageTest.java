package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LisUpdatePage;
import com.voyager.qa.pages.LoginPage;
import com.voyager.qa.pages.PWOUpdatePage;
import com.voyager.qa.pages.SearchMembers;
import com.voyager.qa.pages.ViewMemberDetailsPage;
import com.voyager.qa.util.CustomListener;
import com.voyager.qa.util.TestUtil;


@Listeners(CustomListener.class)
public class PWOUpdatePageTest extends TestBase {

	 LoginPage loginpage;
	 HomePage homePage;
	 SearchMembers searchmember;
	 ViewMemberDetailsPage viewmemberdetailspage;
	 LisUpdatePage lisupdatepage;
	 PWOUpdatePage pwoupdatePage;
	 
	 String sheetName2 = "pwoinfo"; 
	 
	 
	 @BeforeMethod
     public void setUp() throws InterruptedException {
			
	     intialization(); // call initialization method
		 loginpage = new LoginPage();// create object of an homepage class
		 homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
		 searchmember = new SearchMembers();  
		 viewmemberdetailspage = new ViewMemberDetailsPage();
		 lisupdatepage = new LisUpdatePage();
		 pwoupdatePage = new PWOUpdatePage();	
		 
		 } 
	 
	 @DataProvider
	   public Object[][] getPWOmemberData() {
	   Object data [][]= TestUtil.getTestData(sheetName2);
	   return data;
		}
	
	 
	 
	    @Test(priority=1 , dataProvider ="getPWOmemberData")
	     public void VerifyViewMemberPageTest(String effectivedate,String enddate,String effectivedate1, 
             String enddate1) throws InterruptedException {
	    	
	    	 homePage.ClickOnMemberLink();
	    	 searchmember.searchmemberid();
	    	 viewmemberdetailspage.VefifyPremiumWithholdOptionPage();
	    	 pwoupdatePage.PWOUpdatePages( effectivedate, enddate, effectivedate1, enddate1);
	    	 boolean pwosuccessmsg = viewmemberdetailspage.Verifypwoupdatesuccessmsg();
	         Assert.assertEquals(pwosuccessmsg, false, "PWOupdate is not successfull");
	    	}

		 /*  @AfterMethod
		    public void TearDown() {
				
				driver.quit();

				}*/
	    
}
