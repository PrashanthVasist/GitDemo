package com.heroKuApp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class heroKuBase {
	
	public static Properties prop;
	public static WebDriver driver;

	public static WebDriver InitializeDriver()
	{
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(("user.dir")+"/config/config.properties");
			prop.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("Configuration File is Not Found");
		}
		
		
		String BrowserName = prop.getProperty("Browser");
		
		if (BrowserName.equals("chrome"))
		{
			System.setProperty("webriver.chrome.driver", prop.getProperty("ChromePath"));
			driver = new ChromeDriver();
		}
		else if (BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxPath"));
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver", prop.getProperty("EdgePath"));
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	

}
