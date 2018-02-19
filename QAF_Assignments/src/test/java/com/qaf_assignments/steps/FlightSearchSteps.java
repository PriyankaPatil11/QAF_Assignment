package com.qaf_assignments.steps;

import com.google.common.base.Verify;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import org.apache.commons.lang.Validate;
import org.jdom.Verifier;
import org.testng.annotations.Test;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.click;

public class FlightSearchSteps extends WebDriverBaseTestPage<WebDriverTestPage>{

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@QAFTestStep(description = "User navigate on Flight Tab page")
	public void VerifyFlightTab() {
		click("lnk.flightTab.home");
	}
	
	
	@QAFTestStep(description = "Enter Flying from as {0}")
	public void enterSourceCity(String source) {
	clear("txtbox.flyingFrom.flightsearch");	
	sendKeys(source, "txtbox.flyingFrom.flightsearch");
	}
	
	@QAFTestStep(description = "Enter Flying To as {0}")
	public void enterDestinationCity(String destination) {
	clear("txtbox.flyingTo.flightsearch");	
	sendKeys(destination, "txtbox.flyingTo.flightsearch");
	}
	
	@QAFTestStep(description = "Enter Departure date as {0}")
	public void enterDepartureDate(String date) {
	clear("txtbox.departingDate.flightsearch");	
	sendKeys(date, "txtbox.departingDate.flightsearch");
	}
	
	@QAFTestStep(description = "Enter Return date as {0}")
	public void enterReturnDate(String date) {
	clear("txtbox.returningDate.flightsearch");	
	sendKeys(date, "txtbox.returningDate.flightsearch");
	}
	
	@QAFTestStep(description = "click on Search button")
	public void clickOnSearchButton() {
	click("btn.search.flightsearch");
	}
	
}
