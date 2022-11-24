package com.RunnerCucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//FeatureFile",glue = {"com.Step"}, monochrome= true,

		plugin = {"html:Report/r1.html", "json:Report/cucumber.json"}
		)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void browserOpen() {

		driver = BaseClass.borsweLanuch("chrome");
	}

	@AfterClass
	public  static void browserClose() {
		//driver.quit();

	}

}
