package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public static WebDriver driver;

	@FindBy(id="logout")
	private WebElement logout;
	
	@FindBy(linkText="You have successfully logged out. ")
	private WebElement message;
	
public LogoutPage(WebDriver driver2) {
		
		this.driver =  driver2;
		PageFactory.initElements(driver,this);
		
	}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getLogout() {
	return logout;
}

public WebElement getMessage() {
	return message;
}
	
}
