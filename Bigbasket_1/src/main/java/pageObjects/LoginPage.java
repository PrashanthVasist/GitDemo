package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.Base;


public class LoginPage extends Base {
public WebDriver driver;
	@FindBy(className = "dropdown-toggle")
	WebElement dropDown;
	
	@FindBy(id = "popUserName")
	WebElement usrname;
	
	@FindBy(id = "popPassword")
	WebElement password;
	
	@FindBy(className = "button pull-right")
	WebElement signInBtn;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ValidatingLogin (String username, String pwd)
	
	{
		dropDown.click();
		usrname.sendKeys(username);
		password.sendKeys(pwd);
		signInBtn.click();
		
	}
		
	}

