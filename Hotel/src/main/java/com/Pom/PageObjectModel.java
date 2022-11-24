package com.Pom;

import org.openqa.selenium.WebDriver;

public class PageObjectModel {

	public static WebDriver driver;
	
	public static LoginPage lp;
	
	public static SearchHotel sh;
	
	public static ContinueHotel ch;
	
	public static BookNow bn;
	
	public static Confirmation cf;
	
	public Confirmation getInstanceCF() {
		return cf = new Confirmation(driver);
	}
	
	
	public LoginPage getInstanceLogin() {
		return lp= new LoginPage(driver);
	}
	
	public SearchHotel getInstanceSearchHotel() {
		return sh= new SearchHotel(driver);
	}
	
	public  ContinueHotel getInstanceCH() {
		
		return ch = new ContinueHotel(driver);
	}
	
	public BookNow getInstanceBN() {
		return bn = new BookNow(driver);
	}
	
	public PageObjectModel(WebDriver driver2) {
		driver=driver2;
	}
	
}
