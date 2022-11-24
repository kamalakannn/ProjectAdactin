package com.adactin.Hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String args[]) throws Throwable {
		
		
		File f = new File("D:\\user\\Desktop\\demo10.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		/*wb.createSheet("password").createRow(0).createCell(0).setCellValue("user");
		
		wb.getSheet("password").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("password").getRow(0).createCell(2).setCellValue("login");
		
		wb.getSheet("password").createRow(1).createCell(0).setCellValue("kamalaka267");
		wb.getSheet("password").getRow(1).createCell(1).setCellValue("Kamal@267");
		wb.getSheet("password").getRow(1).createCell(2).setCellValue("login");
		
		*/
		//FileOutputStream fos = new FileOutputStream("D:\\\\user\\\\Desktop\\\\demo10.xlsx");

		//wb.write(fos);
		//wb.close();
		
		
		 Sheet at = wb.getSheetAt(0);
		 
		 int a = at.getPhysicalNumberOfRows();
		for(int i=1;i<a;i++) {
			Row ro = at.getRow(i);
			int b = ro.getPhysicalNumberOfCells();
			for(int j=0;j<b;j++) {
			Cell ce= ro.getCell(j);	
			CellType ty =ce.getCellType();
			if(ty.equals(CellType.NUMERIC)) {
				System.out.print(ce.getNumericCellValue()+ " ");
			}
			else {
				System.out.print(ce.getStringCellValue()+ " ");
			}
			
			
				
				
			}
			
			System.out.println();
			
			
		
			
				
		}
		
		
			
		
		System.out.println("s");
		
		
		
	}
	
	
	
}
