package com.stepdef;

import java.io.IOException;

import com.mavfirst.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
@Before
public void beforeScenario() {
	
	toBrowserlaunchChrome();
	toMax();
	toImplicitWait(30);

}
@After
public void afterScenario(Scenario s) throws IOException {
	
	String name = s.getName();
	String fileName = name.replace(" ", "_");
	toGetScreenShot("C:\\Users\\ram\\eclipse-workspace\\AdactinCucumber\\snap\\"+fileName+".png");
	

}
}
