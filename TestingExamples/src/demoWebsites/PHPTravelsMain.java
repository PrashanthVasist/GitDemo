package demoWebsites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/demoWebsites/phptravel.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("wcd"), prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.id("currency")).click();
		driver.findElement(By.xpath("//ul[@aria-labelledby='currency']/li/a[contains(text(),'INR')]")).click();
		
//		Thread.sleep(5000);	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-hotels_city-container")));
		
		driver.findElement(By.id("select2-hotels_city-container")).click();
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Bangalore");
		
	
		
	
//		driver.findElement(By.xpath("//ul[@id='select2-hotels_city-results']/li[contains(text(),'Bangkok')]")).sendKeys(Keys.ENTER);
		
		
		
		
	}

}
