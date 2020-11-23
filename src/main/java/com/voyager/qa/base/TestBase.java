package com.voyager.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.voyager.qa.util.TestUtil;
import com.voyager.qa.util.WebEventListeners;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListeners eventListener;
//	E:\Java Practice\eclipse-workspace\VoyagerTestSuite2PageObjectBackUp\src\main\java\com\voyager\qa\configuration\config.properties
	
	// inside constructor
	public TestBase(){
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Java Practice\\eclipse-workspace\\VoyagerTestSuite2PageObjectBackUp\\src\\main\\java\\com\\voyager\\qa\\configuration\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}


   public static void intialization() {
	   
	 String browserName= prop.getProperty("browser");
	 
	 if(browserName.equals("FireFox")){
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\suraj.umbarkar\\Desktop\\CORE JAVA\\geckodriver.exe");
		 driver = new  FirefoxDriver();
	 }
	 
	 else if(browserName.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\suraj.umbarkar\\Desktop\\CORE JAVA\\chromedriver.exe");
		 driver = new  ChromeDriver();
	   
     }
	 
 
	  e_driver = new EventFiringWebDriver(driver);
	 // now create object of an EventListener  to register it with EventFiringWebDriver
	 eventListener = new WebEventListeners();
	 e_driver.register(eventListener);
	 driver = e_driver;
	 
	 
	
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url"));
}
   
   public void failed(String testMethodName){
		 
	     File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     try {
			FileUtils.copyFile(scrFile, new File("E:\\Java Practice\\eclipse-workspace\\VoyagerTestSuite\\screenshots\\"
					+testMethodName+
				"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	 }
}   
