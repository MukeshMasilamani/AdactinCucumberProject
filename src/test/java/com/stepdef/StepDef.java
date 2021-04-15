package com.stepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mavfirst.BaseClass;
import com.mavfirst.BookHotel;
import com.mavfirst.BookedItineraryPage;
import com.mavfirst.BookingConfirmationPage;
import com.mavfirst.LoginPage;
import com.mavfirst.SearchHotelPage;
import com.mavfirst.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class StepDef extends BaseClass {
	public SearchHotelPage search;
	public LoginPage li;
	public SelectHotelPage select;
	public BookHotel bh;
	public BookingConfirmationPage bc ;
	public BookedItineraryPage bi ;

	@Given("User in adcatin login page")
	public void user_in_adcatin_login_page() {
		toLaunchUrl("http://adactinhotelapp.com/");
	
	}
	
	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password(DataTable d) {
	    List<String> list = d.asList();
	    String mail = list.get(0);
	    String pass = list.get(1);
	    li = new LoginPage();
		toSendKeys(li.getTxtuser(), mail);
		toSendKeys(li.getTxtPass(), pass);
	    
	}
	/*@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String user, String pass) {
		li = new LoginPage();
		toSendKeys(li.getTxtuser(), user);
		toSendKeys(li.getTxtPass(), pass);
	}*/

	@When("User click login button and user should navigate to search hotel page")
	public void user_click_login_button_and_user_should_navigate_to_search_hotel_page() {

		toClick(li.getLogin());
	}

	/*@When("User select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_select(String location, String hotel, String roomtype, String noOfRooms, String datein,
			String dateout, String adult, String child) throws InterruptedException {
		Thread.sleep(20);
		}*/
		
		@When("User select all require field")
		public void user_select_all_require_field() throws IOException {
			Map<String, String> map = excelRead("TC3");
			String location = map.get("location");
			String hotel = map.get("hotel");
			String roomtype = map.get("room type");
			String noOfRooms = map.get("nor");
			String datein = map.get("check");
			String dateout = map.get("check out");
			String adult = map.get("adult");
			String child = map.get("child");
			
			search = new SearchHotelPage();
			dropAndDownSelectByValue(search.getLocation(), location);
			dropAndDownSelectByValue(search.getHotels(), hotel);
			dropAndDownSelectByValue(search.getRoomType(), roomtype);
			dropAndDownSelectByValue(search.getNoOfRooms(), noOfRooms);
			toClear(search.getCheckInDate());
			toSendKeys(search.getCheckInDate(), datein);
			toClear(search.getCheckOutdate());
			toSendKeys(search.getCheckOutdate(), dateout);
			dropAndDownSelectByValue(search.getAdultPerRoom(), adult);
			dropAndDownSelectByValue(search.getChildPerRoom(), child);
		}
		
	
	

	@When("User click search button and should navigate to select hotel page")
	public void user_click_search_button_and_should_navigate_to_select_hotel_page() {
		toClick(search.getSearch());
	}

	@When("User select hotel in list and click continue and user should be navigate to book hotel page")
	public void user_select_hotel_in_list_and_click_continue_and_user_should_be_navigate_to_book_hotel_page() {
		select = new SelectHotelPage();
		toClick(select.getSelect());
		toClick(select.getClickContinue());

	}

	@When("user enter details {string},{string},{string},{string},{string},{string}, {string},{string}")
	public void user_enter_details(String fname, String lname, String address, String creditcardNo, String cardType,
			String expMonth, String expYear, String cvvNo) {
		bh = new BookHotel();
		toSendKeys(bh.getTypeFirstName(), fname);
		toSendKeys(bh.getTypeLastName(), lname);
		toSendKeys(bh.getTypeAddress(), address);
		toSendKeys(bh.getEntercreditCardNo(), creditcardNo);
		toSendKeys(bh.getSelectCardType(), cardType);
		dropAndDownSelectByValue(bh.getSelectExpireMonth(), expMonth);
		dropAndDownSelectByValue(bh.getSelectExpireYear(), expYear );
		toSendKeys(bh.getEnterCvvNo(), cvvNo);
	}

	@When("User click Booknow button and navigate to booking confirmation page")
	public void user_click_Booknow_button_and_navigate_to_booking_confirmation_page() {
		toClick(bh.getClickBookNowBtn());
	}

	@When("User click my itinerary button then user get order id of booking details")
	public void user_click_my_itinerary_button_then_user_get_order_id_of_booking_details() {
		bc = new BookingConfirmationPage();
		toClick(bc.getClickMyItinerary());
	}

	@When("User click search hotel button moved to home page of search hotel page")
	public void user_click_search_hotel_button_moved_to_home_page_of_search_hotel_page() {
		bi = new BookedItineraryPage();
		toClick(bi.getClickSearchHotelBtn());
		
	}
	@Then("User should be succesflly navigate to search hotel main page")
	public void user_should_be_succesflly_navigate_to_search_hotel_main_page() {
	   search = new SearchHotelPage();
	   WebElement text = search.getText();
	   String actual = text.getText();
	  
		Assert.assertEquals("Welcome to Adactin Group of Hotels",actual );
		System.out.println("Given Testcase Pass");
	}
}

/*
 * @Given("User navigate to login page") public void
 * user_navigate_to_login_page() { toBrowserlaunchChrome();
 * toLaunchUrl("http://adactinhotelapp.com/"); toImplicitWait(30); toMax();
 * 
 * }
 * 
 * @When("User enter valid id and password") public void
 * user_enter_valid_id_and_password() { li = new LoginPage();
 * toSendKeys(li.getTxtuser(), "MukeshMasailamani"); toSendKeys(li.getTxtPass(),
 * "Since@1995");
 * 
 * }
 * 
 * @When("user click login button") public void user_click_login_button() {
 * 
 * toClick(li.getLogin());
 * 
 * }
 * 
 * @Then("User should be login to application") public void
 * user_should_be_login_to_application() {
 * System.out.println("Test No: tc101 TestPass"); }
 * 
 * @Given("user navigate to search hotel page") public void
 * user_navigate_to_search_hotel_page() {
 * 
 * toBrowserlaunchChrome(); toLaunchUrl("http://adactinhotelapp.com/");
 * toImplicitWait(30); toMax(); LoginPage li = new LoginPage();
 * toSendKeys(li.getTxtuser(), "MukeshMasailamani"); toSendKeys(li.getTxtPass(),
 * "Since@1995"); toClick(li.getLogin());
 * 
 * }
 * 
 * @When("User enter the hotel details") public void
 * user_enter_the_hotel_details() {
 * 
 * // SearchHotelPage search = new SearchHotelPage();
 * 
 * toSendKeys(li.getTxtuser(), "MukeshMasailamani"); toSendKeys(li.getTxtPass(),
 * "Since@1995"); toClick(li.getLogin());
 * 
 * dropAndDownSelectByIndex(search.getLocation(), 1);
 * dropAndDownSelectByIndex(search.getHotels(), 1);
 * dropAndDownSelectByIndex(search.getRoomType(), 1);
 * dropAndDownSelectByIndex(search.getNoOfRooms(), 1);
 * toClear(search.getCheckInDate()); toSendKeys(search.getCheckInDate(),
 * "23/03/2021"); toClear(search.getCheckOutdate());
 * toSendKeys(search.getCheckOutdate(), "25/03/2021");
 * 
 * }
 * 
 * @Then("click search option") public void click_search_option() {
 * toClick(search.getSearch()); }
 * 
 * @Then("User should be able to navigate select hotel page") public void
 * user_should_be_able_to_navigate_select_hotel_page() {
 * System.out.println("Test Pass"); }
 * 
 * }
 */
