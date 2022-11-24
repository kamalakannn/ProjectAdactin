package com.Step;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Pom.PageObjectModel;
import com.PropertyManager.FileReaderManager;
import com.RunnerCucumber.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	PageObjectModel pom = new PageObjectModel(driver);

	@Given("^User Lanch the Application$")
	public void user_Lanch_the_Application() throws Throwable {
		//borsweLanuch("chrome");
		urlPass(FileReaderManager.getInstanceFRM().getInstanceFR().getURL());
		
	    //driver.get(FileReaderManager.getInstanceFRM().getInstanceFR().getURL());	
	}

	@When("^User Enter the \"([^\"]*)\" in the User name tab$")
	public void user_Enter_the_in_the_User_name_tab(String arg1) throws Throwable {
      inputValues(pom.getInstanceLogin().getUserName(), arg1);
	}

	@When("^Usr Enter the \"([^\"]*)\" in the Password Tab$")
	public void usr_Enter_the_in_the_Password_Tab(String arg1) throws Throwable {
		inputValues(pom.getInstanceLogin().getPass(), arg1);
	}

	@Then("^User Click the Login Button and go to Search Hotel Web Page$")
	public void user_Click_the_Login_Button_and_go_to_Search_Hotel_Web_Page() throws Throwable {
	  click(pom.getInstanceLogin().getLogin());   	
	}
	
	
	
	@When("^User click the Location$")
	public void user_click_the_Location() throws Throwable {
		selectValues(pom.getInstanceSearchHotel().getLocation(), "value", "Melbourne", 0);
	  	}

	@When("^User Click the Hotel$")
	public void user_Click_the_Hotel() throws Throwable {
		selectValues(pom.getInstanceSearchHotel().getHotel(), "index", null, 3);
		}

	@When("^User Click the Room Type$")
	public void user_Click_the_Room_Type() throws Throwable {
		selectValues(pom.getInstanceSearchHotel().getRoomType(), "VisibleText", "Deluxe", 0);
		}

	@When("^User Click the Number Of Room$")
	public void user_Click_the_Number_Of_Room() throws Throwable {
	
		selectValues(pom.getInstanceSearchHotel().getNumberOfRoom(), "value", "5", 0);
	}

	@When("^User Enter the Check-In Date$")
	public void user_Enter_the_Check_In_Date() throws Throwable {
		inputValues(pom.getInstanceSearchHotel().getCheckIn(), "10/12/2022");
		}

	@When("^User Enter the Check-out Date$")
	public void user_Enter_the_Check_out_Date() throws Throwable {
		inputValues(pom.getInstanceSearchHotel().getCheckOut(), "15/12/2022");
		}

	@When("^User Click the Adult Room$")
	public void user_Click_the_Adult_Room() throws Throwable {
		selectValues(pom.getInstanceSearchHotel().getAdultRoom(), "index", null, 3);
	   
	}

	@When("^User Click the Children Room$")
	public void user_Click_the_Children_Room() throws Throwable {
		selectValues(pom.getInstanceSearchHotel().getChildRoom(), "index", null, 1);
		}

	@Then("^User Click the Search Button and go to Continue Hotel$")
	public void user_Click_the_Search_Button_and_go_to_Continue_Hotel() throws Throwable {
		click(pom.getInstanceSearchHotel().getSearch());
	  	}
 
	@When("^User Click the Select Button$")
	public void user_Click_the_Select_Button() throws Throwable {
		clickElement(pom.getInstanceCH().getButton());
	
	}

	@Then("^user click the Continue Button and go to Booking Page$")
	public void user_click_the_Continue_Button_and_go_to_Booking_Page() throws Throwable {
	
		clickElement(pom.getInstanceCH().getContinue());	
	}

	@When("^user Enter the first name in the First Name tab$")
	public void user_Enter_the_first_name_in_the_First_Name_tab() throws Throwable {
		inputValues(pom.getInstanceBN().getFn(), "kamalakannan");
		
		}

	@When("^user Enter the last name in the last name tab$")
	public void user_Enter_the_last_name_in_the_last_name_tab() throws Throwable {
		inputValues(pom.getInstanceBN().getLn(), "P");	
	
	}

	@When("^user Enter the Billing Address in the Billing Address tab$")
	public void user_Enter_the_Billing_Address_in_the_Billing_Address_tab() throws Throwable {

		inputValues(pom.getInstanceBN().getbAddress(), "1/2 Ko.Su.Mani\nChoolai Medu\nChennai-94");	
	}

	@When("^user Enter the Creit Card Number in the Credit Card Number tab$")
	public void user_Enter_the_Creit_Card_Number_in_the_Credit_Card_Number_tab() throws Throwable {
		

		inputValues(pom.getInstanceBN().getcNumber(), "1234567891234567");
		
		}

	@When("^user Click the Creit Card Type in the Credit Card type tab$")
	public void user_Click_the_Creit_Card_Type_in_the_Credit_Card_type_tab() throws Throwable {
		selectValues(pom.getInstanceBN().getcType(), "value", "OTHR", 0);
	
	}

	@When("^user Select the Select month and Select Years in the Expriy Date Tab$")
	public void user_Select_the_Select_month_and_Select_Years_in_the_Expriy_Date_Tab() throws Throwable {

		selectValues(pom.getInstanceBN().getcMonth(), "index", null, 7);
		selectValues(pom.getInstanceBN().getcYear(), "visibletext", "2022", 0);

		}

	@When("^user Enter the CVV number in the CVV number tab$")
	public void user_Enter_the_CVV_number_in_the_CVV_number_tab() throws Throwable {
		inputValues(pom.getInstanceBN().getCvvNum(), "1234");
	
	}

	@Then("^User click the Book Now button and go to the Confirmation Web Page$")
	public void user_click_the_Book_Now_button_and_go_to_the_Confirmation_Web_Page() throws Throwable {
		clickElement(pom.getInstanceBN().getBookNow());		
	}

	@Then("^User click the Logout Button and go to Login page$")
	public void user_click_the_Logout_Button_and_go_to_Login_page() throws Throwable {
		clickElement(pom.getInstanceCF().getLogout());
		}


}
