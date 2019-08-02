package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	By username =By.name("userName");
	By Password =By.name("password");
	By sighin =By.name("login");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void loginuser(String un,String pass)
{
	driver.findElement(username).sendKeys(un);
	driver.findElement(Password).sendKeys(pass);
	driver.findElement(sighin).click();
	
	
}
}
