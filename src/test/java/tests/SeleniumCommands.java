package tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumCommands {
	
	public static WebDriver driver;

	public void sleep() 
	{  try {  Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }   }
	
	
	@Test
	public void seleniumTestCammands() {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	       options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	       options.setExperimentalOption("useAutomationExtension", false);
	       options.addArguments("--disable-blink-features=AutomationControlled");  // These line are to handle chrom is being handled pop up message.
	       
	       Map<String, Object> prefs = new HashMap<>();
	       prefs.put("credentials_enable_service", false);
	       prefs.put("profile.password_manager_enabled", false);
	       options.setExperimentalOption("prefs", prefs);   // These lines are for handling Save password pop up.
	       
	       driver = new ChromeDriver(options);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		   
		   
/*		   driver.get("https://www.linkedin.com");     
		   //Navigates to the specified URL in the current browser window. 
		   sleep();

		   
		   driver.navigate().to("https://www.linkedin.com/jobs/search/?lipi=urn%3Ali%3Apage%3Ad_homepage-guest-home_jsbeacon%3BpWC77C1hRGahdQwLm5ogUA%3D%3D&position=1&pageNum=0");
		   // Navigates to the specified URL. 
		   sleep();		   
		   
		   driver.navigate().back();
		   // Moves the browser backward by one page
		   sleep();
		   
		   driver.navigate().forward();
		   //Moves the browser forward by one page
		   sleep();
		   
		   
		   driver.navigate().refresh();
		   //Refreshes the current page. 
		   sleep();
		
		   driver.manage().window().minimize();
		   //Maximizes the current browser window
		   sleep();
		   
		   driver.manage().window().maximize();
		   //Maximizes the current browser window
		   sleep();
		
		   driver.manage().window().fullscreen();
		   // Sets the browser window to full screen. 
		   sleep();
		
		   System.out.println(driver.manage().window().getSize());
		   //Retrieves the size (width and height) of the current browser window. 
		   sleep();
		
		    driver.manage().window().setSize(new Dimension(1560, 900));
		    // Sets the size of the browser window
		    sleep();
		   
		    System.out.println(driver.manage().window().getPosition());
		    //Retrieves the current position of the browser window.
		   
		    
		    driver.manage().window().setPosition(new Point(5, 5));
		    //Sets the position of the browser window. 
		    
			driver.manage().window().maximize();
			//Maximizes the current browser window
			sleep();		    
		    
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		    // Sets the maximum time to wait for a page to load. 
		    
		    
		    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15)); 	driver.navigate().back();
		    // Sets the maximum time to wait for a script to execute. 
		    
		    
//		    driver.switchTo().frame(1);
		    // Switches focus to a frame using its Index. 
//		    driver.switchTo().frame("gsi_672385_64642");
		    // Switches focus to a frame using its name or ID.
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Adobe ID Syncing iFrame']")));
		    //Switches focus to a frame using a WebElement. 
		    driver.switchTo().defaultContent();
		    //Switches back to the main document after working within a frame. 		    
		    driver.switchTo().parentFrame();
		    //Switches to the parent frame of the current frame.                                 

//----------------------------------------------------------------------------------------------------		    
		    
		    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
		    sleep();
		    WebElement btnToOpenAlertbox = driver.findElement(By.id("alert"));
		    btnToOpenAlertbox.click();
		    sleep();

		    driver.switchTo().alert();      // Switches to an alert box. 
  

    		 // Accepts the currently displayed alert
		    driver.switchTo().alert().accept();   		      
		    sleep();
		    
	    	  //Dismisses the currently displayed alert.
		    btnToOpenAlertbox.click();
		    driver.switchTo().alert().dismiss();     
		    sleep();	
	
            // Retrieves the text from the alert box
		    btnToOpenAlertbox.click();
            String textFromAlert = driver.switchTo().alert().getText();
            System.out.println(textFromAlert);
            driver.switchTo().alert().dismiss();
//----------------------------------------------------------------------------------------------------		    */
	
		   // HOw to handle shadow dom element in selenium 4 
		   driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html");

	        // Step 1: Locate the Shadow Host element in the main DOM
	        WebElement shadowHost = driver.findElement(By.cssSelector("#content"));

	        // Step 2: Access the Shadow Root (returns a SearchContext)
	        SearchContext shadowRoot = shadowHost.getShadowRoot();

	        // Step 3: Find the actual element inside the Shadow DOM using the shadowRoot context
	        WebElement targetInput = shadowRoot.findElement(By.cssSelector("p"));

	        // Interact with the element
	        System.out.println(targetInput.getText());
		   
//----------------------------------------------------------------------------------------------------		    */	
	
	
	
	
	
	
	
	
	
	
	
}

}
