package com.qaf_assignments.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlightsearchPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "txtbox.flyingFrom.flightsearch")
	private QAFWebElement txtboxFlyingFromFlightsearch;
	@FindBy(locator = "txtbox.flyingTo.flightsearch")
	private QAFWebElement txtboxFlyingToFlightsearch;
	@FindBy(locator = "txtbox.departingDate.flightsearch")
	private QAFWebElement txtboxDepartingDateFlightsearch;
	@FindBy(locator = "txtbox.returningDate.flightsearch")
	private QAFWebElement txtboxReturningDateFlightsearch;
	@FindBy(locator = "btn.search.flightsearch")
	private QAFWebElement btnSearchFlightsearch;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getTxtboxFlyingFromFlightsearch() {
		return txtboxFlyingFromFlightsearch;
	}

	public QAFWebElement getTxtboxFlyingToFlightsearch() {
		return txtboxFlyingToFlightsearch;
	}

	public QAFWebElement getTxtboxDepartingDateFlightsearch() {
		return txtboxDepartingDateFlightsearch;
	}

	public QAFWebElement getTxtboxReturningDateFlightsearch() {
		return txtboxReturningDateFlightsearch;
	}

	public QAFWebElement getBtnSearchFlightsearch() {
		return btnSearchFlightsearch;
	}
	
	@Override
	public void waitForPageToLoad() {
		txtboxFlyingFromFlightsearch.waitForPresent();
	}
	
	public void enterFlightDetails(String flyingFrom, String flyingTo, String departureDate, String resturningDate) {
	txtboxFlyingFromFlightsearch.clear();
	txtboxFlyingFromFlightsearch.sendKeys(flyingFrom);
	
	txtboxFlyingToFlightsearch.clear();
	txtboxFlyingToFlightsearch.sendKeys(flyingTo);
	
	txtboxDepartingDateFlightsearch.clear();
	txtboxDepartingDateFlightsearch.sendKeys(departureDate);
	
	txtboxReturningDateFlightsearch.clear();
	txtboxReturningDateFlightsearch.sendKeys(resturningDate);
	}
	
	public void clickOnSearch() {
		btnSearchFlightsearch.click();
	}

}

