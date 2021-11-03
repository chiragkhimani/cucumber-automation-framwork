package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Loading url in the browser
		driver.get(PropertyReader.getProperty("base.url"));
	}

	public static WebDriver getWebDriver() {
		return driver;
	}
}
