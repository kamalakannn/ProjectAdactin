package com.StepDef;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Pom.PageObjectModel;
import com.PropertyManager.FileReaderManager;
import com.RunnerCucumber.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	PageObjectModel pom = new PageObjectModel(driver);

	@Given("^User Lanch the Application$")
	public void user_Lanch_the_Application() throws Throwable {
		urlPass(FileReaderManager.getInstanceFRM().getInstanceFR().getURL());
	  
	}

	@When("^User Enter the Username in the User name tab$")
	public void user_Enter_the_Username_in_the_User_name_tab() throws Throwable {
	    inputValues(pom.getInstanceLogin().getUserName(), FileReaderManager.getInstanceFRM().getInstanceFR().getUser());
		
	}

	@When("^Usr Enter the Password in the Password Tab$")
	public void usr_Enter_the_Password_in_the_Password_Tab() throws Throwable {
		inputValues(pom.getInstanceLogin().getPass(), FileReaderManager.getInstanceFRM().getInstanceFR().getPass());
		}

	@Then("^User Click the Login Button and go to Search Hotel Web Page$")
	public void user_Click_the_Login_Button_and_go_to_Search_Hotel_Web_Page() throws Throwable {
		click(pom.getInstanceLogin().getLogin());
		}


}
