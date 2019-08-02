package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver ;
	
	public static WebDriver startbrowser(String browsername, String url)
	{
		if (browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\chromedriver.exe");
			   driver=new ChromeDriver();	
		}
		else if (browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
	
	
	 //  driver.get("http://10.232.237.143:443/TestMeApp");

}
