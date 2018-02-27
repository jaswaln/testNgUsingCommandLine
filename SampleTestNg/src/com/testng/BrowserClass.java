package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserClass {

	static String driverPath="F:\\SeleniumPrograms\\TestNg\\lib";
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String BrowserType)
	{
		switch(BrowserType)
		{
			case "firefox" :
				System.out.println("In Firefox");
				 System.setProperty("webdriver.gecko.driver", "F:\\SeleniumPrograms\\SampleTestNg\\lib\\geckodriver.exe");
			        DesiredCapabilities cap = DesiredCapabilities.firefox();
			        cap.setCapability("marionette", true);	
				System.out.println("Return");
				return driver=new FirefoxDriver();
			
			
			case "chrome":
				ChromeOptions o = new ChromeOptions();
				o.addArguments("disable-extensions");
				o.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumPrograms\\SampleTestNg\\lib\\chromedriver.exe");
			return driver=new ChromeDriver(o);	
			
			case "ie":
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				  
				capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
				capabilities.setCapability(InternetExplorerDriver.
				  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				
			System.setProperty("webdriver.edge.driver", "F:\\SeleniumPrograms\\SampleTestNg\\lib\\MicrosoftWebDriver.exe");
			return driver=new EdgeDriver();
			
			default:
			return driver=new FirefoxDriver();	
				
		}
		 
	}
}
