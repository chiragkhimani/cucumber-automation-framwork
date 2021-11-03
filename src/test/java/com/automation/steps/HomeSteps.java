package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage(DriverUtils.getWebDriver());

	@Then("verify user is on homepage")
	public void chiragMethod() {
		homePage.verifyHomePage();
	}

	@When("user click on item {string}")
	public void user_click_on_item(String itemName) {
		homePage.clickOnItem(itemName);
	}

}
