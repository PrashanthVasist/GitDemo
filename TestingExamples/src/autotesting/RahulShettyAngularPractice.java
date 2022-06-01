package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RahulShettyAngularPractice {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/RahulShettyAngular.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait(driver, 5);
		
		WebElement date = driver.findElement(By.name("bday"));
		int width = date.getRect().getDimension().getWidth();
		
		Actions a = new Actions(driver);
		a.moveToElement(date, width, 0).build().perform();
		a.click();

	}

}
