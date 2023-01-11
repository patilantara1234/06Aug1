package automationPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet3 
{
	public static void main (String[]args) throws IOException
	{
	String address="E:\\Software Class\\Automation\\Automation\\Excel Selenium\\Excel Sheet Data for selenium.xlsx";
	FileInputStream file = new FileInputStream(address); 
	XSSFWorkbook book = new  XSSFWorkbook(file); 
//	XSSFSheet sheet= book.getSheet("Sheet1");
//	XSSFRow row = sheet.getRow(1);
//	XSSFCell cell = row.getCell(2);
//	
//    String username = cell.getStringCellValue();
//    System.out.println(username);
		
   // String address1="E:\\Software Class\\Automation\\Automation\\Excel Selenium\\Excel Sheet Data for selenium.xlsx";
	//FileInputStream file1 = new FileInputStream(address1); 
//	XSSFWorkbook book1 = new  XSSFWorkbook(file1); 
//	XSSFSheet sheet1= book1.getSheet("Sheet1");
//	XSSFRow row1 = sheet1.getRow(0);
//	XSSFCell cell1 = row1.getCell(1);
//    String username1 = cell1.getStringCellValue();
//    System.out.println(username1);
    
    String result1 = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(result1);
	
	String result2 = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	 System.out.println(result2);
    
    
    
    
    
	}
}
