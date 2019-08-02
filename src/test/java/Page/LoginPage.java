package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	
@FindBy(how=How.NAME, using = "userName")
WebElement userName;
@FindBy(how=How.NAME, using = "password")
WebElement Password;
@FindBy(how=How.NAME, using = "login")
WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
public void  User (String un,String pass)
{
	userName.sendKeys(un);
	Password.sendKeys(pass);
	signin.click();
	
	
}

}
