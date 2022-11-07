package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ISAI\\eclipse-workspace\\CuCumberTest\\src\\test\\java\\com\\app\\feature\\LoginPage.feature",
glue = "stepDefinition", dryRun = false,
monochrome = true, publish = true, tags = "@userisai")

public class RunnerClass {

}
