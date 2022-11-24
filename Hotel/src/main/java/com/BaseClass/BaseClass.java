package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static Select s;

	public static Actions ac;

	public static WebDriver borsweLanuch(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\Hotel\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void urlPass(String url) {
		driver.get(url);
	}

	public static void urlTitle() {
		System.out.println(driver.getTitle());
	}

	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void navigatin(String type) {

		if (type.equalsIgnoreCase("to")) {
			driver.navigate().to(type);
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else {
			driver.navigate().refresh();
		}

	}

	public static void close() {
		driver.close();
	}

	public static void quitBroswer() {
		driver.quit();
	}

	public static void inputValues(WebElement element, String values) {
		element.sendKeys(values);
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void textGet(WebElement element) {
		element.getText();
	}

	public static void displayed(WebElement element) {
		element.isDisplayed();
	}

	public static void enable(WebElement element) {
		element.isEnabled();
	}

	public static void selectableElement(WebElement element) {
		element.isSelected();
	}

	public static void clearValues(WebElement element) {
		element.clear();
	}

	public static void selectValues(WebElement ele, String selectType, String Values, int index) {

		s = new Select(ele);
		if (selectType.equalsIgnoreCase("Value")) {
			s.selectByValue(Values);
		} else if (selectType.equalsIgnoreCase("index")) {
			s.selectByIndex(index);
		} else {
			s.selectByVisibleText(Values);
		}
	}

	public static void deselectValue(WebElement ele, String selectType, String Values, int index) {

		s = new Select(ele);
		if (selectType.equalsIgnoreCase("value")) {
			s.deselectByValue(Values);
		} else if (selectType.equalsIgnoreCase("index")) {
			s.deselectByIndex(index);
		} else {
			s.deselectByVisibleText(Values);
		}
	}

	public static void isMultiple(WebElement ele) {
		s = new Select(ele);
		s.isMultiple();
	}

	public static void option(WebElement ele) {
		s = new Select(ele);
		List<WebElement> li = s.getOptions();
		for (WebElement x : li) {
			System.out.println(x.getText());
		}
	}

	public static void allSelected(WebElement ele) {
		s = new Select(ele);
		List<WebElement> sO = s.getAllSelectedOptions();
		for (WebElement x : sO) {
			System.out.println(x.getText());
		}
	}

	public static void firstSelected(WebElement ele) {

		s = new Select(ele);
		System.out.println(s.getFirstSelectedOption().getText());
	}

	public static void screenShot(String FolderName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\Hotel\\ScreenShot\\"+ FolderName);
		FileUtils.copyFile(as, des);
	}

	public static void alertMethod(String alertType) {
		if (alertType.equalsIgnoreCase("simple alert")) {
			driver.switchTo().alert().accept();
		}
	}

	public static void confirmAlert(String accept) {

		if (accept.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}

	}

	public static void propemtAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void contextCick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	public static void click(WebElement element) {
		ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void dragAnDrop(WebElement pickUp, WebElement drop) {

		ac = new Actions(driver);
		ac.dragAndDrop(pickUp, drop).build().perform();
	}
	
	
	
	
	
	
	

}
