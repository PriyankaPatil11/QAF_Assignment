package com.qaf_assignments.steps;

import org.hamcrest.Description;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class HomePageSteps extends WebDriverBaseTestPage<WebDriverTestPage> {

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
		driver.manage().window().maximize();
	}
	
	@QAFTestStep(description = "Open Tourism website")
	public void launchPage() {
		openPage(null, null);
	}
	
	@QAFTestStep(description = "Navigate on Flight tab")
	public void openflightTab() {
		click("lnk.flightTab.home");
	}

}
