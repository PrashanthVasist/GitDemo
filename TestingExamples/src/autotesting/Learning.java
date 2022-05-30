package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.manage().window().maximize();
		x.get("http://www.facebook.com");
		x.findElement(By.id("email")).sendKeys("8904110292");
		x.findElement(By.id("pass")).sendKeys("131749");
		//Thread.sleep(5000);
		x.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(5000);
		//x.close();
		

	}

}
