package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_ {
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		TC #5: getText() and getAttribute() method practice
		1- Open a chrome browser
		2- Go to: https://practice.cydeo.com/registration_form
		3- Verify header text is as expected:
		  Expected: Registration form
		4- Locate “First name” input box
		5- Verify placeholder attribute’s value is as expected:
		  Expected: first name
		 */


	}
}
