package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB {

	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("**********************");
		System.out.println("Lauching browser");
		
		driver=BrowserClass.getBrowser("chrome");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testGooglePageTitleInFirefox()
	{
		driver.navigate().to("http://www.google.com");
		String strPageTitle=driver.getTitle();
		System.out.println("Getting the title in chrome");
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page tilte does not match ");
				
	}			
	@AfterClass
	public void tearDown()
	{
		if (driver!=null)
		{
			System.out.println("Closing the driver");
			driver.quit();
		}
	}
}
