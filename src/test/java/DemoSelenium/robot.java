package DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class robot {
	
   
	
	public static void main(String[] args) throws AWTException {
		
	Robot robot = new Robot();
	
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver  driver=new ChromeDriver(); 
	   //driver.get("http://demoaut.com/");
	   driver.get("file:///C:/Selenium%203.0/Nandha.html");
	   driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
	   robot.setAutoDelay(1000);
	  String path = "C:\\Selenium 3.0\\Nandha.txt";
	  StringSelection Sel = new StringSelection(path);
	 
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Sel, null);
	  
	  robot.setAutoDelay(1000);
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.keyRelease(KeyEvent.VK_V);
	  
	  
	  robot.setAutoDelay(1000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	   
	   

	}

}