package com.qaf_assignments.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.qaf_assignment.commonUtils.CommonUtils;
import com.qaf_assignments.pages.FlightdetailPage;
import com.qaf_assignments.pages.FlightsearchPage;
import com.qaf_assignments.pages.HomePage;
import com.qaf_assignments.pages.SearchresultPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class FlightSearch_CSV_Test extends WebDriverTestCase{
	
	
	@QAFDataProvider(dataFile = "resources/testData/FlightsData.csv")
	@Test(description = "Search flight with specific details")
	public void flightSearch_CSV_Test(Map<String,String> data) {
		
		
		HomePage homePage = new HomePage();
		homePage.launchPage();
		homePage.openFlightTab();
		
		FlightsearchPage flightSerachPage = new FlightsearchPage();
		flightSerachPage.waitForPageToLoad();
	
		flightSerachPage.enterFlightDetails(data.get("DepartingFrom"), data.get("DepartingTo"), data.get("DepartingDate"), data.get("ReturningDate"));
		flightSerachPage.clickOnSearch();
		
		SearchresultPage searchResultPage = new SearchresultPage();
		searchResultPage.waitForPageToLoad();
		searchResultPage.validateSearchResult(data.get("expctedSourceDestination"));
		searchResultPage.selectFlight();
		searchResultPage.waitForPageToLoad();
		searchResultPage.selectFlight();
		
		CommonUtils.switchWindow();
		FlightdetailPage flightDetailPage = new FlightdetailPage();
		flightDetailPage.waitForPageToLoad();
		flightDetailPage.VerifyAirportDetails(data.get("Source"), data.get("Destination"));
		String departureDate = CommonUtils.converDate(data.get("DepartingDate"));
		String returnDate = CommonUtils.converDate(data.get("ReturningDate"));
		flightDetailPage.verifyFlightDates(departureDate, returnDate);
		
	}

}
