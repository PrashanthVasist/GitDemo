package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.Base;
import pageObjects.LoginPage;

public class LoginPageTest extends Base {

	public WebDriver driver;
	
	public LoginPageTest(WebDriver driver)
	{
		super();
	}
	public void initialize() 
	{
		driver = initialization();
	}
	@Test (dataProvider = "getData")
	public void validatingLoginPg (String username, String pwd)
	{
		LoginPage lp = new LoginPage(driver); 
		lp.ValidatingLogin(username, pwd);
		
		
	}
	
	@DataProvider
	public Object [][] getData()
	
	{
	Object obj [][] = new Object[1][2];
	
	obj[0][0] = "ogrilltestuser19@unilogcorp.com";
	obj[0][1] = "Test@1234";
	return obj;
	}
	
}
