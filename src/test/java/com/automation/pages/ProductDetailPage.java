package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

	@FindBy(xpath = "//div[@class='inventory_details_price']")
	WebElement pdpPagePrice;

	@FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartIcon;

	@FindBy(xpath = "//button[text()='Remove']")
	WebElement removeBtn;

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

	public void verifyProductDetailPage() {
		Assert.assertTrue("Price is not displayed on pdp page", pdpPagePrice.isDisplayed());
	}

	public void verifyRemoveBtn() {
		Assert.assertTrue("Remove button is not displayed on pdp page", removeBtn.isDisplayed());
	}
}
