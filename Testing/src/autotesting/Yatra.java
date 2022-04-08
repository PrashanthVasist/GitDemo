package autotesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/Yatra.properties");
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", prop.getProperty("getProp"));
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		WebElement a = driver.findElement(By.id("BE_flight_origin_city"));
		a.click();
		Thread.sleep(5000);
		a.clear();
		a.sendKeys(prop.getProperty("From"));
		Thread.sleep(3000);
		a.sendKeys(prop.getProperty("From"));
		a.sendKeys(Keys.ENTER);
		WebElement b = driver.findElement(By.id("BE_flight_arrival_city"));
		b.clear();
		b.sendKeys(prop.getProperty("Dest"));
		Thread.sleep(3000);
		b.sendKeys(prop.getProperty("Dest"));
		Thread.sleep(3000);
		b.sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//li[@class='initial-tab flex1
		// safariFix__field'] //input[@id='BE_flight_origin_city']")).sendKeys("Bang");

	}

}
