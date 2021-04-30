package com.it.qa.qaengineer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculationPageObject {

	@FindBy(id = "tx_val_1")
	WebElement value1;
	@FindBy(id = "tx_val_2")
	WebElement value2;
	@FindBy(id = "tx_val_3")
	WebElement value3;
	@FindBy(id = "tx_val_4")
	WebElement value4;
	@FindBy(id = "tx_val_5")
	WebElement value5;
	
	

	public boolean verifyValues(String fieldName) {
		boolean status = false;
		if (fieldName.equalsIgnoreCase("value1")) {
			if(value1.isDisplayed()) {
				status = true;
			}
			
		} else if (fieldName.equalsIgnoreCase("value2")) {
			if(value2.isDisplayed()) {
				status = true;
			}
			
		} else if (fieldName.equalsIgnoreCase("value3")) {
			if(value3.isDisplayed()) {
				status = true;
			}
		} else if (fieldName.equalsIgnoreCase("value4")) {
			if(value4.isDisplayed()) {
				status = true;
			}
		} else if (fieldName.equalsIgnoreCase("value5")) {
			if(value5.isDisplayed()) {
				status = true;
			}
		}
			
		
		
		return status;
	}

	public boolean verifyCurrencyValues(String fieldName) {
		boolean status = false;
		
		if (fieldName.equalsIgnoreCase("value1")) {
			if (value1.getText().startsWith("$")) {
				String value = value1.getText().replaceAll("[^a-zA-Z0-9]", "");
				int amount = Integer.parseInt(value);
				if (amount > 0)
					status = true;
			}

		} else if (fieldName.equalsIgnoreCase("value2")) {
			if (value2.getText().startsWith("$")) {
				String value = value2.getText().replaceAll("[^a-zA-Z0-9]", "");
				int amount = Integer.parseInt(value);
				if (amount > 0)
					status = true;
			}

		} else if (fieldName.equalsIgnoreCase("value3")) {
			if (value3.getText().startsWith("$")) {
				String value = value3.getText().replaceAll("[^a-zA-Z0-9]", "");
				int amount = Integer.parseInt(value);
				if (amount > 0)
					status = true;
			}

		} else if (fieldName.equalsIgnoreCase("value4")) {
			if (value4.getText().startsWith("$")) {
				String value = value4.getText().replaceAll("[^a-zA-Z0-9]", "");
				int amount = Integer.parseInt(value);
				if (amount > 0)
					status = true;
			}

		} else if (fieldName.equalsIgnoreCase("value5")) {
			if (value5.getText().startsWith("$")) {
				String value = value5.getText().replaceAll("[^a-zA-Z0-9]", "");
				int amount = Integer.parseInt(value);
				if (amount > 0)
					status = true;
			}

		}

		return status;
	}

	public boolean verifyTotal(Double expected) {
		boolean status = false;
		if (expected == Integer.parseInt(value1.getText().replaceAll("[^a-zA-Z0-9]", "")) + Integer.parseInt(value2.getText().replaceAll("[^a-zA-Z0-9]", ""))
				+ Integer.parseInt(value3.getText().replaceAll("[^a-zA-Z0-9]", "")) + Integer.parseInt(value4.getText().replaceAll("[^a-zA-Z0-9]", ""))
				+ Integer.parseInt(value5.getText().replaceAll("[^a-zA-Z0-9]", "")))
			status = true;
		return status;

	}

}
