package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.EventsPage;
import utils.ExtentReportManager;

public class EventsTest extends BaseClass
{	
	public EventsPage events;
	
	@BeforeClass
	public void initialisePageClass()
	{
		events = new EventsPage(driver);	
	}
	
	
	@Test(priority = 0)
	public void openEventsPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Events page.");   // to set the test case name in reports.
		events.openEventsPage();
		test.info("Click On Events tab.");
		Assert.assertEquals(true, events.EventsPageHeader.isDisplayed(), "Events page is opened.");
		test.pass("Events page is opened successfully.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
