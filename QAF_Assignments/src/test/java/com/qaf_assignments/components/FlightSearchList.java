package com.qaf_assignments.components;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class FlightSearchList extends QAFWebComponent{

	public FlightSearchList(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	@FindBy(locator = "lnk.sourceDestination.result")
	private static List<QAFWebElement> lnkSourceDestinationResult;

	public static List<QAFWebElement> getLnkSourceDestinationResult() {
		return lnkSourceDestinationResult;
	}

}
