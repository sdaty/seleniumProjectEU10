package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {

		// Setting up the web driver manager
		WebDriverManager.chromedriver().setup();

		// Create instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Test if driver is working as expected
		driver.get("https://www.whatismyip.com");


	}
}
