package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class TechNewspageAction extends GetPage {

	public TechNewspageAction(WebDriver driver) {
		super(driver, "TechNewsPage");
		// TODO Auto-generated constructor stub
	}
	
	public void clickGmailIcon()
	{
		isElementDisplayed("gmailIcon");
		element("gmailIcon").click();
	}

}
