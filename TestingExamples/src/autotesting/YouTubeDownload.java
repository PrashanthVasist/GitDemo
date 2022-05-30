package autotesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeDownload {

	public static void main(String[] args) throws FileNotFoundException, IOException, AWTException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/autotesting/YouTubeDownload.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("wgd"), prop.getProperty("firefox"));
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		WebDriverWait w = new WebDriverWait(driver, 15);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search' and @type='text']")));
		WebElement input = driver.findElement(By.xpath("//input[@id='search' and @type='text']"));
		input.sendKeys("Radha-Jayalakshmi - Sangeet Sammelan Programme, 1965");
		input.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//button[@id='search-icon-legacy']/yt-icon")).click();
		
		driver.findElement(By.xpath("//div[@id='contents']/ytd-video-renderer[1]")).click();
		
		
//		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[contains(@class,'container countdown-next')]")));
		
		Robot robot = new Robot();
		
		String newurl = driver.getCurrentUrl();
//		String parentwindow = driver.getWindowHandle();
		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_T);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.get("https://en.savefrom.net/");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(newurl);
		driver.findElement(By.id("sf_submit")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='def-btn-box']/a"))).click();
		
		
		
//		driver.switchTo().window(parentwindow)
		
		
		
		
		
	}

}
