package com.qaf_assignments.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import junit.framework.AssertionFailedError;

public class SearchresultPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.sourceDestination.result")
	private List<QAFWebElement> lnkSourceDestinationResult;
	
	@FindBy(locator = "btn.select.result")
	private List<QAFWebElement> selectButton;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<QAFWebElement> getLnkSourceDestinationResult() {
		return lnkSourceDestinationResult;
	}
	
	public List<QAFWebElement> getSelectButton() {
		return selectButton;
	}
	
	public void validateSearchResult(String expectedResult) {
		for(QAFWebElement sourceDestinationNames : getLnkSourceDestinationResult()) {
			try {
				Assert.assertEquals(expectedResult, sourceDestinationNames.getText());
			}catch (AssertionFailedError e) {
			Reporter.log("Expected Result is "+expectedResult+" but actual result is "+sourceDestinationNames.getText(), MessageTypes.Fail);
			}
			Reporter.log("Expected Result is "+expectedResult+" and actual result is "+sourceDestinationNames.getText(), MessageTypes.Pass);
			
		}
	}
	
	public void selectFlight() {
		try {
			Thread.sleep(4000);
			getSelectButton().get(0).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void waitForPageToLoad() {
		getSelectButton().get(0).waitForPresent();
	}
}
