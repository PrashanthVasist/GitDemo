package autotesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Robo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
//		WebElement about = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		Robot robot = new Robot();
		
		List <WebElement> footer = driver.findElements(By.cssSelector("div[class='KxwPGc AghGtd'] a"));
		
		for (int k=0;k<footer.size();k++)
		{
			
			a.contextClick(footer.get(k)).build().perform();
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
		}
		

		
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		List <String> list  = new ArrayList<String> (windows);
		for (int i=0;i<list.size();i++)
		{
			driver.switchTo().window(list.get(i));
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().window(parent);
		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Images')]")));
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
	}

}
