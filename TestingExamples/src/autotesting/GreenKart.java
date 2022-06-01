package autotesting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String a[] = {"Cauliflower", "Cucumber", "Beetroot", "Carrot", "Musk Melon", "Garlic"};
		List <WebElement> element = driver.findElements(By.className("product-name"));
		//int j=0;
		
		for (int i=0;i<element.size();i++)
		{
			String c[] = element.get(i).getText().split(" - ");
			//String word = c[0].trim();
			List <String> list = Arrays.asList(a);
			
			if(list.contains(c[0]))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//j++;
				
				/*if(j==a.length)
				{
					break;
				}*/
			}
			
			
		}
		
		
		}

}
