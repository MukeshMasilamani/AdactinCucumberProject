package com.runall;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src\\test\\resources" , 
glue = "com.stepdef" , 
dryRun= false,
monochrome = true ,plugin = { "html:target\\Report" , "json:target\\Report\\output.json","junit:target\\Report\\fb.xml" })
public class Runner {

}
