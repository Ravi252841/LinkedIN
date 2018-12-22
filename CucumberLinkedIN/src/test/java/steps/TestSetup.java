package steps;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import utils.SeleniumDriver;

public class TestSetup {
	
	private static WebDriver driver;
	static String driverPath = "E:\\chromedriver.exe";
	 
	
public static void openUrl(String url) {
	System.out.println("driver in Open :"+driver+ ","+url);
		driver.get(url);
		  
	}
	
	@Before
	public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       setUpDriver();
    }
	 public static WebDriver getDriver() {
		  
			return driver;
			  
		  }
	private static WebDriver setUpDriver() {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		 driver = new ChromeDriver();
		System.out.println("driver is :"+driver);
//		driver.manage().window().maximize();
//		driver.navigate().to(appURL);
		return driver;
	}
	
	
	@After
	public void tear() {
		driver.quit();
	}
	

}
