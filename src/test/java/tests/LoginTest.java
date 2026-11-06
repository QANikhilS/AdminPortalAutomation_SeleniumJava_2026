package tests;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.BaseClass;
import pages.LoginPage;
import utils.ExtentReportManager;

public class LoginTest extends BaseClass
{	


	public void DoLogin()
	{
		loginpage.enterUserNameAndPassword("admin@redrob.io", "password");
		Assert.assertEquals(driver.getCurrentUrl(), "https://staging-signal.redrob.io/admin");
	}
	
	
	
	
	
	public void handleMutlipleWindows() 
	{
		test = ExtentReportManager.createTest("Test Case to open Events page.");   // to set the test case name in reports.
		loginpage = new LoginPage(driver);
		driver.navigate().to("https://staging-signal.redrob.io/admin/events/resolution-assistant?id=4f36cfec-c351-4070-86b7-b84f47000eac");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window handles = "+parentWindow);
        driver.findElement(By.xpath("//a[text()='Search on Google']")).click();		
        
        System.out.println("++++++++++++++++++++++++++++++++++"+driver.getWindowHandles());
        
        for (String whandle : driver.getWindowHandles())
        {
        	if (!whandle.equals(parentWindow));
        	{
        		driver.switchTo().window(whandle);
            }
        }  
        
        System.out.println("switched to child window -"+driver.getTitle());
		System.out.println("child window handle -"+driver.getWindowHandle());
        
        
        
        
/*      - handle more than 2 browsers  
        Set<String> handles = driver.getWindowHandles();
        
        // 3. Convert Set to List to allow index-based access
        List<String> windowList = new ArrayList<>(handles);
        
        // 4. Switch to each window as needed using zero-based indexing
        String parentWindow = windowList.get(0); // First window
        String secondWindow = windowList.get(1); // Second window
//      String thirdWindow  = windowList.get(2); // Third window
//      String fourthWindow = windowList.get(3); // Fourth window           

        driver.switchTo().window(secondWindow);
        System.out.println("second browser title is ======== "+driver.getTitle());    */
        
        driver.close();
        driver.switchTo().window(parentWindow);
        System.out.println("Current window handle - "+driver.getWindowHandle());
        
		
		
		
//		Assert.assertEquals(true, login.isDashboardLabelDisaplyed(), "Logged in successfuly.");
//		test.pass("Events page is opened successfully.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
