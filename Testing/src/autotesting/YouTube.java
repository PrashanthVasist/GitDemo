package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/YouTube.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.gecko.driver", prop.getProperty("getPropGecko"));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,10);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("div[id='search-input'] input")).sendKeys(prop.getProperty("Input1"));
		Actions a = new Actions(driver);
		
		WebElement d = driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon"));
		a.moveToElement(d).click().build().perform();
		
		
		WebElement c = driver.findElement(By.xpath("//div[@id='contents' and contains(@class,'style-scope')]/ytd-video-renderer[1]/descendant::img[@id='img'][1]"));
		a.moveToElement(c).click().build().perform();
		//driver.findElement(By.className("ytp-play-button ytp-button")).click();
		
		WebElement fulscr = driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")));
		a.moveToElement(fulscr).click().build().perform();
		
		WebElement mid = driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']"));
		a.moveToElement(mid).click().build().perform();
		
		WebElement vol = driver.findElement(By.xpath("//span[@class='ytp-volume-area']/button"));
		a.moveToElement(vol).moveByOffset(2, 0).build().perform();
		
	}

}
