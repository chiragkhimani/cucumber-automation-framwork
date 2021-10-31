package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class CheckoutPage extends BasePage {

	@FindBy(id = "first-name")
	WebElement firstNameInput;

	@FindBy(id = "last-name")
	WebElement lastNameInput;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(id = "continue")
	WebElement continueBtn;

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public void fillCheckoutForm() {
		firstNameInput.sendKeys(PropertyReader.getProperty("checkout.firstname"));
		lastNameInput.sendKeys(PropertyReader.getProperty("checkout.lastname"));
		postalCode.sendKeys(PropertyReader.getProperty("checkout.postal.code"));
	}

	public void clickOnContinueBtn() {
		continueBtn.click();
	}
}
