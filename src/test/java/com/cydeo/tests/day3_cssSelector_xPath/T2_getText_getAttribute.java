package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
	public static void main(String[] args) {

//		TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//		1- Open a chrome browser
		WebDriver driver = WebDriverFactory.getDriver("chrome");
		driver.manage().window().maximize();

//		2- Go to: https://login1.nextbasecrm.com/
		driver.get("https://login1.nextbasecrm.com/");

//		3- Verify “remember me” label text is as expected:
//		Expected: Remember me on this computer
		WebElement labelText = driver.findElement(By.className("login-item-checkbox-label"));
		String actualLabelText = labelText.getText();
		String expectedLabelText = "Remember me on this computer";
		if (expectedLabelText.equals(actualLabelText)){
			System.out.println("Label Text OK");
		}else{
			System.out.println("Label Text FAIL");
		}

//		4- Verify “forgot password” link text is as expected:
//		Expected: Forgot your password?
		WebElement forgotPassLink = driver.findElement(By.className("login-link-forgot-pass"));
		String actualForgotPassText = forgotPassLink.getText();
		String expectedForgotPassText = "Forgot your password?";
		System.out.println(actualForgotPassText);
		System.out.println(expectedForgotPassText);
		if (actualForgotPassText.equals(expectedForgotPassText)){
			System.out.println("Forgot Pass Link TEXT OK!");
		}else{
			System.out.println("Forgot Pass Link TEXT FAILED!!");
		}

//		5- Verify “forgot password” href attribute’s value contains expected:
//		Expected: forgot_password=yes
//      PS: Inspect and decide which locator you should be using to locate web
//      elements.

		String actualForgotPassHref = forgotPassLink.getAttribute("href");
		String expectedForgotPassHref = "forgot_password=yes";
		System.out.println(actualForgotPassHref);
		System.out.println(expectedForgotPassHref);
		if (actualForgotPassHref.contains(expectedForgotPassHref)){
			System.out.println("href verification is OK!");
		}else{
			System.out.println("href verification is FAILED!!");
		}
		driver.close();



	}
}
