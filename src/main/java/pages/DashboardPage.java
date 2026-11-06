package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//span[text()='Dashboard'])[1]")
	private WebElement dashboardLabel;
	
	@FindBy(xpath = "(//div[@class='flex items-end gap-2']//button[@data-slot='popover-trigger'])[1]")
	public WebElement fromCalander;

	
	

    public DashboardPage(WebDriver driver) //
			{
				this.driver = driver; // this.driver is driver from class and second driver which is after equal is webdriver drom the constructor
				wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				PageFactory.initElements(driver, this);
			}	
	
	
    
    public boolean isDashboardLabelDisaplyed()
	{
    	new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(dashboardLabel)) ;
		if (dashboardLabel.isDisplayed())
		{
			return true ;
		}
		else { return false; }
	}
    
    
    
    
    
     public void clickOnFromDayCalander()
     {
    	 wait.until(ExpectedConditions.elementToBeClickable(fromCalander)).click();
     }
    
    
     
     
     
    
}

