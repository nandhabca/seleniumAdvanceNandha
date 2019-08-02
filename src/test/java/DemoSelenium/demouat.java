package DemoSelenium;

import java.awt.RenderingHints.Key;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demouat {
	//String expectedresult="Find a Flight: Mercury Tours:"; 
	WebDriver driver;
  @Test
  public void login() {
	  
//	  driver.findElement(By.name("userName")).sendKeys("tutorial");
//	  driver.findElement(By.name("password")).sendKeys("tutorial");
//	  driver.findElement(By.name("login")).click();
//	  WebDriverWait wait=new WebDriverWait(driver, 30);
//	  wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
//	  Assert.assertEquals(expectedresult, driver.getTitle());
	  
	  
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //driver.get("http://10.232.237.143:443/TestMeApp/");
	//  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	//  driver.findElement(By.name("password")).sendKeys("Password123");
	//  driver.findElement(By.name("Login")).click();
	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 // driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("bag ");
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  
//	  WebElement search = driver.findElement(By.xpath("//input[@id='myInput']"));
//	  search.sendKeys("b");
//	  search.sendKeys("a");
//	  search.sendKeys("g");
	  driver.manage().window().maximize();
	  WebDriverWait wait=new WebDriverWait(driver, 50);
	  Actions act=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	  String alretmessage = driver.switchTo().alert().getText();
	  driver.switchTo().alert().accept();
	  System.out.println(alretmessage);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement search = driver.findElement(By.xpath("//input[@id='myInput']"));
	  act.keyDown(search,Keys.SHIFT).perform();
	  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").build().perform();
	  WebElement Products = driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"));
      wait.until(ExpectedConditions.elementToBeClickable(Products));
	 
	 act.moveToElement(Products).click().build().perform();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 String Parentwindow = driver.getWindowHandle();
	 Set<String> set=driver.getWindowHandles();
	 for(String s:set)
	 {
		 driver.switchTo().window(s);
		 System.out.println(driver.getTitle());
		 
	 }
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String text = driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
	Assert.assertTrue(text.contains("Hand bag"));
	driver.switchTo().window(Parentwindow);
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\'menu3\']/li[2]/ul/li[2]/a/span")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//*[@id=\"submenuul11292\"]/li[1]/a/span")).click();
   
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
			 //driver.findElement(By.xpath("//input[@id='myInput']")).clear();
	// act.moveToElement(Products).clickAndHold().sendKeys("bag").build().perform();
	 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]")).click();
	 
//	  driver.findElement(By.xpath("//input[@id='myInput']")).clear();
//	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(" bag");
//	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(" ");
	  
	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  
	  
	  
	 
	  
	  
//	  
//	  driver.manage().window().maximize();
//	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
//	  String alertmessage=driver.switchTo().alert().getText();
//	  System.out.println(alertmessage);
//	  driver.switchTo().alert().accept();
//	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  
 
// driver.findElement(By.xpath("//button[@class='btn btn-nav active']")).click();
// driver.navigate().to("https://google.com");
// 
// driver.findElement(By.className("Fx4vi")).click();
// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
// Set<String> set=driver.getWindowHandles();
// for(String s:set)
// {
//	 driver.switchTo().window(s);
//	 System.out.println(driver.getTitle());
//	 
 }
 //Assert.assertEquals(expectedresult, driver.getTitle());
 
 /*String message = driver.findElement(By.xpath("/html/body/header/div/b/c:if")).getText();
 Assert.assertEquals(message, "Hi, Admin    SignOut");*/
 
 
	  
	  
//  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver(); 
	   //driver.get("http://demoaut.com/");
	   driver.get("http://10.232.237.143:443/TestMeApp");
  }

//  @AfterClass
//  public void afterClass() throws InterruptedException {
//	  Thread.sleep(100);
//	
//  }

}

