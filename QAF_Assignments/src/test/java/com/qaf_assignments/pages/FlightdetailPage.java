package com.qaf_assignments.pages;

import java.util.List;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class FlightdetailPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "txt.flyingDate.detailPage")
	private QAFWebElement txtFlyingDateDetailPage;
	
	
	@FindBy(locator = "txt.ReturnDate.detailPage")
	private QAFWebElement txtReturnDateDetailPage;
	
	@FindBy(locator = "txt.DepartureAirport.detailPage")
	private List<QAFWebElement> txtDepartureAirportDetailPage;
	
	@FindBy(locator = "txt.arrivalAirport.detailPage")
	private List<QAFWebElement> txtArrivalAirportDetailPage;
	
	@FindBy(locator = "txt.header.detailPage")
	private QAFWebElement txtheaderdetailPage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getTxtFlyingDateDetailPage() {
		return txtFlyingDateDetailPage;
	}

	public QAFWebElement getTxtReturnDateDetailPage() {
		return txtReturnDateDetailPage;
	}

	public List<QAFWebElement> getTxtDepartureAirportDetailPage() {
		return txtDepartureAirportDetailPage;
	}

	public List<QAFWebElement> getTxtArrivalAirportDetailPage() {
		return txtArrivalAirportDetailPage;
	}
	
	public QAFWebElement gettxtheaderdetailPage() {
		return txtheaderdetailPage;
	}
	
	public void VerifyAirportDetails(String departure, String destination) {
		Validator.verifyThat(getTxtDepartureAirportDetailPage().get(0).getText(), Matchers.equalTo(departure));
		Validator.verifyThat(getTxtDepartureAirportDetailPage().get(1).getText(), Matchers.equalTo(destination));
		Validator.verifyThat(getTxtArrivalAirportDetailPage().get(0).getText(), Matchers.equalTo(destination));
		Validator.verifyThat(getTxtArrivalAirportDetailPage().get(1).getText(), Matchers.equalTo(departure));	
	}
	
	public void verifyFlightDates(String departureDate, String returnDate) {
		
		Validator.verifyThat(getTxtFlyingDateDetailPage().getText().replace(",", ""), Matchers.equalTo(departureDate));
		Validator.verifyThat(getTxtReturnDateDetailPage().getText().replace(",", ""), Matchers.equalTo(returnDate));
	}

	@Override
	public void waitForPageToLoad() {
		txtheaderdetailPage.waitForPresent();
	}
}
