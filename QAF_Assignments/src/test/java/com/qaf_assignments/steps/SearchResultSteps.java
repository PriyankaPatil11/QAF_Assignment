package com.qaf_assignments.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.base.Verify;
import com.qaf_assignments.components.FlightSearchList;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import junit.framework.AssertionFailedError;

public class SearchResultSteps extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub

	}

	@QAFTestStep(description = "Validate the result {0} from {1}")
	public void validateSearchResult(String expectedResult, String locator) {

		List<QAFWebElement> list = new WebDriverTestBase().getDriver().findElements(locator);
		for (QAFWebElement sourceDestinationNames : list) {
			// for(QAFWebElement sourceDestinationNames :
			// FlightSearchList.getLnkSourceDestinationResult()) {
			try {
				Assert.assertEquals(expectedResult, sourceDestinationNames.getText());
			} catch (AssertionFailedError e) {
				Reporter.log("Expected Result is " + expectedResult
						+ " but actual result is " + sourceDestinationNames.getText(),
						MessageTypes.Fail);
			}
			Reporter.log("Expected Result is " + expectedResult + " and actual result is "
					+ sourceDestinationNames.getText(), MessageTypes.Pass);

		}
	}

}
