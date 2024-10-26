package Utilities;



import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{
	WebDriver driver;
	
	public BrowserLaunch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebDriver launchBrowser(WebDriver driver,String url)
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Drivers\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   return driver;
	  
	}

}
