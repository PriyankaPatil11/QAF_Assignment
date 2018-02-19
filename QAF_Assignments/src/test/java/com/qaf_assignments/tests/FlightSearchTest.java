package com.qaf_assignments.tests;

import java.util.Properties;

import org.testng.annotations.Test;

import com.qaf_assignment.commonUtils.CommonUtils;
import com.qaf_assignments.beans.FlightDetails;
import com.qaf_assignments.pages.FlightdetailPage;
import com.qaf_assignments.pages.FlightsearchPage;
import com.qaf_assignments.pages.HomePage;
import com.qaf_assignments.pages.SearchresultPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class FlightSearchTest extends WebDriverTestCase{
	
	@Test
	public void flightSearchTest() {
		
		
		HomePage homePage = new HomePage();
		homePage.launchPage();
		homePage.openFlightTab();
		
		Properties prop = FlightDetails.setPropertiesFile("resources//testData//flightdata.properties");
		
	
		FlightsearchPage flightSerachPage = new FlightsearchPage();
		flightSerachPage.waitForPageToLoad();
		flightSerachPage.enterFlightDetails(prop.getProperty("DepartingFrom"), prop.getProperty("DepartingTo"), prop.getProperty("DepartingDate"), prop.getProperty("ReturningDate"));
		flightSerachPage.clickOnSearch();
		
		SearchresultPage searchResultPage = new SearchresultPage();
		searchResultPage.waitForPageToLoad();
		searchResultPage.validateSearchResult(prop.getProperty("expctedSourceDestination"));
		searchResultPage.selectFlight();
		searchResultPage.waitForPageToLoad();
		searchResultPage.selectFlight();
		
		CommonUtils.switchWindow();
		FlightdetailPage flightDetailPage = new FlightdetailPage();
		flightDetailPage.VerifyAirportDetails(prop.getProperty("Source"), prop.getProperty("Destination"));
		String departureDate = CommonUtils.converDate(prop.getProperty("DepartingDate"));
		System.out.println(departureDate);
		
	}

}
