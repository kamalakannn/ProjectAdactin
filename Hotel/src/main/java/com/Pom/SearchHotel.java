package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name = 'hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name = 'room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name = 'room_nos']")
	private WebElement numberOfRoom;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement rest;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRest() {
		return rest;
	}

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

}
