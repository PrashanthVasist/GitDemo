package demoWebsites;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnilogCalender {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://obd-dev.cimm2.com/EventCalendar");
		
		String date = "15/SEPTEMBER/2022";
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MMMM/YYYY");
		
		Date obj;
	/*	try {
			sdf.setLenient(false);
			obj = sdf.parse(date);
			cal.setTime(obj);
			int tDay = cal.get(Calendar.DAY_OF_MONTH);
			int tMonth = cal.get(Calendar.MONTH);
			int tYear = cal.get(Calendar.YEAR);
			
			String presMonth = driver.findElement(By.xpath("//a[@class='monthTitle']")).getText();
			
			cal.setTime(cal.setTime(new simpleDateFormat("MMMM")));
			}*/
		
		
	}

}
