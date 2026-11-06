package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Log;

public class LoginPage  {
	
	private WebDriver driver; 
	
	private By usernameTextBox = By.xpath("(//input[@name='email'])");
	private By passwordTextBox = By.xpath("(//input[@name='password'])");
	private By submitBtn = By.xpath("//button[@type='submit']");
	private By dashboardLabel = By.xpath("(//span[text()='Dashboard'])[1]");
	
	
		
	public LoginPage(WebDriver driver)     //
	{
		this.driver = driver; // this.driver is driver from class and second driver which is after equal is webdriver drom the constructor	
	}
	
	
	
	// Below are the action functions 
	public void enterUserNameAndPassword(String usrname, String pass)
	{
		driver.findElement(usernameTextBox).sendKeys(usrname);
		Log.info("Username entered.");
		driver.findElement(passwordTextBox).sendKeys(pass);
		Log.info("Password entered.");
		driver.findElement(submitBtn).click();
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(dashboardLabel)) ;
		Log.info("Clicked on Submit button.");
	}

	

	public boolean isDashboardLabelDisaplyed()
	{
		if (driver.findElement(dashboardLabel).isDisplayed())
		{
			return true ;
		}
		else { return false; }
	}
	

	
	
}
