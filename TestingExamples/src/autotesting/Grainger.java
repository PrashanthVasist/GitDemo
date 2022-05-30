package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grainger {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/data.properties");
		prop.load(fis);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.name("searchQuery")).sendKeys(prop.getProperty("TypeText"));
		 
		Thread.sleep(500);
		//Actions a = new Actions(driver);
		List <WebElement> options = driver.findElements(By.xpath("//div[@class='gcom__typeahead-results']/ul/li"));
		
		for (int i=0;i<options.size();i++)
		{
			String a = options.get(i).getText();
			if(a.equalsIgnoreCase(prop.getProperty("Name"))) {
				options.get(i).click();
				break;
			}
		}
		
	}

}
