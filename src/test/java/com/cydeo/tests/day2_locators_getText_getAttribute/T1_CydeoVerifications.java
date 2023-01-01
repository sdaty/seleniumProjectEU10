package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

	public static void main(String[] args) throws InterruptedException {

		/*

		TC #1: Cydeo practice tool verifications
		1. Open Chrome browser
		2. Go to https://practice.cydeo.com
		3. Verify URL contains
		Expected: cydeo
		4. Verify title:
		Expected: Practice

		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice.cydeo.com");
		String pageUrl = driver.getCurrentUrl();
		String pageTitle = driver.getTitle();

		String urlContains = "cydeo";
		String expectedTitle = "Practice";

		if (pageUrl.contains(urlContains)) {
			System.out.println("URL Verification is PASSED!");
		} else {
			System.out.println("URL Verification is FAILED!");
		}


		if (expectedTitle.equals(pageTitle)) {
			System.out.println("Title Verification is PASSED!");
		} else {
			System.out.println("Title Verification is FAILED!");
		}

		Thread.sleep(5000);
		driver.close();


	}
}
