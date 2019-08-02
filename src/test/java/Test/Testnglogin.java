package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Page.login;
import Utility.Browser;

public class Testnglogin {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver=Browser.startbrowser("Chrome","http://demoaut.com/");
	  login log=new login(driver);
	  log.loginuser("tutorial","tutorial");
  }
}
