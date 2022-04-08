package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADStaging {

	public static void main(String[] args) throws InterruptedException {
		


			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://ad-staging.unilogcorp.com/cx1/view/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("JohnSmith123@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Unilog123##");
			driver.findElement(By.xpath("//span[@role='button']")).click();
			driver.findElement(By.xpath("//button[@class='button  ']")).click();
			
			
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//div[@class='component compCheckBox mobile-1']")).click();
	}
}
