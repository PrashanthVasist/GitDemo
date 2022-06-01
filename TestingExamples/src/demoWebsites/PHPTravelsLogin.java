package demoWebsites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsLogin {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/demoWebsites/phptravelsLogin.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 20);
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.xpath("//button[@type='submit']/span[contains(text(),'Login')]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sidebar-menu-wrap']/descendant::a[contains(text(),'My Bookings')]")));
		driver.findElement(By.xpath("//div[@class='sidebar-menu-wrap']/descendant::a[contains(text(),'My Bookings')]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td/div/a")).click();
		driver.getWindowHandle();
	}

}
