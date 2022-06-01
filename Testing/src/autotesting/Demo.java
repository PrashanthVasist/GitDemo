package autotesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://obd-dev.cimm2.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown active megaMenu']"))).build().perform();
		Thread.sleep(1000);
		a.moveToElement(driver.findElement(By.xpath("//a[@href='171555/category/Electrical']"))).build().perform();
		a.moveToElement(driver.findElement(By.partialLinkText("Batteries & Accessories"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("View All Batteries & Accessories"))).click().build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//div[@class='col-md-3'][1]/div/ul[1]/li[2]/a"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		element.click();
	}
	

}
