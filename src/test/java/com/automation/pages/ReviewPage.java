package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage{

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	WebElement reviewPagePrice;

	@FindBy(xpath = "//div[@class='summary_info']")
	WebElement reviewPageShippingInfo;

	@FindBy(xpath = "//div[@class='summary_tax_label']")
	WebElement reviewPageTax;

	@FindBy(xpath = "//div[@class='summary_total_label']")
	WebElement reviewPageTotalPrice;

	@FindBy(id = "finish")
	WebElement finishBtn;


	public ReviewPage(WebDriver driver) {
		super(driver);
	}

	public void printReviewPageDetails() {
		System.out.println(reviewPagePrice.getText());
		System.out.println(reviewPageShippingInfo.getText());
		System.out.println(reviewPageTax.getText());
		System.out.println(reviewPageTotalPrice.getText());
	}

	public void clickOnFinishBtn() {
		finishBtn.click();
	}
}
