package autotesting;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameRahulShetty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//div[@id='gf-BIG']/preceding-sibling::div/descendant::iframe")).sendKeys(Keys.END);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Discount Coupons')]"))).build().perform();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='gf-BIG']/preceding-sibling::div/descendant::iframe")));
		List <WebElement> names = driver.findElements(By.xpath("//div[@class='inner-box']/h3/a"));
		String sc = "LEARNING PATH";
		
		for (int i=0;i<names.size();i++)
		{
			String name = names.get(i).getText();
			if (sc.contains(name))
			{
				driver.findElements(By.xpath("//div[@class='carousel-item col-md-3'] //a[@class='arrow-box']")).get(i).click();
				System.out.println(driver.findElement(By.xpath("//div[@class='inner-box']")).getText());
			}
			else
			{
				System.out.println("Entered name doesn't match");
			}
			
		}
		driver.close();

	}

}
