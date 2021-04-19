package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeMethod() {
		getDriver();
		loadUrl("https://staging.vitalengine.com/ui/index.html#/");

	}

	@After
	public void afterMethod(Scenario sc) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "img.png");
	}
}
