package com.it.qa.qaengineer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {
	public String url = "https://www.exercise1.com/values";

	public WebDriver launchApplication(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

}
