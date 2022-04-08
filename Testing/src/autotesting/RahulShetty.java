package autotesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShetty {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[3]")).click();
		Thread.sleep(3000);
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByIndex(3);
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		 
		
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys("Prashanth");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		List<WebElement> k = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		int sum = 0;
		for (int i=0; i<k.size();i++)
		{
			   int l = Integer.parseInt(k.get(i).getText());
			   sum = sum + l;
		}
		System.out.println(sum);
		//Select t = new Select(driver.findElement(By.name("radioButton")));
		//t.selectByVisibleText("Radio1");
		
		
		List<WebElement> p = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum1 = 0;
		for (int j=0;j<p.size(); j++)
		{
			
			int a =  Integer.parseInt(p.get(j).getText());
			sum1 = sum1 + a;
		}
			
		  String d = driver.findElement(By.className("totalAmount")).getText();
			int c = Integer.parseInt(d);
			System.out.println(c==sum1);
		
	}

}
