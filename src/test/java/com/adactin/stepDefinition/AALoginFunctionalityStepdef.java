package com.adactin.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.Base_Class;
import com.adactin.runner.TestRunner;
import com.pageObjectManager.FileReaderManager;
import com.pageObjectManager.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AALoginFunctionalityStepdef extends Base_Class{
	public static WebDriver driver = TestRunner.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user launches the application")
	public void user_launches_the_application() throws IOException {
		
		geturl(FileReaderManager.getInstanceFRM().getInstanceCR().getdburl());
	}
	
	@When("user enters the valid username")
	public void user_enters_the_valid_username() throws Throwable {
	   
		sendkeys(pom.getLoginPage().getEmail(),FileReaderManager.getInstanceFRM().getInstanceCR().getUserName());
	}
	@When("user enters the valid password")
	public void user_enters_the_valid_password() throws Throwable {
		
		sendkeys(pom.getLoginPage().getPass(),FileReaderManager.getInstanceFRM().getInstanceCR().getpassword());
	}
	@Then("user click the login button and user navigates to the search hotel page")
	public void user_click_the_login_button_and_user_navigates_to_the_search_hotel_page() {
	  click(pom.getLoginPage().getSignin());
	}
	
	@When("user select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
	   select(pom.getSearchHotelPage().getLocation(), "value", "London");
	}
	@When("user selects the Hotel from the dropdown")
	public void user_selects_the_hotel_from_the_dropdown() {
	    select(pom.getSearchHotelPage().getHotel(), "value", "Hotel Sunshine");
	}
	@When("user select the roomtype from the dropdown")
	public void user_select_the_roomtype_from_the_dropdown() {
	   select(pom.getSearchHotelPage().getRoomtype(),"value","Deluxe");
	}
	@When("user select the number of rooms")
	public void user_select_the_number_of_rooms() {
	    select(pom.getSearchHotelPage().getRoomno(),"value","2");
	}
//	@When("user select the checkindate")
//	public void user_select_the_checkindate() {
//	    
//	}
//	@When("user select the checkoutdate")
//	public void user_select_the_checkoutdate() {
//	    
//	}
	@When("user select the Adultsperroom")
	public void user_select_the_adultsperroom() {
	   select(pom.getSearchHotelPage().getAdultroom(),"value","4");
	}
	@When("user select the childrenperroom")
	public void user_select_the_childrenperroom() {
	    select(pom.getSearchHotelPage().getChildrenroom(),"value","2");
	}
	@Then("user click the search button and navigates to select hotel page")
	public void user_click_the_search_button_and_navigates_to_select_hotel_page() {
	   click(pom.getSearchHotelPage().getSearch());
	}
	@When("user click the radio button")
	public void user_click_the_radio_button() {
	    click(pom.getSelectHotelPage().getRadio());
	}
	@Then("user click the continue button and navigates to book hotel page")
	public void user_click_the_continue_button_and_navigates_to_book_hotel_page() {
	   click(pom.getSelectHotelPage().getSigin());
	}
	@When("user enters the first name")
	public void user_enters_the_first_name() throws Throwable {
	    sendkeys(pom.getBookHotelPage().getFirstname(),FileReaderManager.getInstanceFRM().getInstanceCR().getfirstname());
	}
	@When("user enters the last name")
	public void user_enters_the_last_name() throws Throwable {
		 sendkeys(pom.getBookHotelPage().getLastname(),FileReaderManager.getInstanceFRM().getInstanceCR().getlastname()); 
	}
	@When("user enters the billing address")
	public void user_enters_the_billing_address() throws Throwable {
		 sendkeys(pom.getBookHotelPage().getAddress(),FileReaderManager.getInstanceFRM().getInstanceCR().getaddress());
	}
	@When("user enters the credit card number")
	public void user_enters_the_credit_card_number() throws Throwable {
		 sendkeys(pom.getBookHotelPage().getCreditcardno(),FileReaderManager.getInstanceFRM().getInstanceCR().getcreditcardno());
	}
	@When("user select the credit card type")
	public void user_select_the_credit_card_type() {
	   select(pom.getBookHotelPage().getCreditcardtype(),"value","VISA");
	}
	
	@When("user select the expiry date for month")
	public void user_select_the_expiry_date_for_month() {
		select(pom.getBookHotelPage().getMonth(),"value","4");
	}
	@When("user select the year from dropdown")
	public void user_select_the_year_from_dropdown() {
	  select(pom.getBookHotelPage().getYear(),"value","2013");
	}
	@When("user enters the cvv number")
	public void user_enters_the_cvv_number() throws  Throwable{
		 sendkeys(pom.getBookHotelPage().getCvv(),FileReaderManager.getInstanceFRM().getInstanceCR().getcvv());
	}
	@When("user click the booknow button")
	public void user_click_the_booknow_button() {
	   click(pom.getBookHotelPage().getBook());
	}
	@Then("user click the myItinerary button and navigates to Booked Itinerary")
	public void user_click_the_my_itinerary_button_and_navigates_to_booked_itinerary() {
	   click(pom.getBookHotelPage().getMyitinerary());
	}
	
	@When("user click the logout button")
	public void user_click_the_logout_button() {
	   click(pom.getLogoutPage().getLogout());
	}
//	@Then("Message displayed logout successfully")
//	public void message_displayed_logout_successfully() {
//	   driver.quit();
//	}









}
