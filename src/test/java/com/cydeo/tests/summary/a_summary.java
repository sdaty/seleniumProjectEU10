package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_summary {

	public static void main(String[] args) throws InterruptedException {

		// Setting up the web driver manager
		WebDriverManager.chromedriver().setup();

		// Create instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		/*

		driver.get("https://www.whatismyip.com");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		driver.navigate().to("http://www.yoltay.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();

		 */

		driver.get("https://www.whatismyip.com");
		String title = driver.getTitle();
		// or;
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.yoltay.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.close();

	}
}
