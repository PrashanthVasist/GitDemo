package autotesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Google {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Hello");
		
		Robot robot = new Robot();
		Actions a =  new Actions(driver);
		
		Set <String> windows = driver.getWindowHandles();
		
		List <WebElement> footlist = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		
		for (int i=0;i<footlist.size();i++)
		{
//			a.moveToElement(footlist.get(i)).keyDown(Keys.CONTROL).click().build().perform();
//			a.contextClick(footlist.get(i)).sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
			a.contextClick(footlist.get(i)).build().perform();
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
		}
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
//		String num ="4";
//		Thread.sleep(5000);
//		driver.switchTo().window("Business");
//		driver.switchTo().window(WindowType.TAB);
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@aria-label='Restaurants']"));
		
	}

}
