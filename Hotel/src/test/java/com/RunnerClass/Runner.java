package com.RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;
import com.Pom.LoginPage;
import com.Pom.PageObjectModel;
import com.PropertyManager.FileReaderManager;

public class Runner extends BaseClass {
public static WebDriver driver;

	public static void main(String args[]) throws Throwable {
//		System.out.println("kamala");
		
		//PageObjectModel pom = new PageObjectModel(driver);

	driver = borsweLanuch("chrome");
	PageObjectModel pom = new PageObjectModel(driver);		

		///urlPass("https://github.com/mohammedabdulbari/Java-SE/blob/master/LamdaDemo1.java");
		urlPass(FileReaderManager.getInstanceFRM().getInstanceFR().getURL());
				
		inputValues(pom.getInstanceLogin().getUserName(), FileReaderManager.getInstanceFRM().getInstanceFR().getUser());
		inputValues(pom.getInstanceLogin().getPass(), FileReaderManager.getInstanceFRM().getInstanceFR().getPass());
		clickElement(pom.getInstanceLogin().getLogin());
		
		selectValues(pom.getInstanceSearchHotel().getLocation(), "index", null, 3);
		selectValues(pom.getInstanceSearchHotel().getHotel(), "VisibleText", "Hotel Sunshine", 0);
		selectValues(pom.getInstanceSearchHotel().getRoomType(), "value", "Double", 0);
		selectValues(pom.getInstanceSearchHotel().getNumberOfRoom(), "index", null, 3);
		//inputValues(pom.getInstanceSearchHotel().getCheckIn(), "P");
		WebElement check = driver.findElement(By.id("datepick_in"));
		check.sendKeys("kamal");
		
	/*	inputValues(pom.getInstanceSearchHotel().getCheckOut(), "28/11/2022");
		selectValues(pom.getInstanceSearchHotel().getAdultRoom(), "value", "3", 0);
		selectValues(pom.getInstanceSearchHotel().getChildRoom(), "visibletext", "3 - Three", 0);
		clickElement(pom.getInstanceSearchHotel().getSearch());
		
		clickElement(pom.getInstanceCH().getButton());
		clickElement(pom.getInstanceCH().getContinue());
		
		inputValues(pom.getInstanceBN().getFn(), "kamalakannan");
		inputValues(pom.getInstanceBN().getLn(), "P");
		inputValues(pom.getInstanceBN().getbAddress(), "1/2 Ko.Su.Mani\nChoolai Medu\nChennai-94");
		inputValues(pom.getInstanceBN().getcNumber(), "1234567891234567");
		selectValues(pom.getInstanceBN().getcType(), "value", "OTHR", 0);
		selectValues(pom.getInstanceBN().getcMonth(), "index", null, 7);
		selectValues(pom.getInstanceBN().getcYear(), "visibletext", "2022", 0);
		inputValues(pom.getInstanceBN().getCvvNum(), "1234");
		clickElement(pom.getInstanceBN().getBookNow());		
		
		//driver.manage().window().wait(20000);
		clickElement(pom.getInstanceCF().getLogout());
	
		//click(pom.getInstanceLogin().getPass());
*/
	}

}
