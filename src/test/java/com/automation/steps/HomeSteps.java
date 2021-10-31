package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;

public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getWebDriver());

	@Then("verify login successful")
	public void chiragMethod() {
		homePage.verifyHomePage();
	}
}
