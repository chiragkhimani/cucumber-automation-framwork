package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage = new LoginPage(DriverUtils.getWebDriver());

	@Given("user open the website")
	public void user_open_the_website() {
		loginPage.openWebsite();
	}

	@When("user do login with valid credentials")
	public void user_do_login_with_valid_credentials() {
		loginPage.doLogin();
	}
	
	@When("user do login with invalid credentials")
	public void user_do_login_with_invalid_credentials() {
		loginPage.doLoginWithInvalidCred();
	}

	@Then("verify invalid login error message")
	public void verify_invalid_login_error_message() {
		loginPage.verifyInvalidLoginError();
	}


}
