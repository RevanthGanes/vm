package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources" }, glue = {"com.stepdefinition" },plugin= {"pretty","json:C:\\Users\\Revanth\\workspace\\Vmail\\target\\Reporting\\valgenies.json"}, monochrome = true)
public class TestRunner {

	@AfterClass
	public static void afterClass() {

		JVMReport.generateJVMReport("C:\\Users\\Revanth\\workspace\\Vmail\\target\\Reporting\\valgenies.json");
	}

}
