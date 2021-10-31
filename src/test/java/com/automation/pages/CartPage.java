package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	WebElement cartPagePrice;

	@FindBy(id = "checkout")
	WebElement checkOutBtn;


	public CartPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCheckoutBtn() {
		System.out.println(cartPagePrice.getText());
		checkOutBtn.click();
	}
}
