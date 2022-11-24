package com.adactin.Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.BaseClass;

public class AppTest extends BaseClass
{
    public static WebDriver driver;
    public static void main(String args[]) {
    	driver= borsweLanuch("chrome");
    	
    	driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byju%27s&gclid=Cj0KCQjwhsmaBhCvARIsAIbEbH4s592e6QHLIDkVf7bAmAKM21pyCKvpoDMhjzl1x56DUnJxhqVZEf0aAkJSEALw_wcB");
    	
    	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kamala");
    	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7397404209");
    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kamalakann98@gmail.com");
    	WebElement ele=driver.findElement(By.xpath("//select[@name='state']"));
    	
    	Select s = new Select(ele);
    	s.selectByVisibleText("Assam");
    	driver.findElement(By.xpath("//button[@data-text='Book Now']")).click();
    	
    	
    	
    	
    	
    	
    }
    
}
