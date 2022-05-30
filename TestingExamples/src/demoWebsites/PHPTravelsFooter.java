package demoWebsites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PHPTravelsFooter {

	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/about-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("cookie_stop")).click();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys(Keys.END);
		
		List <WebElement> sm = driver.findElements(By.xpath("//ul[@class='social-profile']/li/a"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i=0;i<sm.size();i++)
		{
			js.executeScript("arguments[0].click();", sm.get(i));
		}
		
		String parentwindow = driver.getWindowHandle();
		Set <String> windows = driver.getWindowHandles();
		
		List <String> listwindow = new ArrayList <String>(windows);
		if (getLinks("YouTube", listwindow))
		{
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		}
		
		
	}


	public static boolean getLinks(String WindowTitle, List <String> listwindow ) throws AWTException
	{
		for (int i=0;i<listwindow.size();i++)
		{
			String Title = driver.switchTo().window(listwindow.get(i)).getTitle();
			if(Title.contains(WindowTitle))
			{
				System.out.println("You are at proper window");
				return true;
			}
			
		}
		return false;
		
	}
}	