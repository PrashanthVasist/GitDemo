package autotesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Control {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.navigate().back();
		//driver.navigate().forward();
		List <WebElement> a = driver.findElements(By.xpath("//*[contains(text(),'Discount')]/ancestor::ul/li/a"));
		//driver.findElement(By.xpath("//*[contains(text(),'Discount')]")).sendKeys(Keys.END);
		for (int i=0;i<a.size();i++)
		{
			//String b = Keys.chord(Keys.CONTROL, Keys.ENTER);
			a.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(3000);
		}
		
		String mainwindow = driver.getWindowHandle();
		Set <String> b = driver.getWindowHandles();
		List <String> c = new ArrayList(b);
		
		for(int j=0;j<c.size();j++)
		{
			driver.switchTo().window(c.get(j));
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().window(mainwindow);

	}

}
