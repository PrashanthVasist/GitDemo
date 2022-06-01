package automationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirbnbOldMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.airbnb.co.in/");
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		driver.findElement(By.xpath("//div[text()='Any week']")).click();
		driver.findElement(By.id("tab--tabs--0")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		
		
		WebElement month = driver.findElement(By.xpath("//div[@class='_1lds9wb'][1]/descendant::h2"));
		
		while (!month.isDisplayed())
		{
			driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
		}
	}

}
