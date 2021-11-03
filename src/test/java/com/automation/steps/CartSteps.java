package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

	CartPage cartPage = new CartPage(DriverUtils.getWebDriver());

	@Then("verify user is on cart page")
	public void verify_user_is_on_cart_page() {
		cartPage.verifyCartPage();
	}

	@When("user click on item name from cart page")
	public void user_click_on_item_name_from_cart_page() {
		cartPage.clickOnItemName();
	}

}
