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
		
		features = "src\\test\\java\\com\\Features\\Facebook.feature",
		glue = "com.StepDef",
		monochrome = false,
		dryRun = true,
		publish = true,
		snippets = SnippetType.CAMELCASE,		
		plugin = {
				
				"html:HTMLReports/Amazon.html",
				"pretty",
				"json:JsonReports/FacebookJS.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
				}
		)
public class RunnerClass extends BaseClass{

	@BeforeClass
	public static void sessionStart() {
		browserLauch("chrome");
	}
	
	@AfterClass
	public static void sessionEnd() {
		terminateBrowser();
	}
	
	
}
