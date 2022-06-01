package demoWebsites;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObdDev1 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://obd-dev.cimm2.com/");
		
		WebDriverWait w = new WebDriverWait(driver, 10);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Products']"))).build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='megaMenuFlyout megaMenuFlyout-open']")));

//		Thread.sleep(5000);
//		List <WebElement> fl = driver.findElements(By.xpath("//ul[@class='sliding-menu']/li/a[not(contains(text(),'View'))]"));
		List <WebElement> fl3 = driver.findElements(By.xpath("//ul[@class='sliding-menu']/li[@data-category='171559']/preceding-sibling::li/a"));
		
		for (int i=0;i<fl3.size();i++)
		{
			move(fl3.get(i));
		}
		

	}

	public static void move(WebElement m1)
	{
		Actions a = new Actions(driver);
		a.moveToElement(m1).build().perform();
		List <WebElement> flchild = driver.findElements(By.xpath("//section[@style='display: block;']/div/ul[contains(@class,'sliding-menu subMenu_')]/li/a[not (contains(text(),'View All'))]"));
		
		for (int i=0;i<flchild.size();i++)
		{
			a.moveToElement(flchild.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			
		}
	}
}
