package com.qaf_assignments.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.flightTab.home")
	private QAFWebElement lnkFlightTabHome;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	driver.get("/");
	driver.manage().window().maximize();
	}

	public QAFWebElement getLnkFlightTabHome() {
		return lnkFlightTabHome;
	}

	public void openFlightTab() {
		lnkFlightTabHome.click();
	}
	
	public void launchPage() {
		openPage(null, null);
	}
}
