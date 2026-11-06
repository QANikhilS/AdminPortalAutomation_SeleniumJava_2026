package baseClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import pages.LoginPage;
import utils.ConfigReader;
import utils.EmailUtils;
import utils.ExtentReportManager;
import utils.Log;

public class BaseClass {
	
	protected WebDriver driver ;
	protected ConfigReader config = new ConfigReader();
	protected ExtentReports extent ;    // to create a test case execution report.
	protected ExtentTest test;    // to store the testcase details.
	
	protected LoginPage loginpage;

	
    @BeforeSuite
	public void setUpReport()
	{
		extent = ExtentReportManager.getReportInstance();
	}
	
	@BeforeSuite(dependsOnMethods = "setUpReport")
	public void LaunchAdminPortal()
	{ 
		   Map<String, Object> prefs = new HashMap<>();
	       prefs.put("credentials_enable_service", false);
	       prefs.put("profile.password_manager_enabled", false);   
	       prefs.put("download.default_directory", "/Pictures");  // to set custom downlaod path
	       prefs.put("download.prompt_for_download", false);     // to disable download confirmation prompt
	       
	       ChromeOptions options = new ChromeOptions();
	       options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	       options.setExperimentalOption("useAutomationExtension", false);
	       options.addArguments("--disable-blink-features=AutomationControlled");  // These line are to handle chrom is being handled pop up message.
	       options.setExperimentalOption("prefs", prefs);   // These lines are for handling Save password pop up.
	       
	       Log.info("Starting Webdriver...");
	       if (config.getBrowser().equalsIgnoreCase("chrome"))
	    	  { driver = new ChromeDriver(options);   Log.info("Opening Chrome browser"); }
	       else if (config.getBrowser().equalsIgnoreCase("firefox"))
	    	  { driver = new FirefoxDriver();   Log.info("Opening Firefox browser"); }
	       else if (config.getBrowser().equalsIgnoreCase("edge"))
	    	  { driver = new EdgeDriver();   Log.info("Opening Edge browser"); }
			
		   driver.manage().window().maximize(); Log.info("Chrome browser maximized");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(config.getImplicitWait())); driver.get(config.getprivatebaseUrl());
		   Log.info("Launched Admin portal");		
		   
		   loginpage = new LoginPage(driver);
		   loginpage.enterUserNameAndPassword(config.getUsername(), config.getPassword());
		   
	}

	
	
	
	
	public List<String> changeListOfWebElementsToListOfStrings(List<WebElement> WebElementList)
	{
		try { Thread.sleep(1500); 	}   catch (InterruptedException e) { e.printStackTrace(); 	}
		List<String> ListofStrings = new ArrayList<>();
		for (WebElement element : WebElementList)
		{
			ListofStrings.add(element.getText());
		}	
		return ListofStrings ;
	}
	
	
	public static void wait(int duration)
	{
		try {  Thread.sleep(duration); } catch (InterruptedException e) { e.printStackTrace(); 	}
	}
	
	
	/*
	 * public static void JSclick(WebElement element) { JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * element); }
	 */
	
	
	
	
    public void logout()
    {
        driver.findElement(By.xpath("//button[contains(@id, 'radix')]")).click();
        driver.findElement(By.xpath("//div[text()='Log out']")).click();
    }


//@AfterMethod
public void tearDown(ITestResult result)
{
	if (result.getStatus() == ITestResult.FAILURE)
	{
	  String screenshotPath = ExtentReportManager.capctureScreenshot(driver, "Test case failure");
      test.fail("Test Failed. Check Screenshot- ", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}
}	


//@AfterSuite
public void tearDownReport()
{  
	if (driver != null)
	{
		driver.quit();
		Log.info("Closing browser");
	}
	extent.flush();    
	String reportPath = ExtentReportManager.reportPath ;
	EmailUtils.sendTestReport(reportPath);
}

}
