package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Twitter {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/autotesting/Twitter.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.gecko.driver", prop.getProperty("getPropGecko"));
		WebDriver driver = new FirefoxDriver();
		WebDriverWait w = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//a[@data-testid='signupButton']")).click();
		WebElement b = driver.findElement(By.xpath("//div[contains(@class,'css-901oao r-1awozwy')]/input[@type='text']"));
		b.sendKeys("Hello");
		b.sendKeys(Keys.TAB+"45653531");
		
		WebElement d = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-eqz5dr r-1ah4tor r-vmopo1']/div[@class='css-1dbjc4n']"));
		//System.out.println(d.getText());
		String text = d.getText();
		text.equals(prop.getProperty("PhoneActString"));
		
		driver.findElement(By.xpath("//div[contains(@class,'z r-1r')]/div/select[@id='SELECTOR_1']")).click();
		Select mon = new Select(driver.findElement(By.xpath("//div[contains(@class,'z r-1r')]/div/select[@id='SELECTOR_1']")));
		mon.selectByVisibleText(prop.getProperty("month"));
		
		driver.findElement(By.xpath("//div[contains(@class,'2uox r-1b')]/select[@id='SELECTOR_2']")).click();
		Select dat	= new Select(driver.findElement(By.xpath("//div[contains(@class,'2uox r-1b')]/select[@id='SELECTOR_2']")));
		//dat.selectByIndex(1);
		dat.selectByVisibleText(prop.getProperty("date"));
		
		driver.findElement(By.xpath("//div[contains(@class,'2uox r-1b')]/following-sibling::div/select")).click();
		Select yea = new Select(driver.findElement(By.xpath("//div[contains(@class,'2uox r-1b')]/following-sibling::div/select")));
		yea.selectByVisibleText(prop.getProperty("year"));
		//yea.selectByValue(prop.getProperty("year"));
		
		WebElement text2 = driver.findElement(By.xpath("//div[contains(@class,'oao r-k20')]/span"));
		String ActText = text2.getText();
		
		Assert.assertEquals(ActText, prop.getProperty("PhoneActString"));
		
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
		
		
		
		
		
		

	}

}
