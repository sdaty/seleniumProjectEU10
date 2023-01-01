package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		TC #2: Back and forth navigation
		1- Open a chrome browser
		2- Go to: https://practice.cydeo.com
		3- Click to A/B Testing from top of the list.
		4- Verify title is:
			Expected: No A/B Test
		5- Go back to home page by using the .back();
		6- Verify title equals:
			Expected: Practice
		 */

		driver.navigate().to("https://practice.cydeo.com");
		Thread.sleep(2000);

		// method => .findElement().click()
		// driver.findElement(By.linkText("A/B Testing")).click();

		// using like this is more usable :
		WebElement abLink = driver.findElement(By.linkText("A/B Testing"));
		abLink.click();


		String currentTitle1 = driver.getTitle();
		String expectedTitle1 = "No A/B Test";

		if (currentTitle1.equals(expectedTitle1)) {
			System.out.println("Title-1 PASSED");
		} else {
			System.out.println("Title-1 FAILED");
		}
		Thread.sleep(3000);
		driver.navigate().back();

		String currentTitle2 = driver.getTitle();
		String expectedTitle2 = "Practice";

		if (currentTitle2.equals(expectedTitle2)) {
			System.out.println("Title-2 PASSED");
		} else {
			System.out.println("Title-2 FAILED");
		}
		Thread.sleep(1500);
		driver.close();


	}
}
