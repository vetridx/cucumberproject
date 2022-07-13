package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public static WebDriver driver;

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultroom;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildrenroom() {
		return childrenroom;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childrenroom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
    public SearchHotelPage(WebDriver driver2) {
		
		this.driver =  driver2;
		PageFactory.initElements(driver,this);
		
	}

	

}
