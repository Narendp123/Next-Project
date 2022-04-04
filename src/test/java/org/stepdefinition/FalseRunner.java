package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Rerun\\fail.txt",dryRun=false,
plugin= {"rerun:C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\Rerun\\fail.txt"})

public class FalseRunner {

}
