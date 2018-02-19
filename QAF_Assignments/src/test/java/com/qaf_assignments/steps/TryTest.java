package com.qaf_assignments.steps;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;

public class TryTest extends WebDriverBaseTestPage<WebDriverTestPage>{

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.get("/");
		
	}
	
	@Override
	public boolean isPageActive(PageLocator loc, Object... args) {
		return true;
	}
	
	public static void main(String agrs[]) {
		TryTest t = new TryTest();
		t.launchPage(null);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
