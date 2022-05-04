package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Myworkspace\\Hotelapp_Test\\src\\test\\java\\com\\Feature\\Adactin.feature", glue = "com.Stepdefinition.com",
monochrome = true,
dryRun = false,
strict = true,
plugin = {"html:HtmlReort/output2.html", "pretty" })

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws Throwable {
		base_Class.getBrowser("chrome");

	}

	@AfterClass
	public static void tear_Down() {
		base_Class.close();
	}

}
