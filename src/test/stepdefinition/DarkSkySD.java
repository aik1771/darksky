package com.darksky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DarkSkySD extends DriverWrapper {
	
	
	@Given("^I am on darksky page$")
	public void iAmOnDarkskyPage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		initializeWebDriver();
	}

	@When("^I Clear search text field$")
	public void iClearSearchTextField() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^I Enter address or zipcode into the search field$")
	public void iEnterAddressOrZipcodeIntoTheSearchField() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^I Click on search magnifying glass$")
	public void iClickOnSearchMagnifyingGlass() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Verify current temperature is between low and high value$")
	public void verifyCurrentTemperatureIsBetweenLowAndHighValue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}




}
