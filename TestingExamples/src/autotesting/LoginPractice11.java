package autotesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginPractice11 {
		
		public LoginPractice11() throws FileNotFoundException
		{
				FileInputStream fis = new FileInputStream("D:\\Java\\Eclipse\\Testing\\Testing\\src\\autotesting\\Data.xlsx");
//				Workbook wb = new Workbook(fis);
		}
		public void loginValidation (String username, String password) {
		
		System.setProperty("webdriver.chrojme.driver", "C:\\Users\\Prashanth\\MyJava\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://obd-dev.cimm2.com/");
		driver.findElement(By.xpath("//li[@class='dropdown open']/a")).click();
		driver.findElement(By.id("popUserName")).sendKeys(username);
		driver.findElement(By.id("popPassword")).sendKeys(password);
		driver.findElement(By.className("button pull-right")).click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
