package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.findElement(By.cssSelector("*[frameborder='1']"));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		WebElement xpath = driver.findElement(By.xpath("//frameset[@name='frameset-middle']/child::frame[@name='frame-middle']"));
		driver.switchTo().frame(xpath);
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
