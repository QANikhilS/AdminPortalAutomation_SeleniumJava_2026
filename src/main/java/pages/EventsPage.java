package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;
import utils.Log;

public class EventsPage 
   {
	
	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "(//ul[@data-slot='sidebar-menu'])[1]//span[text()='Events']")
	public WebElement MainEventTab;
	
	@FindBy(xpath = "//span[text()='Events Management']")
	public WebElement EventsPageHeader;
	
	
	
	public EventsPage(WebDriver driver) //
	{
		this.driver = driver; // this.driver is driver from class and second driver which is after equal is webdriver drom the constructor
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void openEventsPage() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(MainEventTab)).click();
		wait.until(ExpectedConditions.visibilityOf(EventsPageHeader));
		Log.info("Events page is opened.");
		BaseClass.wait(1500);
	}
	
}
