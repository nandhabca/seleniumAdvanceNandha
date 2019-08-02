package DemoSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Ajax {
	WebDriver driver;
	
  @Test
  public void f() {
	  By container = By.xpath("//div[@class='contentWrapper']");
	  WebDriverWait wait=new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(container));
	  
	  WebElement noDate=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_Label1\']"));
	  String textbefore= noDate.getText().trim();
	  
	  driver.findElement(By.linkText("9")).click();
	  By lodaer = By.className("raDiv");
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(lodaer));
	  
    WebElement afDate=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_Label1\']"));
    wait.until(ExpectedConditions.visibilityOf(afDate));
	 String aftext= afDate.getText().trim();
	 System.out.println(textbefore); 
	 System.out.println(aftext); 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver(); 
	   driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
  }

  @AfterTest
  public void afterTest() {
  }

}
