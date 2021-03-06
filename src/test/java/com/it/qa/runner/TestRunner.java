package com.it.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = { "/home/saradhi/Desktop/Learn/SampleProject/qaengineer/src/test/features" },
glue = {"com.it.qa.stepdefenitions" },
plugin = { "pretty","html:test-output" }, 
tags = "@Smoke",
monochrome = true,
publish = true,
dryRun = true)
public class TestRunner {

}
