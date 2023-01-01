package com.cydeo.tests.day1_selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tesla.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.get("https://www.google.com");

//		driver.navigate().to("http://www.yoltay.com");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();

		String title = driver.getTitle();
		System.out.println(driver.getTitle());

		String url = driver.getCurrentUrl();
		System.out.println(url);
//		Thread.sleep(4000);
		driver.close();


	}


}
