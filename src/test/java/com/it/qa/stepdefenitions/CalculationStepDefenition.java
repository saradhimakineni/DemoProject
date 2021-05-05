package com.it.qa.stepdefenitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.it.qa.qaengineer.CalculationPageObject;
import com.it.qa.qaengineer.LoginPageObject;
import com.it.qa.runner.CommonObjects;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculationStepDefenition extends CommonObjects {

	@When("I have logged into exercise application")
	public void i_have_logged_into_exercise_application() {
		driver = new LoginPageObject().launchApplication(driver);
	}

	@Then("I verify the right values present in the screen")
	public void i_verify_the_right_values_present_in_the_screen() {
//		DataTable dataTable
//		List<List<String>> rows = dataTable.asLists(String.class);
//		for (List<String> columns : rows) {
//			Assert.assertTrue("Values are not matching as expected",
//					new CalculationPageObject().verifyValues());
//			columns.get(0))
//		}
	}

	@Then("I verify currency is present or not")
	public void i_verify_currency(DataTable dataTable) {
//		List<List<String>> rows = dataTable.asLists(String.class);
//		for (List<String> columns : rows) {
//			Assert.assertTrue("Values are not matching as expected",
//					new CalculationPageObject().verifyCurrencyValues(columns.get(0)));
//		}
	}
	
	@Then("I verify values are greater than zero")
	public void i_verify_values_are_greater_than_zero(DataTable dataTable) {
//		List<List<String>> rows = dataTable.asLists(String.class);
//		for (List<String> columns : rows) {
//			Assert.assertTrue("Values are not matching as expected",
//					new CalculationPageObject().verifyCurrencyValues(columns.get(0)));
//		}
	}

	@Then("I verify the total sum is {double}")
	public void i_verify_the_total_sum_is(Double total) {
		new CalculationPageObject().verifyTotal(total);
	}

}
