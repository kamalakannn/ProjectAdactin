package com.adactin.Hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class bankOfAmerica extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		driver = borsweLanuch("Chrome");
        urlPass("https://www.bankofamerica.com/");		
	  /* WebElement ele =driver.findElement(By.xpath("//input[@placeholder='User ID']"));	
	   ele.sendKeys("kamalaka");
	   WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("Kamal@267");
	WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
	login.click();*/
    //String file = "D:\\user\\Desktop\\demo3.xlsx";
	//File f = new File(file);
	//FileInputStream fis = new FileInputStream(f);
	
	
	//Workbook wb = new  XSSFWorkbook();
	
	/*wb.createSheet("kamala12").createRow(0).createCell(0).setCellValue("kama");
	wb.getSheet("kamala12").createRow(2).createCell(3).setCellValue("kannan");
	wb.getSheet("kamala12").createRow(3).createCell(4).setCellValue("kakaka");
	
	wb.createSheet("kamala14").createRow(0).createCell(0).setCellValue("kama");
	wb.getSheet("kamala14").createRow(2).createCell(3).setCellValue("kannan");
	wb.getSheet("kamala14").createRow(3).createCell(4).setCellValue("kakaka");
	*/
	//CellType cellValue = wb.getSheet("kamala14").getRow(2).getCell(3).getCellType();
	
	//wb.getSheet("password").createRow(0).createCell(0).setCellValue("Username");
    //wb.getSheet("password").createRow(0).createCell(1).setCellValue("password");
	//wb.getSheet("password").createRow(1).createCell(0).setCellValue("kamalaka267");
	//wb.getSheet("password").createRow(1).createCell(1).setCellValue("Kamal@267");
	
	//wb.createSheet("User").createRow(0).createCell(0).setCellValue("us");
	//wb.getSheet("User").createRow(0).createCell(1).setCellValue("password");
	
	
	//FileOutputStream fos = new FileOutputStream("D:\\user\\Desktop\\demo6.xlsx");
	//System.out.println(cellValue);
	//wb.write(fos);
	
	System.out.println("success");
	//String value = wb.getSheet("password").getRow(0).getCell(0).getStringCellValue();
	//System.out.println(value);
	}
	
	

}
