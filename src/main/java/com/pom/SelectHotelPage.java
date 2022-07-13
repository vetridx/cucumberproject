package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sigin;
	
	  public SelectHotelPage(WebDriver driver2) {
			
			this.driver =  driver2;
			PageFactory.initElements(driver,this);
			
		}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSigin() {
		return sigin;
	}
}
