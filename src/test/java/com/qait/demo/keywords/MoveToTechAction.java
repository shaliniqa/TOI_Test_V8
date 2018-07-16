package com.qait.demo.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qait.automation.getpageobjects.GetPage;

public class MoveToTechAction extends GetPage {

	public MoveToTechAction(WebDriver driver) {
		super(driver, "MoveToTech");
		// TODO Auto-generated constructor stub
	}
		
	public void selectTech()
	{
		element("PopUp_dactive").click();

		isElementDisplayed("Tech_link");
        //HoverAndClick(element("Tech_link"),element("techNews_link"));
		hover(element("Tech_link"));
		/*WebDriver driver=getDriver();
		WebElement Tech=driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[7]/a"));
		WebElement Technews=driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[7]/div/div[1]/ul/li[1]/a"));
		//public static void HoverAndClick(WebDriver driver,WebElement elementToHover,WebElement elementToClick) {
			Actions action = new Actions(driver);
            action.moveToElement(Tech).click(Technews).build().perform();
	}*/
		
		HoverAndClick(element("Tech_link"),element("techNews_link"));
		
	}

	


}