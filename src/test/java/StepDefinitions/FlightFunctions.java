package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;


public class FlightFunctions 
{
	public static WebDriver driver;
	
	 @Given("^i  enter a url \"([^\"]*)\"$")
	public void i_enter_a_url(String arg1) 
{
	    
	
	   
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(arg1);
		
		
	}
	

	
}
