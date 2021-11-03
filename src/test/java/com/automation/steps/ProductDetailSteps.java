package com.automation.steps;

import com.automation.pages.ProductDetailPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailSteps {
	
	ProductDetailPage pdpPage = new ProductDetailPage(DriverUtils.getWebDriver());
	
	@Then("verify user is on product detail page")
	public void verify_user_is_on_product_detail_page() {
		pdpPage.verifyProductDetailPage();
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		pdpPage.clickOnAddToCart();
	}

	@When("click on cart icon")
	public void click_on_cart_icon() {
		pdpPage.clickOnCartIcon();
	}
	
	@When("verify remove button is displayed")
	public void verifyRemoveBtn() {
		pdpPage.verifyRemoveBtn();
	}
}
