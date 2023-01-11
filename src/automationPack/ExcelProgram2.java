package automationPack;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgram2 
{
	public static void main (String[]args) throws IOException
	{
		String address="E:\\Software Class\\Automation\\Automation\\Excel Selenium\\Excel Sheet Data for selenium.xlsx";
        FileInputStream file = new FileInputStream(address); //exception -accept
		
		//read the workbook
		XSSFWorkbook book1 = new XSSFWorkbook(file);  //exception -accept
		
		//read the sheet
		XSSFSheet sheet= book1.getSheet("Rahul");
		
		//read the row
		XSSFRow row1 = sheet.getRow(0);
		
		//read the cell/column		
		XSSFCell cell = row1.getCell(0);
		
		//read the data
		String username = cell.getStringCellValue();
		System.out.println(username);

	}
}
