package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginExcelData {
	
	public static WebDriver driver;
	
	@Test (dataProvider = "getData")
	public void validateLoginPg(String username, String pwd) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object obj[][] = new Object[2][2];
		obj [0][0] = "Ullas@KarForest.com";
		obj [0][1] = "Machi";
		
		obj [1][0] = "Vinay@Accenture.com";
		obj [1][1] = "9620574180";
		return obj;
	}

	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}
	
/*	public static void main(String username, String pwd) {
		LoginRahulDP login = new LoginRahulDP();
		login.validateLoginPg(username, pwd);
	}*/
}





