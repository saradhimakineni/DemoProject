package com.it.qa.qaengineer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	public String url = "https://www.exercise1.com/values";

	public WebDriver launchApplication(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "/home/saradhi/Desktop/chrome");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		return driver;
	}

}
