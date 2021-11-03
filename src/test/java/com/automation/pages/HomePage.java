package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement homePageItemName;

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']/../../..//div[@class='inventory_item_price']")
	WebElement homePagePrice;

	String itemNameXpath = "//div[text()='%s']";

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnItem(String itemName) {
		String loc = String.format(itemNameXpath, itemName);
		driver.findElement(By.xpath(loc)).click();
	}

	public void clickOnFirstItem() {
		System.out.println(homePageItemName.getText());
		System.out.println(homePagePrice.getText());
		homePageItemName.click();
	}

	public void verifyHomePage() {
		Assert.assertTrue("Home page item name is not displayed", homePageItemName.isDisplayed());
		Assert.assertTrue("Home page item price is not displayed", homePagePrice.isDisplayed());
	}

}
