package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import utils.Log;

public class NotificationsPage {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//button/span[text()='Notifications']")
	private WebElement MainNotificationTab;
	
	@FindBy(xpath = "//ul[contains(@class, 'border-sidebar-border')]/li[1]")
	private WebElement TemplatesTab;	
	
	@FindBy(xpath = "//ul[contains(@class, 'border-sidebar-border')]/li[2]")
	private WebElement SegmentsTab;	
		
	@FindBy(xpath = "//ul[contains(@class, 'border-sidebar-border')]/li[3]")
	private WebElement CampaignsTab;	
	
	@FindBy(xpath = "//ul[contains(@class, 'border-sidebar-border')]/li[4]")
	private WebElement StatsTab;	
	
	@FindBy(xpath = "//ul[contains(@class, 'border-sidebar-border')]/li[5]")
	private WebElement AnnouncementsTab;	
	
	@FindBy(xpath = "//span[text()='Notification Templates Management']")
	private WebElement TemplatePageHeader;
	
	@FindBy(xpath = "//span[text()='Segments']")
	private WebElement SegmentsPageHeader;
	
	@FindBy(xpath = "//span[text()='Campaigns Management']")
	private WebElement CampaignsPageHeader;
	
	@FindBy(xpath = "//span[text()='Push Notification Stats']")
	private WebElement StatsPageHeader;
	
	@FindBy(xpath = "//span[text()='Announcements']")
	private WebElement AnnouncementsPageHeader;
	
	@FindBy(xpath = "//ul[@data-slot='sidebar-menu-sub']/li")
	private List<WebElement> allOptionsInNotifications;
	
	
	
	
	
	public NotificationsPage(WebDriver driver) //
	{
		this.driver = driver; // this.driver is driver from class and second driver which is after equal is webdriver drom the constructor
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
			
	
	public void howManyOptionsInNotification()
	{
		System.out.println(allOptionsInNotifications.size());
	}
	
	
	public void openTemplatesPage() 
	{
     	  wait.until(ExpectedConditions.elementToBeClickable(MainNotificationTab)).click();
		  Log.info("Clicked on Notification tab.");   	BaseClass.wait(1000);
     	  wait.until(ExpectedConditions.elementToBeClickable(TemplatesTab)).click();
		  Log.info("Clicked on Templates tab."); BaseClass.wait(1000);
		  wait.until(ExpectedConditions.visibilityOf(TemplatePageHeader));
		  Log.info("Templates page is opened.");  BaseClass.wait(1000);
	}
	
public void openSegmentsPage()
	{
     	  wait.until(ExpectedConditions.elementToBeClickable(SegmentsTab)).click();
		  Log.info("Clicked on Segments tab.");  BaseClass.wait(1000);
		  wait.until(ExpectedConditions.visibilityOf(SegmentsPageHeader));
		  Log.info("Segments page is opened.");  BaseClass.wait(1000);
	}
	

public void openCampaignsPage() 
	{
     	  wait.until(ExpectedConditions.elementToBeClickable(CampaignsTab)).click();
		  Log.info("Clicked on Campaigns tab.");   BaseClass.wait(1000);
		  wait.until(ExpectedConditions.visibilityOf(CampaignsPageHeader));
		  Log.info("Campaigns page is opened.");  BaseClass.wait(1000);
    }
		

public void openStatsPage() 
	{
    	  wait.until(ExpectedConditions.elementToBeClickable(StatsTab)).click();
		  Log.info("Clicked on Stats tab.");   BaseClass.wait(1000);
		  wait.until(ExpectedConditions.visibilityOf(StatsPageHeader));
		  Log.info("Stats page is opened.");   BaseClass.wait(1000);
    }
	
	
public void openAnnounsmentsPage() 
	{
    	  wait.until(ExpectedConditions.elementToBeClickable(AnnouncementsTab)).click();
		  Log.info("Clicked on Announcements tab.");   BaseClass.wait(1000);
		  wait.until(ExpectedConditions.visibilityOf(AnnouncementsPageHeader));
		  Log.info("Announcements page is opened.");  BaseClass.wait(1000);
    }


public boolean visibilityOfTemplatePageHeader()
   {  if (TemplatePageHeader.isDisplayed())
	    {return true;}
	  else 
    	{return false;	}    }


public boolean visibilityOfSegmentsPageHeaderr()
{  if (SegmentsPageHeader.isDisplayed())
	    {return true;}
	  else 
 	{return false;	}    }

public boolean visibilityOfCampaignsPageHeader()
{  if (CampaignsPageHeader.isDisplayed())
	    {return true;}
	  else 
 	{return false;	}    }

public boolean visibilityOfStatsPageHeader()
{  if (StatsPageHeader.isDisplayed())
	    {return true;}
	  else 
 	{return false;	}    }

public boolean visibilityOfAnnouncementsPageHeader()
{  if (AnnouncementsPageHeader.isDisplayed())
	    {return true;}
	  else 
 	{return false;	}    }











}	