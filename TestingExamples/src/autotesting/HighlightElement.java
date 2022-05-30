package autotesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		driver = new ChromeDriver();
        //To launch gmail.com
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
        //Collects the webelement
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		ele.sendKeys("Hello");
        //Create object of a JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments
        //Here i pass values based on css style. Yellow background color with solid red color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);

	}

}
