package autotesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Airbnb {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bigsearch-query-location-input")));
//		driver.findElement(By.id("bigsearch-query-location-input")).sendKeys("Mysore");
		
		driver.findElement(By.xpath("//div[text()='Any week']")).click();
		
		driver.findElement(By.xpath("//button[text()='Choose dates']")).click();
		
		String month = driver.findElement(By.xpath("//div[@class='_1lds9wb'][1]/descendant::h2")).getText();
		
		
		System.out.println(month);
		
	/*	while (!month.equals("September 2022"))
		{
			
			driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
//			break;
			Thread.sleep(3000);
		}*/
		
	/*	boolean bool = true;
		for (int i=0;i>-1;i++)
		{
			/*for (int j=0;j<1;j++)
			{
				driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
				Thread.sleep(5000);
			} //ENDED
			
			driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
			Thread.sleep(3000);
			if (month.equals("September 2022"))
			{
				break;
			}
		}*/
		while (!month.equals("July 2022"))
		{
			driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
		}
		
//		driver.findElement(By.xpath("//button[@class='_8bn4ek6']")).click();
		
		System.out.println(driver.getPageSource());
		/*Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("phoneInputphoneNumber")).sendKeys("8904110292");
		driver.findElement(By.xpath("//button[@data-testid='signup-login-submit-btn']")).click();*/
		
		
		System.out.println(month);
		
		
	}

}
