package automationTesting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Airbnb {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashanth\\MyJava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.airbnb.co.in/");
		
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		driver.findElement(By.xpath("//div[text()='Any week']")).click();
		driver.findElement(By.id("tab--tabs--0")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		String [] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//		List<String> MonthList = Arrays.asList(Months);
		
		String MonthNeed = "December 2022";
		
//		String year = MonthNeed.split(" ")[1];
		
		int NeedMonthNumber = 0;
		for (int i=0;i<Months.length;i++)
		{
			if (MonthNeed.contains(Months[i]))
				{
					NeedMonthNumber=i;
				}
		}
		
		String CurrMonth = driver.findElement(By.xpath("//div[@class='_1lds9wb'][1]/descendant::h2")).getText();
		int CurrMonthNumb=0;
		for (int j=0;j<Months.length;j++)
		{
			if (CurrMonth.contains(Months[j]))
				{
					CurrMonthNumb=j;
				}
		}
		
		
		
//	    WebElement monthTitle = driver.findElement(By.xpath("//h2[contains(text(),'"+MonthNeed+"')]"));
//		WebElement monthOld = driver.findElement(By.xpath("//div[@class='_1lds9wb'][2]/descendant::h2"));

//		String month = driver.findElement(By.xpath("//div[@class='_1lds9wb'][1]/descendant::h2")).getText();
//		WebElement button = driver.findElement(By.xpath("//div[@class='_13tn83am']/button"));
	    
		WebElement NextBtn = driver.findElement(By.xpath("//div[@class='_13tn83am']/button"));
		
		if (NeedMonthNumber-CurrMonthNumb>1)
		{
	    while (NextBtn.isDisplayed())
	    {
	    	driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
	    	if (driver.findElement(By.xpath("//div[@class='_1lds9wb'][2]/descendant::h2")).getText().contains(MonthNeed))
	    	{
	    		break;
	    	}
	    }
		}
		
		else if (NeedMonthNumber-CurrMonthNumb<0)
		{
	    while (NextBtn.isDisplayed())
	    {
	    	driver.findElement(By.xpath("//div[@class='_nztsc8l']/button")).click();
	    	if (driver.findElement(By.xpath("//div[@class='_1lds9wb'][2]/descendant::h2")).getText().contains(MonthNeed))
	    	{
	    		break;
	    	}
	    }
		}
		
	  /*  for (int i=1;i>0;i++)
	    {
	    	driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
	    	if (monthOld.getText().equals(MonthNeed))
	    	{
	    		break;
	    	}
	    }*/
	    
	    
	    /*while (!month.isDisplayed() && monthTitle.isDisplayed())
		{
			driver.findElement(By.xpath("//div[@class='_13tn83am']/button")).click();
		}*/
		
		//!"" || 
		
//		System.out.println(month);

	}

}
