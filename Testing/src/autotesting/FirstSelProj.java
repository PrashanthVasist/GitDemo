package autotesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelProj {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://obd-dev.cimm2.com/");
		
	    WebElement v = driver.findElement(By.xpath("//button[@id='SearchCategory']"));
	    System.out.println(v.getText());
	    v.click();
		
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='input-group-btn dropdown hideForIpad open']/ul/li"));
		System.out.println(l.size());
		
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//input[@id='rememberMeDrop']")).isSelected();
		driver.findElement(By.xpath("//input[@id='rememberMeDrop']")).click();
		//driver.findElement(By.xpath("//input[@id='rememberMeDrop']")).isSelected();
		
		
		/*driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//input[@id='popUserName']")).sendKeys("orgilltestuser19@unilogcorp.com");
		driver.findElement(By.xpath("//input[@id='popPassword']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@id='popPassword']")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//button[@class='button pull-right']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("Dispensers");
		driver.findElement(By.xpath("//div[@class='input-group-btn']/button")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		driver.close();
		
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		//driver.findElement(By.xpath("//ul[@class='myAccountMenu dropdown-menu']/li[8]/a")).click();
		
		
		//driver.get("https://www.youtube.com/");
		//driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Ninna Gungalle");
		//driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).click();
		//driver.close();
		//driver.get("https://www.google.com");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Vinay is a good teacher");
		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]")).click();
	}
}
