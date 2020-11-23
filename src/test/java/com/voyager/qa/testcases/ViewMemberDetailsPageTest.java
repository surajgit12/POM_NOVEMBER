package com.voyager.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LoginPage;
import com.voyager.qa.pages.SearchMembers;
import com.voyager.qa.pages.ViewMemberDetailsPage;
import com.voyager.qa.util.CustomListener;
import com.voyager.qa.util.TestUtil;



@Listeners(CustomListener.class)
public class ViewMemberDetailsPageTest extends TestBase {

	
	 LoginPage loginpage;
	 HomePage homePage;
	 SearchMembers searchmember;
	 ViewMemberDetailsPage viewmemberdetailspage;
	 
	 
	 String sheetName = "searchmember"; 
	 
	 public ViewMemberDetailsPageTest()
		{
			super();
		}
		
	 @BeforeMethod
     public void setUp() throws InterruptedException {
			
			intialization(); // call initialization method
			loginpage = new LoginPage();// create object of an homepage class
			homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
			searchmember = new SearchMembers();  
			viewmemberdetailspage = new ViewMemberDetailsPage();
			
		 } 
	 
	   @DataProvider
	   public Object[][] getSearchMembersData() {
	   Object data [][]= TestUtil.getTestData(sheetName);
	   return data;
		}
	
	    @Test(priority=1 , dataProvider ="getSearchMembersData")
	     public void VerifyViewMemberPageTest(String stype, String planidd,String pbpp, String seg, String dob, 
                 String statuss, String meffedate, String gcode) throws InterruptedException {
	    	 
	    	  homePage.ClickOnMemberLink();
	    	  searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	  Assert.assertTrue(viewmemberdetailspage.VerifyCorrectfirstLastnametext());
	    	  
	    	 }
	 
	    @Test(priority=2 , dataProvider ="getSearchMembersData")
	    public void VerifyEditMemberTest(String stype, String planidd,String pbpp, String seg, String dob, 
                String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyEditMember());
	    }
	 
	    @Test(priority=3 , dataProvider ="getSearchMembersData")
	     public void VerifyQueue72RxTest(String stype, String planidd,String pbpp, String seg, String dob, 
                String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Thread.sleep(8000);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyQueue72Rxlink());
	    }
	    
	    @Test(priority=4 , dataProvider ="getSearchMembersData")
	     public void VerifyQueue73RxTest(String stype, String planidd,String pbpp, String seg, String dob, 
               String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Thread.sleep(8000);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyUncoveredMonth());
	    }
	    
	    

	    @Test(priority=5 , dataProvider ="getSearchMembersData")
	     public void VerifyQueue74RxTest(String stype, String planidd,String pbpp, String seg, String dob, 
               String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Thread.sleep(8000);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyQueue74Rxlink());
	    }
	    

	    @Test(priority=6 , dataProvider ="getSearchMembersData")
	     public void VerifyQueue78RxTest(String stype, String planidd,String pbpp, String seg, String dob, 
               String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Thread.sleep(8000);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyQueue78Rxlink());
	    }
	    
	    @Test(priority=7 , dataProvider ="getSearchMembersData")
	     public void VerifyQueu90RxTest(String stype, String planidd,String pbpp, String seg, String dob, 
              String statuss, String meffedate, String gcode) throws InterruptedException {
	    	
	    	   homePage.ClickOnMemberLink();
	    	   searchmember.searchNewMember(stype, planidd, pbpp, seg, dob, statuss, meffedate, gcode);
	    	   Thread.sleep(8000);
	    	   Assert.assertTrue(viewmemberdetailspage.VerifyQueue90Rxlink());
	    }
	    
	    
	    
	    @AfterMethod
	    public void TearDown() {
	    	driver.quit();
	    }
	 
}
