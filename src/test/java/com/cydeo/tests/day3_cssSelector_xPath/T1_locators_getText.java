package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T1_locators_getText {
	public static void main(String[] args) {

		WebDriver driver = WebDriverFactory.getDriver("firefox");
		driver.get("https://google.com");
	}
}
