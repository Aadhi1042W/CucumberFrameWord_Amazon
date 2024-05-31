package com.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\com\\Features\\Amazon.feature",
		glue = "com.Amazon",
		dryRun = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {
				"html:HTMLReports/NopCommerce.html", "json:JsonReports/NopCommerceJS.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class AmazonRunner extends BaseClass {

	@BeforeClass
	public static void startSession() {
		browserLauch("chrome");
	}

	@AfterClass
	public static void endSession() {
		terminateBrowser();
	}
}
