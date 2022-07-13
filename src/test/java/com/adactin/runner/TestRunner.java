package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\features",glue="com\\adactin\\stepDefinition",
monochrome=true,dryRun=false,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner {
public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		
     driver = Base_Class.getBrowser("chrome");
	}
	@AfterClass
	public static void tearDown() {
		
		driver.close();
	}
	
	
	
	
	
	
	
}
