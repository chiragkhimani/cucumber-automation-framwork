package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

	@FindBy(xpath = "//div[@class='inventory_details_price']")
	WebElement pdpPagePrice;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartIcon;

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnAddToCart() {
		System.out.println(pdpPagePrice.getText());
		addToCartBtn.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}
}
