package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotelPage;
import com.pom.LoginPage;
import com.pom.LogoutPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;


public class Page_Object_Manager {

	public static WebDriver driver;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public  LoginPage getLoginPage() {
		LoginPage lp = new LoginPage(driver);
		return lp;

	}
	
	public SearchHotelPage getSearchHotelPage() {
		SearchHotelPage sp = new SearchHotelPage(driver);
		return sp;
	}
	public SelectHotelPage getSelectHotelPage() {
		SelectHotelPage h = new SelectHotelPage(driver);
		return h;
	}
	
	public BookHotelPage getBookHotelPage() {
		BookHotelPage bp = new BookHotelPage(driver);
		return bp;

	}
	
	public  LogoutPage getLogoutPage() {
		LogoutPage lo = new LogoutPage(driver);
		return lo;

	}
	
	
	
}
