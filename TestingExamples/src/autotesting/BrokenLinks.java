package autotesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/Actions.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

//		Actions a = new Actions(driver);
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop"+Keys.DOWN+Keys.ENTER);
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		
		List <WebElement> urls = driver.findElements(By.xpath("//div[contains(@class,'VerticalRow')]/descendant::a"));
		
		SoftAssert sa = new SoftAssert();
		
		for (WebElement url : urls)
		{
			String surl = url.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(surl).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'VerticalRow')]/descendant::a")));
			int ResCode = conn.getResponseCode();
//			System.out.println(ResCode);
//			sa.assertTrue(ResCode>400, "The link "+url.getText()+" is broken with response code "+ResCode);
			sa.assertTrue(ResCode<400, "The link "+url.getText()+" is broken with response code "+ResCode);
		}
		
		sa.assertAll();
		
		
		
		
		
		
		
		
		
		/*List <WebElement> url = driver.findElements(By.xpath("//div[contains(@class,'VerticalRow')]/descendant::a"));
		for (int i=0;i<url.size();i++)
		{
			String surl = url.get(i).getAttribute("href"); 
			HttpURLConnection conn = (HttpURLConnection) new URL(surl).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
//			url.wait(1000);
			int ResCode = conn.getResponseCode();
			
			if (ResCode<400)
			{
				System.out.println(surl + " Link is working properly");
			}
		
			else if (ResCode>400)
			{
				System.out.println(surl +" Link is not working properly");
			}
		}*/
		
		
	}

}
