package autotesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventCalender  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("travel_date")).getText());
		driver.findElement(By.id("travel_date")).click();
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("March"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}

		List <WebElement> element = driver.findElements(By.className("day"));
		for (int i=0;i<element.size();i++)
		{
			String a = element.get(i).getText();
			if(a.equals("22"))
					{
				          element.get(i).click();
					}
		}
		
		System.out.println(driver.findElement(By.id("travel_date")).getText());
		
	}

}