package org.stepdefinition;

import org.baseclass.HelperClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HelperClass{

	
	@Before
	public void bef() {
	System.out.println("Bef");
	}
	
	@Before(order=1)
	public void bef1() {
	System.out.println("Bef-1");
	}
	
	@Before(order=2)
	public void bef2() {
	System.out.println("Bef-2");
	}

	@After
	public void Aft(Scenario s) {
	if (s.isFailed()) {
		TakesScreenshot t = (TakesScreenshot)driver;
		byte[] sc = t.getScreenshotAs(OutputType.BYTES);
		s.embed(sc, "image/png");
	}
	
	}
	
	@After(order=1)
	public void Aft1() {
	System.out.println("Aft-1");
	}
	
	@After(order=2)
	public void Aft2() {
	System.out.println("Aft-2");
	}
	
	
	
	
	
	
	
	
	
	
}
