package automationTesting;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List <WebElement> pricelist = driver.findElements(By.xpath("//div[@class='inventory_item']/descendant::div[@class='inventory_item_price']"));
		List <Double> decimal = new ArrayList<>();
		
		for (int i=0;i<pricelist.size();i++)
		{
			String StrPrice = pricelist.get(i).getText().replace("$", "");
			double ActPrice = Double.parseDouble(StrPrice);
		}
		
	}

}
