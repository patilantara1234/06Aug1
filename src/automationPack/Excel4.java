package automationPack;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel4 
{
	public static void main (String[]args) throws IOException
	{
		String address="E:\\Software Class\\Automation\\Automation\\Excel Selenium\\Excel Sheet Data for selenium.xlsx";
		FileInputStream file = new FileInputStream(address); 
		XSSFWorkbook book = new  XSSFWorkbook(file); 
//		String result1 = book.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
//		System.out.println(result1);
		
        double result2 = book.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
        int x=(int)result2;
		System.out.println(x);
		
		double result3 = book.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		int y=(int)result3;
		System.out.println(y);
		
		
		
		
		for (int i=0;i<x;i++)
		{
		
		//String data0= sheet.getRow(i).getcell(0).getStringCellValue();
		
		System.out.println("data from row"+i+"is"+ x);
		for (int j=0; j<y; j++);
		{
			System.out.println();
		}
		}
			
					
	
	
	}

}
