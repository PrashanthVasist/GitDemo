package demoWebsites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public class SpringTool {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/demoWebsites/Spring.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("wfd"), prop.getProperty("firefox"));
		WebDriver driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.id("switch-theme")).click();
		
		Actions a = new Actions(driver);
		
		WebDriverWait w = new WebDriverWait(driver, 15);
		
//		WebElement headdriver = driver.findElement(By.id("//nav[@id='nav']"));
		
//		List <WebElement> dropdown = driver.findElements(By.xpath("//ul[@id='nav-items']/li/div"));
		
		
		List <WebElement> list = driver.findElements(By.xpath("//div[@id='dropdown-menus']/descendant::a"));
			System.out.println(list.size());
		
		
		a.moveToElement(driver.findElement(By.id("why-target"))).build().perform();
		List <WebElement> fl = driver.findElements(By.xpath("//div[@id='dropdown-menus']/div[@id='why-items']/descendant::li/a"));
		for (int i=0;i<fl.size();i++)
		{
			a.moveToElement(fl.get(i)).build().perform();
			a.keyDown(Keys.LEFT_CONTROL).click().build().perform();
			
		}
		
		
		a.moveToElement(driver.findElement(By.id("learn-target"))).build().perform();
		List <WebElement> sl = driver.findElements(By.xpath("//div[@id='dropdown-menus']/div[@id='learn-items']/descendant::li/a"));
		for (int j=0;j<sl.size();j++)
		{
			a.moveToElement(sl.get(j)).build().perform();
			a.keyDown(Keys.LEFT_CONTROL).click().build().perform();
			
		}
		
		
		a.moveToElement(driver.findElement(By.id("project-target"))).build().perform();
		List <WebElement> tl = driver.findElements(By.xpath("//div[@id='dropdown-menus']/div[@id='project-items']/descendant::li/a"));
		for (int k=0;k<tl.size();k++)
		{
			a.moveToElement(tl.get(k));
			a.keyDown(Keys.LEFT_CONTROL).click().build().perform();
			
		}
		
		
		
		
		
		/*for (int i=0;i<dropdown.size();i++)
		{
			a.moveToElement(dropdown.get(i)).perform();
			for (int j=0;j<list.size();j++)
			{
//				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dropdown-menus']/descendant::a")));
				a.moveToElement(list.get(j)).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			}
		}
		
		
		
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='why-target']"))).build().perform();
		
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dropdown-menus']/descendant::li[1]/a")));
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='dropdown-menus']/descendant::li[1]/a"))).build().perform();
		a.keyDown(Keys.LEFT_CONTROL).click().build().perform();*/
	}

}
