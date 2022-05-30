package autotesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.record.BookBoolRecord;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginPractice1 {

	public static Workbook book;
	static Sheet sheet;
	public static Object [][] getTestData (String sheetName) throws FileNotFoundException {
		
		File src = new File("D:\\Java\\Eclipse\\Testing\\Testing\\src\\autotesting\\Data.xlsx");
		

		try {
			FileInputStream fis = new FileInputStream(src);
			book = WorkbookFactory.create(fis);
		}
		catch (Exception e) 
		{
			System.out.println("Excel document is Encrypted");
		}
	
	sheet = book.getSheet(sheetName);
	Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for (int i=0;i<sheet.getLastRowNum();i++)
	{
		for (int j=0;j<sheet.getRow(0).getLastCellNum();j++)
		{
			data [i][j] = sheet.getRow(i+1).getCell(j).toString();
		}
	}
	
	return data;
			
	}
	
	
	
	public static void main(String username, String password) {
		
		
		LoginPractice1Child lgn = new LoginPractice1Child();
		lgn.loginValidation(username, password);
		

	}

}
