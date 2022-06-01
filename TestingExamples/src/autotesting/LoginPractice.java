package autotesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//div[@id='login']/preceding::a")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> iter = s.iterator();
		String parent = iter.next();
		String child = iter.next();
		driver.switchTo().window(child);
		String username = driver.findElement(By.xpath("//a[contains(text(),'rahulshetty')]")).getText();
		
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(username);
		
		

	}

}
