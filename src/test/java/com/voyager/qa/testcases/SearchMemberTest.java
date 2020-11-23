package com.voyager.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.voyager.qa.base.TestBase;

import com.voyager.qa.pages.HomePage;
import com.voyager.qa.pages.LoginPage;
import com.voyager.qa.pages.SearchMembers;
import com.voyager.qa.util.TestUtil;

public class SearchMemberTest extends TestBase {
	
	
	 LoginPage loginpage;
	 HomePage homePage;
	 SearchMembers searchmember;
	 
	 String sheetName = "searchmember"; 
	 String SheetNames = "coresearch";
	 String SheetNamess = "voysearch";
	
	 public SearchMemberTest(){
			super();
		}
	
	 @BeforeMethod
     public void setUp() throws InterruptedException {
			
			intialization(); // call initialization method
			loginpage = new LoginPage();// create object of an homepage class
			homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); //login method return the homepage
			searchmember = new SearchMembers();  
       }
	
	   @DataProvider
	   public Object[][] getSearchMembersData() {
	   Object data [][]= TestUtil.getTestData(sheetName);
	   return data;
		}
	
	 
	    @Test(priority=1 , dataProvider ="getSearchMembersData")
	    public void validateSearchMemberTest(String searchtype,String planid, String pbp, String segmentnumber, String birthdate, 
	    String status , String membereffectivedate ,String gender ) throws InterruptedException {
		  
        homePage.ClickOnMemberLink();
        searchmember.searchNewMember(searchtype, planid, pbp, segmentnumber, birthdate, status, membereffectivedate, gender);
         Assert.assertTrue(searchmember.VerifyCorrectSearchmembersCount());
    
		  
  }
	    @DataProvider
		public Object[][] getSearchMembersDatas() {
		Object data [][]= TestUtil.getTestData(SheetNames);
		return data;
			}

	    @Test(priority =2, dataProvider= "getSearchMembersDatas")
	     public void validateCoreSearchMemberTest(String searchtype, String status ) throws InterruptedException {
		homePage.ClickOnMemberLink();   
	    searchmember.coresearch(searchtype, status);
	    Assert.assertTrue(searchmember.VerifyCorrectSearchPageNumber());
	    
		   }
	  
	    
	    @DataProvider
		public Object[][] getSearchMembersDatafromVoyager() {
		Object data [][]= TestUtil.getTestData(SheetNamess);
		return data;
			}

	    @Test(priority =3, dataProvider= "getSearchMembersDatafromVoyager")
	    public void validateVoyagerSearchMemberTest(String searchtype, String status ) throws InterruptedException {
		homePage.ClickOnMemberLink();   
	    searchmember.voyagerSearch(searchtype, status);
	  //  searchmember.searchvoyagerid();
	    searchmember.pageSizelistCount3000();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    Assert.assertTrue(searchmember.VerifyCorrectSearchPageNumberVoyger());
	    
		   }
	  
	    @AfterMethod
	    public void TearDown() {
	    	driver.quit();
	    }
}
