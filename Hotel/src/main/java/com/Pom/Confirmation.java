package com.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text() ='Logout']")
	private WebElement logout;
////input[@name='logout']          //a[text() ='Logout']

	@FindBy(xpath = "//input[@name ='search_hotel']")
	private WebElement search;

	@FindBy(xpath = "//input[@name ='my_itinerary']")
	private WebElement iternay;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getIternay() {
		return iternay;
	}

	public Confirmation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
