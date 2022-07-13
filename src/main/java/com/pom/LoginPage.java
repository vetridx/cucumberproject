package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.Base_Class;

public class LoginPage extends Base_Class {

	@FindBy(xpath="//input[@type='text']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement signin;
	
	public LoginPage(WebDriver abc) {
		
		this.driver =  abc;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}
	
}
