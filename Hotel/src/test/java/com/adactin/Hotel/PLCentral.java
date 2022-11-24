package com.adactin.Hotel;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

public class PLCentral extends BaseClass {

	public static WebDriver driver;
	public static void main(String args[]) {
		
		
		
		driver = borsweLanuch("chrome");
		urlPass("https://www.3plcentral.com/");
		urlTitle();
		currentUrl();
		
		
		
	}
}
