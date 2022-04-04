package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.HelperClass;
import org.pojo.Loginpojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition extends HelperClass  {
	
	Loginpojo l;
	
	@Given("To open facebook through chrome")
	public void to_open_facebook_through_chrome() {
	   launchEdgeDriver();
	   maxi();
	   getUrl("https://www.facebook.com/");
	}

	@When("user have enter valid user and  password")
	public void user_have_enter_valid_user_and_password(io.cucumber.datatable.DataTable d) {
	   List<Map<String, String>> a = d.asMaps();  
		String email = a.get(1).get("emailid");
		String pass = a.get(1).get("username");
		
		l = new Loginpojo();
		fillText(l.getTxtuser(), email);
		fillText(l.getTxtpass(), pass);
	}

	@Then("invalid password message")
	public void invalid_password_message() {
	   
		dates();
	}



	}
	