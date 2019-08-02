package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.LoginPage;
import Utility.Browser;


public class testclass {

	
	@Test
	public void Test () {
	
		WebDriver driver=Browser.startbrowser("Chrome","http://demoaut.com/");
		LoginPage log =PageFactory.initElements(driver, LoginPage.class);
		log.User("tutorial", "tutorial");
	}
	
	
	
	

}
