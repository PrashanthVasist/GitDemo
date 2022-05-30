package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Airgas {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/Airgas.properties");
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		Actions a = new Actions(driver);
		
		
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Close']")));
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		
	
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='bottom-level-li']/a[contains(text(),'Safety Products')]")));
		a.moveToElement(driver.findElement(By.xpath("//li[@class='bottom-level-li']/a[contains(text(),'Safety Products')]"))).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement b = driver.findElement(By.xpath("//a[contains(text(),'Cut Res')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", b);
		b.click();
		
		//a[contains(@class,'link trigger') and contains(@href,'Safety-Produ')]
		
//		driver.findElement(By.xpath("//a[text()='Gloves']/preceding::li/ul/li/a[contains(text(),'Cut Res')]")).click();
		
	}

}
