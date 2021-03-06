package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.DisabledHistoryPage;
import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LoginPage;
import com.voyager.qa.pages.SearchMembers;
import com.voyager.qa.pages.ViewMemberDetailsPage;
import com.voyager.qa.util.CustomListener;

@Listeners(CustomListener.class)
public class DisabledHistoryPageTest extends TestBase {
	 
	 LoginPage loginpage;
	 HomePage homePage;
	 SearchMembers searchmember;
	 ViewMemberDetailsPage viewmemberdetailspage;
	 DisabledHistoryPage disabledupdatepage;
	
	 
	 @BeforeMethod
    public void setUp() throws InterruptedException {
			
	     intialization(); // call initialization method
		 loginpage = new LoginPage();// create object of an homepage class
		 homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
		 searchmember = new SearchMembers();  
		 viewmemberdetailspage = new ViewMemberDetailsPage();
		 disabledupdatepage = new DisabledHistoryPage();
		 
		  } 
	 
	 @Test(priority=1)
	 public void VerifyDisabledupdatepageTest() throws InterruptedException {
		 
		 homePage.ClickOnMemberLink();
		 searchmember.searchmemberid();
   	     viewmemberdetailspage.VefifyDisabledUpdatePage();
   	     disabledupdatepage.VerifyDisabledUpdatePages();
   	     boolean disabledsuccessmsg = viewmemberdetailspage.VerifyDisabledupdatesuccessmsg();
         Assert.assertEquals(disabledsuccessmsg, true, "Disabledupdate is not successfull");
		 
	 }

}

