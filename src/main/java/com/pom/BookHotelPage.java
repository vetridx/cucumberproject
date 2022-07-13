package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {

	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement creditcardno;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy(name="cc_exp_year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement myitinerary;
	
	
   public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

public BookHotelPage(WebDriver driver2) {
		
		this.driver =  driver2;
		PageFactory.initElements(driver,this);
		
	}
}
