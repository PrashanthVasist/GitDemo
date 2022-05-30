package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BigBasket {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/autotesting/BigBasket.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		Actions a = new Actions(driver);
		
		
		WebDriverWait w = new WebDriverWait(driver, 8);
		
		driver.get(prop.getProperty("url"));
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),' Shop by')]")));
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' Shop by')]"))).build().perform();
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='ng-scope']/a[contains(text(),'Cakes & Dairy') and @qa='catL1']")));
		a.moveToElement(driver.findElement(By.xpath("//li[@class='ng-scope']/a[contains(text(),'Cakes & Dairy') and @qa='catL1']"))).click().build().perform();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ng-scope']/span[contains(text(),'Rusk & Khari')]")));
		driver.findElement(By.xpath("//div[@class='ng-scope']/span[contains(text(),'Rusk & Khari')]")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='ng-binding']/span")));
		
//		driver.findElement(By.xpath("//input[@id='input']")).sendKeys(Keys.PAGE_DOWN);
		List <WebElement> names = driver.findElements(By.xpath("//div[@qa='product_name']/a"));
		
		String items [] = {"Biscuits - Badam Pista", "Cookies - Atta Desi Ghee", "Rusk - Classic", "Khari - Masala", "Garlic"};
		List <String> itemlist = Arrays.asList(items);
		
		/*for (int i=0;i<names.size();i++)
		{
			String name = names.get(i).getText();
			if (itemlist.contains(name))
				{
					driver.findElements(By.xpath("//button[@qa='add']")).get(i).click();
				}

		}*/
		
		for (int i=0;i<itemlist.size();i++)
		{
			for (int j=0;j<names.size();j++)
			{
				String name = names.get(j).getText();
				if (itemlist.get(i).equals(name))
				{
					driver.findElements(By.xpath("//button[@qa='add']")).get(j).click();
//					break;
				}
			}
		}
		
		a.moveToElement(driver.findElement(By.xpath("//a[@qa='myBasket']"))).build().perform();
		
//		Thread.sleep(8000);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@qa='itemsListMB']/descendant::span[@qa='priceMB']")));
		List <WebElement> price = driver.findElements(By.xpath("//li[@qa='itemsListMB']/descendant::span[@qa='priceMB']"));
		
		double total = 0;
		for (int k=0;k<price.size();k++)
		{
			String eaprice = price.get(k).getText();
//			System.out.println(eaprice);
			double deaprice = Double.parseDouble(eaprice);
			System.out.println(deaprice);
			total = total + deaprice;
		}
		
		String subtotal = driver.findElement(By.xpath("//span[@qa='subTotalMB']")).getText();
		double dsubtotal = Double.parseDouble(subtotal);
		
		Assert.assertEquals(total, dsubtotal);
		
		
		System.out.println("The Total amount needed to pay is "+total);
		
		
		
		
//		js.executeScript("arguments[0].scrollIntoView(true)", d);
//		d.click();
//		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ng-scope']/a[@qa='catL2']"));
//		System.out.println(list.toString());
		

		}
}
