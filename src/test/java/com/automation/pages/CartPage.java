package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	WebElement cartPagePrice;

	@FindBy(id = "checkout")
	WebElement checkOutBtn;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement itemName;

	public CartPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCheckoutBtn() {
		System.out.println(cartPagePrice.getText());
		checkOutBtn.click();
	}

	public void verifyCartPage() {
		Assert.assertTrue("Cart page item name is not displayed", itemName.isDisplayed());
		Assert.assertTrue("Car page checkout button is not displayed", checkOutBtn.isDisplayed());
		Assert.assertTrue("Car page item price is not displayed", cartPagePrice.isDisplayed());
	}

	public void clickOnItemName() {
		itemName.click();
	}

}
