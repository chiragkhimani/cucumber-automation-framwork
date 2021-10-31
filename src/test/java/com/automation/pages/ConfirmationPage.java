package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage {

	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement confirmationPageHeader;

	@FindBy(xpath = "//div[@class='complete-text']")
	WebElement confirmationPageDescription;

	public ConfirmationPage(WebDriver driver) {
		super(driver);
	}

	public void printConfirmationDetails() {
		System.out.println(confirmationPageHeader.getText());
		System.out.println(confirmationPageDescription.getText());
	}
}
