package com.adactin.Hotel;
import org.openqa.selenium.*;
import com.BaseClass.BaseClass;

public class Allianz extends BaseClass {
	
	public static WebDriver driver;
	public static void main(String args[]) {
		
		driver= borsweLanuch("Chrome");
		
		urlPass("https://www.allianz.com/en.html");
		
		
		
		WebElement ele = driver.findElement(By.linkText("c-link__icon c-icon c-icon--arrow-right "));
		clickElement(ele);
		
		
		
	}

}
