package tests;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.DashboardPage;
import utils.ExtentReportManager;

public class DashboardTest extends BaseClass{

	
	/*
	 * public DashboardPage db;
	 * 
	 * @BeforeClass public void initialisePageClass() { db = new
	 * DashboardPage(driver); }
	 */
	
	private DashboardPage dashboardPage ; 
	
	@BeforeClass
	public void initialiseObjectReference()
	{
		dashboardPage = new DashboardPage(driver);
	}
		
	
	@Test
	public void verifyLogedInSuccessfullyAndDBpageIsOpened()
	{
		Boolean actaulVisibilityOfdashboardlabel = dashboardPage.isDashboardLabelDisaplyed();
		Assert.assertEquals(true, actaulVisibilityOfdashboardlabel);
	}
	
	
	
	
	
	
	
//	@Test(priority = 0)
	public void openFromDateCalendar() throws Exception 
	{
		test = ExtentReportManager.createTest("Test Case to open Events page.");   // to set the test case name in reports.
		dashboardPage.clickOnFromDayCalander();
		test.info("Click On Events tab.");



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        By monthText  = By.xpath("//span[@class='select-none font-medium text-sm rdp-caption_label']");
        By prevButton = By.xpath("//button[@aria-label='Go to the Previous Month']");
        String expectedDateToSelect = "3/29/2026";
        
        // Keep clicking "Previous" until March 2026 is shown
        while (!driver.findElement(monthText).getText().equals("March 2026"))
        {
            wait.until(ExpectedConditions.elementToBeClickable(prevButton)).click();
        }
        BaseClass.wait(1500);
        // Click on date 15
        driver.findElement(By.xpath("//button[@data-day='"+expectedDateToSelect+"']")).click();
        test.info("Selected 29 March 2026");
        
        dashboardPage.clickOnFromDayCalander();
        
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("Pictures.png"));

     // Element screenshot (Selenium 4)
        File elementShot = dashboardPage.fromCalander.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(elementShot, new File("Pictures2.png"));
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	 FileUtils.copyFile(src2, new File("Picture33.png"));
        
        
        
    }
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		//Assert.assertEquals(true, events.EventsPageHeader.isDisplayed(), "Events page is opened	.");
		//test.pass("Events page is opened successfully.");
	}
	
	
	
	
	
	
