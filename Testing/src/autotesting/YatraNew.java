package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YatraNew {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/autotesting/Yatra.properties");
		prop.load(fis);
		
	    
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("getProp"));
		WebDriver driver = new ChromeDriver();
		
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		WebDriverWait w = new WebDriverWait(driver,10);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("BE_flight_origin_city")));
		//Thread.sleep(5000);
		WebElement a = driver.findElement(By.id("BE_flight_origin_city"));
		a.click();
		//Thread.sleep(5000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Bangalore')]")));
		driver.findElement(By.xpath("//*[contains(text(),'Bangalore')]")).click();
		//Thread.sleep(5000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("BE_flight_arrival_city")));		
		WebElement b = driver.findElement(By.id("BE_flight_arrival_city"));
		b.click();
		
		//Thread.sleep(5000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text()," + prop.getProperty("Dest") + ")]")));
		driver.findElement(By.xpath("//p[contains(text()," + prop.getProperty("Dest") + ")]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("BE_flight_origin_date")));
		driver.findElement(By.id("BE_flight_origin_date")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("month-title")));
		List<WebElement> month = driver.findElements(By.className("month-title"));
		
		String monthAct = prop.getProperty("ActMon");
		for (int i=0;i<month.size();i++)
		{
			String c = month.get(i).getText();
			if (c.contains(monthAct))
			{
				driver.findElement(By.id("07/04/2022")).click();
			}
			else
			{
				System.out.println("Date Not Found");
			}
		}
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(@class,'icon icon-angle')]")));
		driver.findElement(By.xpath("//i[contains(@class,'icon icon-angle')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-flightagegroup='adult']/div/div/span[@class='ddSpinnerPlus']")));
		driver.findElement(By.xpath("//div[@data-flightagegroup='adult']/div/div/span[@class='ddSpinnerPlus']")).click();
		
		System.out.println("Checking flight availability for "+driver.findElement(By.xpath("//label[contains(@class,'traveller')]/following-sibling::span[contains(@class,'total')]")).getText()+" persons");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='BE_flight_non_stop']/preceding-sibling::i[@class='ico ico-checkbox']")));
		WebElement tick = driver.findElement(By.xpath("//input[@id='BE_flight_non_stop']/preceding-sibling::i[@class='ico ico-checkbox']"));
		tick.click();
		
		Assert.assertTrue(tick.isEnabled());
		/*if (tick.isEnabled())
		{
			System.out.println("Non Stop Flight is Clicked");
		}
		else
		{
			System.out.println("Non Stop Flight is not Clicked");
		}*/
		
		//driver.findElement(By.xpath("//div[@class='ripple-parent search-height demo-icon icon-go']/input")).click();
	/*	String From;
		for (int i=0;i<From.length();i++)
		{
			
		}*/
		
		
		
	}

}
