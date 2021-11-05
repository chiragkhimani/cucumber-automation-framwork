package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src//test//resources//feature",
		glue = "com.automation.steps",
		tags = "@Smoke",
		plugin = {"html:target/index.html", "json:target/cucumber.json"}
)

public class TestRunner {

}
