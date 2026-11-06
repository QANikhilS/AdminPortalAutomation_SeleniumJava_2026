package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.NotificationsPage;
import utils.ExtentReportManager;

public class NotificationsTest extends BaseClass
{	
	public static NotificationsPage notifications;
	

	@Test(priority = 1)
	public void verifyOpeningOfTemplatesPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Templates page.");   // to set the test case name in reports.
		notifications = new NotificationsPage(driver);
		notifications.openTemplatesPage();
		System.out.println("++++ List out all availabel optionos in Notifications +++++");
		notifications.howManyOptionsInNotification();
		System.out.println("++++ List out all availabel optionos in Notifications +++++");
		test.info("Click On Templates tab.");
		Assert.assertEquals	(true, notifications.visibilityOfTemplatePageHeader(), "Templates page is opened.");
		test.pass("Templates page is opened successfully.");
	}
	
	
	
	
	@Test(priority = 2)
	public void verifyOpeningOfSegmentsPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Segments page.");   // to set the test case name in reports.
		notifications.openSegmentsPage();
		test.info("Click On Segments tab.");
		Assert.assertEquals(true, notifications.visibilityOfSegmentsPageHeaderr(), "Segments page is opened.");
		test.pass("Segments page is opened successfully.");
	}
	
	
	@Test(priority = 3)
	public void verifyOpeningOfCampaignsPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Campaigns page.");   // to set the test case name in reports.
		notifications.openCampaignsPage();
		test.info("Click On Campaigns tab.");
		Assert.assertEquals(true, notifications.visibilityOfCampaignsPageHeader(), "Campaigns page is opened.");
		test.pass("Campaigns page is opened successfully.");
	}
	
	
	
	@Test(priority = 4)
	public void verifyOpeningOfStatsPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Stats page.");   // to set the test case name in reports.
		notifications.openStatsPage();
		test.info("Click On Stats tab.");
		Assert.assertEquals(true, notifications.visibilityOfStatsPageHeader(), "Stats page is opened.");
		test.pass("Stats page is opened successfully.");
	}
	
	
	@Test(priority = 5)
	public void verifyOpeningOfAnnouncementPage() 
	{
		test = ExtentReportManager.createTest("Test Case to open Announcement page.");   // to set the test case name in reports.
		notifications.openAnnounsmentsPage();
		test.info("Click On Announcement tab.");
		Assert.assertEquals(true, notifications.visibilityOfAnnouncementsPageHeader(), "Announcement page is opened.");
		test.pass("Announcement page is opened successfully.");
	}
	
	
	
	
	
	
	
	
	
	
	

}
