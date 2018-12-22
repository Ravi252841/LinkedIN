package runners;



import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	       
		 glue= "steps",monochrome=true,
		 features= "resources/FeatureFiles"
//				 tags= {"@All"}
						 
) 
public class Runner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void setupMethod() {
		System.out.println("*********************we are starting method************************");
		// Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
				SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
				Date curDate = new Date();
				String strDate = sdf.format(curDate);
				String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
				File newFile = new File(fileName);
				ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
				//static report name
				//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
		        // Loads the extent config xml to customize on the report.
		        ExtentCucumberFormatter.loadConfig(new File("resources/extent-config.xml"));

		        // User can add the system information as follows
		        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
		        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
		        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

		        // Also you can add system information using a hash map
		        Map systemInfo = new HashMap();
		        systemInfo.put("Cucumber version", "v1.2.3");
		        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		        ExtentCucumberFormatter.addSystemInfo(systemInfo);
	}
	@AfterTest
	public void TearMethod() {
		System.out.println("*********************we are ending method************************");
	}
	

}
