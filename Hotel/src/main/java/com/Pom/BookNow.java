package com.Pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@name ='first_name']")
	private WebElement fn;

	@FindBy(xpath = "//input[@name ='last_name']")
	private WebElement ln;

	@FindBy(xpath = "//textarea[@name ='address']")
	private WebElement bAddress;

	@FindBy(xpath = "//input[@name ='cc_num']")
	private WebElement cNumber;

	@FindBy(xpath = "//select[@name ='cc_type']")
	private WebElement cType;

	@FindBy(xpath = "//select[@name ='cc_exp_month']")
	private WebElement cMonth;

	@FindBy(xpath = "//select[@name ='cc_exp_year']")
	private WebElement cYear;

	@FindBy(xpath = "//input[@name ='cc_cvv']")
	private WebElement cvvNum;

	@FindBy(xpath = "//input[@name ='book_now']")
	private WebElement bookNow;

	@FindBy(xpath = "//input[@name ='cancel']")
	private WebElement cancel;

	public BookNow(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);

	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getbAddress() {
		return bAddress;
	}

	public WebElement getcNumber() {
		return cNumber;
	}

	public WebElement getcType() {
		return cType;
	}

	public WebElement getcMonth() {
		return cMonth;
	}

	public WebElement getcYear() {
		return cYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
