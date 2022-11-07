package stepDefinition;

import com.app.base.BaseClassCucumber;
import com.app.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExe {
	
	@Given("Enter the URL")
	public void enter_the_url() {
		BaseClassCucumber.browserLaunch();
		BaseClassCucumber.url(BaseClassCucumber.propertiesFileReuse("url"));
	}
	@When("Enter the Username")
	public void enter_the_username() {
		username();
	}
	@When("Enter the Password")
	public void enter_the_password() {
	  password();
	}
	@When("Click the LoginButtton")
	public void click_the_login_buttton() {
	   loginbutton();
	}
	@Then("Validate the Search Hotel Page")
	public void validate_the_search_hotel_page() {
	  
	}


}
