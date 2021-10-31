package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userNameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@class='error-message-container error']")
	WebElement invalidLoginError;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void doLogin() {
		userNameInput.sendKeys(PropertyReader.getProperty("valid.username"));
		passwordInput.sendKeys(PropertyReader.getProperty("valid.password"));
		loginBtn.click();
	}

	public void verifyInvalidLoginError() {
		Assert.assertTrue("Locked out user error is not displayed", invalidLoginError.isDisplayed());
	}

	public void openWebsite() {
		// Loading url in the browser
		driver.get(PropertyReader.getProperty("base.url"));
	}

	public void doLoginWithInvalidCred() {
		userNameInput.sendKeys("abcxyz");
		passwordInput.sendKeys("abcxyz123");
		loginBtn.click();
	}
}
