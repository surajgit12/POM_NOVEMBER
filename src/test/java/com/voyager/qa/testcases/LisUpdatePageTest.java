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
import com.voyager.qa.pages.SearchMembers;
import com.voyager.qa.pages.ViewMemberDetailsPage;
import com.voyager.qa.util.CustomListener;
import com.voyager.qa.util.TestUtil;

@Listeners(CustomListener.class)
public class LisUpdatePageTest extends TestBase{
	
	 LoginPage loginpage;
	 HomePage homePage;
	 SearchMembers searchmember;
	 ViewMemberDetailsPage viewmemberdetailspage;
	 LisUpdatePage lisupdatepage;
	 
	 String sheetName1 = "lisinfo"; 
	 String sheetName = "searchmember"; 
	 
	
	 public LisUpdatePageTest(){
			super();
	 }
		
	 @BeforeMethod
     public void setUp() throws InterruptedException {
			
	     intialization(); // call initialization method
		 loginpage = new LoginPage();// create object of an homepage class
		 homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
		 searchmember = new SearchMembers();  
		 viewmemberdetailspage = new ViewMemberDetailsPage();
		 lisupdatepage = new LisUpdatePage();
			
		 } 
	 
	 
	 @DataProvider
	   public Object[][] getlismemberData() {
	   Object data [][]= TestUtil.getTestData(sheetName1);
	   return data;
		}
	
	    @Test(priority=1 , dataProvider ="getlismemberData")
	     public void VerifyViewMemberPageLISTest(String effectivedate, String enddate,String premium, String copay, String source, 
               String effectivedate1, String enddate1, String premium1,String copay1, String source1) throws InterruptedException {
	    	
	    	 homePage.ClickOnMemberLink();
	    	 searchmember.searchmemberid();
	    	 viewmemberdetailspage.VefifyLowIncomeSubsidypage();
	    	 lisupdatepage.lisupdate(effectivedate, enddate, premium, copay, source, effectivedate1, enddate1, premium1, copay1, source1);
	    	 boolean lissuccessmsg = viewmemberdetailspage.Verifylisupdatesuccessmsg();
	         Assert.assertEquals(lissuccessmsg, false, "LISupdate is not successfull");
	    	 
	    
	    	  }
	/*   @AfterMethod
	    public void TearDown() {
			
			driver.quit();

			}*/
}