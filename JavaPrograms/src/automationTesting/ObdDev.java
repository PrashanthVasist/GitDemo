package automationTesting;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ObdDev {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Eclipse\\Testing\\Orgill\\config\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://obd-dev.cimm2.com/");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		WebElement password = driver.findElement(By.id("popPassword"));
		
		WebElement username = driver.findElement(By.id("popUsername"));
		username.sendKeys("DummyUser");
		password.sendKeys("Pikachu");
		System.out.println(password.getAttribute("type"));
		
		WebElement showHide = driver.findElement(By.xpath("//span[@toggle='#popPassword']/span"));
		System.out.println("Button says "+showHide.getText());
		
		boolean showBtn1 = showHide.getText().equals("show");
		boolean passType1 = password.getAttribute("type").equals("password");
		
		boolean valueTrue1 = (showBtn1 && passType1);
		
		showHide.click();
		System.out.println(password.getAttribute("type"));
		System.out.println("Button says "+showHide.getText());
		
		boolean showBtn = showHide.getText().equals("hide");
		boolean passType = password.getAttribute("type").equals("text");
		
		boolean valueTrue = (showBtn && passType);
		
		Assert.assertTrue(valueTrue);
		Assert.assertTrue(valueTrue1);
	}
}