package DemoSelenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Excel {
	WebDriver driver;
  @Test
  public void f() throws IOException{
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver(); 
	   driver.get("http://demoaut.com/");
	   
	  File src =new File("C:\\Selenium 3.0\\Book1.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet= wb.getSheetAt(0);
	  
	  String data1= sheet.getRow(1).getCell(0).getStringCellValue();
	  String data2= sheet.getRow(1).getCell(1).getStringCellValue();
	  sheet.getRow(0).createCell(2).setCellValue("Pass");
	  sheet.getRow(1).createCell(2).setCellValue("Fail");
	  FileOutputStream fo=new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
	  
  }
}
		  
//	 
//  driver.findElement(By.name("userName")).sendKeys(data1);
//  WebDriverWait wait=new WebDriverWait(driver, 20);
//  driver.findElement(By.name("password")).sendKeys(data2);
//  driver.findElement(By.name("login")).click();
//	  
//	  
//	  driver.navigate().back();
//  }
//	  driver.close();
//  }

