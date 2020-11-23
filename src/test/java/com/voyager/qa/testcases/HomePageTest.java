package com.voyager.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LoginPage;


public class HomePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;

	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		 intialization(); // call initialization method
         loginpage = new LoginPage();// create object of an homepage class
	     homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
		}
	
	
	@Test(priority =1)
	public void clickonMemberlinkTest() throws InterruptedException {
		
		//homePage.ClickOnMemberLink();
		 Assert.assertTrue(homePage.ClickOnMemberLink());
	}

}
