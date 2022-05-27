package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features ="src/main/java/com/feature",
		glue="com.stepdefs",
		plugin = {"html:target"},
		monochrome=true,//redble output
		dryRun=false,//compile feature file
		tags="@kiran"
	) 

public class TestRunner {
	

}
