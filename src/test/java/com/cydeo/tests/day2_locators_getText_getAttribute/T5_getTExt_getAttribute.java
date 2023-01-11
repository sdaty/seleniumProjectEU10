package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTExt_getAttribute {
	public static void main(String[] args) {


//		TC #5: getText() and getAttribute() method practice
//		1- Open a chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		2- Go to: https://practice.cydeo.com/registration_form
		driver.get("https://practice.cydeo.com/registration_form");

//		3- Verify header text is as expected:
//		  Expected: Registration form
		WebElement headerText = driver.findElement(By.tagName("h2"));
		String actualHeader = headerText.getText();
		String expectedHeader = "Registration form";
		if (actualHeader.equals(expectedHeader)){
			System.out.println("Header is OK");
		}else{
			System.out.println("Header FAIL");
		}

//		4- Locate “First name” input box
		WebElement inputbox = driver.findElement(By.name("firstname"));
		inputbox.sendKeys("First name");

//		5- Verify placeholder attribute’s value is as expected:
//		  Expected: first name
		String placeholder = driver.findElement(By.name("firstname")).getAttribute("placeholder");
		String expectedPlaceholder = "first name";
		if (placeholder.equals(expectedPlaceholder)){
			System.out.println("Placeholder is OK");
		}else{
			System.out.println("Placeholder FAIL");
		}
		driver.close();




	}
}
