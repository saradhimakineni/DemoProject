@Calculation
Feature: This feature is to validate all the calculations that are performed in Calculation screen

  @FieldValues @Balance @Smoke
  Scenario: Validating field values and total balance
    When I have logged into exercise application
    Then I verify the right values present in the screen
    |value1|
    |value2|
    |value3|
    |value4|
    |value5|
    And I verify currency and values are greater than zero
    |value1|
    |value2|
    |value3|
    |value4|
    |value5|
    And I verify the total sum is 1000000.00
   
