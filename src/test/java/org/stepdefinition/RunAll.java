package org.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\FeatureFiles",dryRun=false,  
plugin={"rerun:"
		+ "C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\Rerun\\fail.txt",
		"json:C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\AllReports\\JsonReport\\a.json"
	 })
public class RunAll {

	@AfterClass
	public static void report() {
		JVMReport.generationSurvey("C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\AllReports\\JsonReport\\a.json");

	}
}

