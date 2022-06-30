package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	
	public static WebDriver openBrowser()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
      WebDriver driver=new ChromeDriver(options);
       driver.get("https://kite.zerodha.com/");
   
	  driver.manage().window().maximize();
	return driver;
	
}
}