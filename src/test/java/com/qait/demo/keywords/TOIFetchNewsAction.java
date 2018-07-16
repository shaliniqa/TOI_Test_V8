package com.qait.demo.keywords;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.TextFileWriter;

public class TOIFetchNewsAction extends TextFileWriter 
{

	public TOIFetchNewsAction(WebDriver driver) {
		super(driver, "TOIFetchNews");
		// TODO Auto-generated constructor stub
	}
	
	public void section_CityStories() throws IOException
	{
		element("PopUp_dactive").click();
		
		String top_news=element("topNewsData").getText();
		txt_writer("Top News", top_news);

		String city_news=element("cityNewsData").getText();
		//System.out.println(news);
		txt_writer("City News", city_news);
		
	}
}