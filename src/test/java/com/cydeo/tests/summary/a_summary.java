package com.cydeo.tests.summary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_summary {

	public static void main(String[] args) throws InterruptedException {

		// Setting up the web driver manager
		WebDriverManager.chromedriver().setup();

		// Create instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		/*

		-------------------DAY01----------------------

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

		/*------------------------------------------------------------------------------------*/


/*		-------------------DAY02----------------------

		- .findElement(LOCATOR) method
			-Locators:
				1- linkText
				2- partialLinkText
				3- name
				4- id
				5- className
				6- tagName
				7- ...
				8- ...
		 - .getText()  => it returns String
		 - .getAttribute("attributeName") => it returns the given attribute's value
		 - .sendKeys("..." + Keys.ENTER)
		 - .click()
		 ----------------------------------------------------
*/
		// .findElement(By.linkText("string_value")).click()
		driver.findElement(By.linkText("A/B Testing")).click();
		// using like this is more usable :
		WebElement abLink = driver.findElement(By.linkText("A/B Testing"));
		abLink.click();

		// .findElement(By.name("string_value")).sendKeys("apple" + Keys.ENTER)
		driver.get("https://www.google.com");
		WebElement googleSearchBox = driver.findElement(By.name("name_query"));
		googleSearchBox.sendKeys("apple" + Keys.ENTER);

		// ex:
		// <div name="hu58" id="asdf324" class="cde45"> Text something </div>
		// driver.findElement(By.id("asdf324")).getAttribute("class") --> cde45
		// driver.findElement(By.id("asdf324")).getAttribute("name") --> hu58


/*		-------------------DAY03----------------------

		- Utility Class creating
		- .isDisplayed()  => driver.findElement(By.name("name")).isDisplayed();
		- cssSelector
		- xPath

		- .findElement(LOCATOR) method
			-Locators:
				1- ..
				2- ..
				3- ..
				4- ..
				5- ..
				6- ..
				7- cssSelector
				8-

		 ----------------------------------------------------
*/

	}
}
