package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class second extends Base {
	
	WebDriver driver;
	

	@Test  
   public void testTwo() {
	
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle() +" from Edge ");
		
   }
   
   @BeforeMethod
   public void setUp() throws MalformedURLException {
	   
	 driver =  initializeBrowser("edge");  
	  
   }
   
   @AfterMethod
   public void tearDown() {
	   
	   driver.quit();
	   
   }

}
