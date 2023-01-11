package automationPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel5 
{
public static void main(String[] args) throws IOException 
{
	File src=new File ("E:\\Software Class\\Automation\\Automation\\Excel Selenium\\Excel Sheet Data for selenium.xlsx");
	FileInputStream fis = new FileInputStream(src); 
	XSSFWorkbook wb = new  XSSFWorkbook(fis); 
	XSSFSheet Sheet1=wb.getSheetAt(0);
	
	int rowCount=Sheet1.getLastRowNum();
	
	System.out.println("Total Row is -->>"+rowCount+1 );
	
	
	for (int i=0;i<rowCount;i++)
	{
	
	String data0=Sheet1.getRow(i).getCell(0).getStringCellValue();
	
	System.out.println("data from row -->>"+i+"is "+ data0);
	
	}
	wb.close();
}
}
