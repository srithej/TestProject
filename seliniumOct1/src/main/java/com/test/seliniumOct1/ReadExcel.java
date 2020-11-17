package com.test.seliniumOct1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadExcel {

	@Test
	public void read() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\names.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet std=wb.getSheetAt(0);
		
		int nor=std.getPhysicalNumberOfRows();
		
		System.out.println("no.of rows: "+nor);
		
    XSSFRow Row = std.getRow(1);
    
   
    XSSFCell col=Row.getCell(1);
    
    System.out.println("1 st row 1 st coloumn value is:"+col.getStringCellValue());
		

		
		
	}
}
