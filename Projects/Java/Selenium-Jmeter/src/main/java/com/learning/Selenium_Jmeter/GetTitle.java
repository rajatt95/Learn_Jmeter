package com.learning.Selenium_Jmeter;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class GetTitle {

	@Test
	public void testingWithHTMLUnitDriver() {

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Work in Local machine\\Softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 */

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Page Title: " + driver.getTitle());
 
		driver.quit();
	}

}
