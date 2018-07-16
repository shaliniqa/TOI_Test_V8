package com.qait.demo.tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.TestSessionInitiator;

public class TechNewsPageTest {
	TestSessionInitiator testSessionInitiator;

	@BeforeTest
    public void initializeVariable(){
        testSessionInitiator = new TestSessionInitiator(this.getClass().getName());
	}
	
	
	@Test
	public void FetchNews() throws IOException
	{
		testSessionInitiator.openUrl("https://www.gadgetsnow.com/latest-news?utm_source=toiweb&utm_medium=referral&utm_campaign=toiweb_hptopnav");
		testSessionInitiator.techNewsPageAction.clickGmailIcon();
	}
}