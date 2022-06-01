package autotesting;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPractice1Child {
	
	String sheetName = "LoginCredentials";
	@Test(dataProvider = "getTestData")
	public void loginValidation (String username, String password) {
		
		System.setProperty("webdriver.chrojme.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://obd-dev.cimm2.com/");
		driver.findElement(By.xpath("//li[@class='dropdown open']/a")).click();
		driver.findElement(By.id("popUserName")).sendKeys(username);
		driver.findElement(By.id("popPassword")).sendKeys(password);
		driver.findElement(By.className("button pull-right")).click();
		
	}
	@DataProvider
	public Object [][] getTestData() throws FileNotFoundException
	{
		Object obj [][] = LoginPractice1.getTestData(sheetName);
				return obj;
	}
}
