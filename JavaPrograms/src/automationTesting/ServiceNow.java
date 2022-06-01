package automationTesting;
	
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceNow {

	public static Actions act;
	public static WebDriver driver;
	public static Robot robo;
	public static WebDriverWait wait;
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Eclipse\\Testing\\Orgill\\config\\chromedriver.exe");
		driver = new ChromeDriver();
		robo = new Robot();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.servicenow.com/");
		
		act = new Actions(driver);
		
		driver.findElement(By.id("truste-consent-button")).click();
		
		String header = "products";   //Replace String value with products or solutions
		String leftCol = "WORKFLOWS"; //Replace String value with SOLUTIONS AREAS or WORKFLOWS
		
		WebElement sublinks = driver.findElement(By.xpath("//li[@rel='"+header+"Nav']"));
		solutions(sublinks, leftCol);
		
	}
	
	public static void solutions(WebElement sublinks, String leftCol) throws InterruptedException, AWTException
	{
		sublinks.click();
		List <WebElement> links = driver.findElements(By.xpath("//h3[contains(text(),'"+leftCol+"')]/following-sibling::ul/li[not(@class='divider margin-0x10')]"));
			
		for (WebElement subLinks : links)
		{
			getLinks(subLinks);
		}
	}
	
	
	public static void getLinks(WebElement subLinks) throws InterruptedException, AWTException
	{
		
		act.moveToElement(subLinks).build().perform();
		List <WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'col-12 col-md-4 col-lg-3 data-layer-level-2 active') and @style='display:block']/ul/li[not(@class='hidden-on-desktop')]/a"));
		Thread.sleep(500);
		for (WebElement link : links)
		{
			act.contextClick(link).build().perform();
			Thread.sleep(2000);
//			robo.keyPress(KeyEvent.VK_CONTEXT_MENU);
//			robo.keyRelease(KeyEvent.VK_CONTEXT_MENU);
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

		}
		
	}
}