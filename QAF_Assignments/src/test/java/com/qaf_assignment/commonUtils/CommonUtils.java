package com.qaf_assignment.commonUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CommonUtils {
	
	public static void switchWindow() {
		String parentWindowHandle = new WebDriverTestBase().getDriver().getWindowHandle();
		for(String window : new WebDriverTestBase().getDriver().getWindowHandles()) {
//			System.out.println(window);
//			if(!window.equals(parentWindowHandle)) {
				new WebDriverTestBase().getDriver().switchTo().window(window);
//			}
		}
	}
	
	public static String converDate(String myDate) {
		try {
		System.out.println(myDate);
//		SimpleDateFormat dt = new SimpleDateFormat("MM/DD/YYYY"); 
//		Date date1 = dt.parse(date); 
//		System.out.println("date1 "+date1);
//		SimpleDateFormat dt1 = new SimpleDateFormat("mmm dd, yyyy");
//		System.out.println(dt1.format(date1));
			
//			String dateStr = "Thu Jan 19 2012 01:00 PM";
		    DateFormat readFormat = new SimpleDateFormat("MM/dd/yyyy");

		    DateFormat writeFormat = new SimpleDateFormat("MMM dd yyyy");
		    Date date = null;
		    try {
		       date = readFormat.parse(myDate);
		    } catch ( ParseException e ) {
		        e.printStackTrace();
		    }

		    String formattedDate = "";
		    if( date != null ) {
		    formattedDate = writeFormat.format(date);
		    }
					
		return formattedDate;
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return "error";
		}
		
	}

}
