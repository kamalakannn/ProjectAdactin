package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueHotel {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement button;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	public WebElement getButton() {
		return button;

	}

	public WebElement getContinue() {
		return continueButton;
	}

	public ContinueHotel(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);

	}

}
