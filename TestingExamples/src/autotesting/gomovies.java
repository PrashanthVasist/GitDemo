package autotesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gomovies {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gomovies.film");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/div/ul/li[4]"))).click().build().perform();
		driver.findElement(By.xpath("//*[@class='movies-list movies-list-full']/div[8]")).click();
	}

}
