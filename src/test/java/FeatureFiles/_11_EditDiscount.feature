@SmokeTest @Regression
Feature: Parameters Editing Discounts

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

    And Navigate to discounts
      | setUp      |
      | setUpParameters |
      | setUpParametersDiscounts |

  Scenario: Parameters Editing Discounts Positive
    When Create a discounts
    Then Success message should be displayed

    When Organize a discount
    Then Success message should be displayed

    When Delete discount
    Then Success message should be displayed

  Scenario: Parameters Editing Discounts Negative 1

    And Creating a discount with incomplete information
    And This field is required message should be displayed

  Scenario: Parameters Editing Discounts Negative 2

    And Searching for discounts with wrong data