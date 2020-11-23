package com.voyager.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;
import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	 LoginPage loginpage;
	 HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		intialization(); // call initialization method
		loginpage = new LoginPage(); // create object of an loginpage class
		}
	
	@Test
	public void loginTest() throws InterruptedException
	  {

		  Thread.sleep(2000);
		  homePage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
		}

	/*@AfterMethod
    public void TearDown() {
		
		driver.quit();

		}
		*/
}
