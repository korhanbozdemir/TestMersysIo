Feature: Parameters Editing Discounts

  Background:
    Given Navigate to Campus
    When Enter username as "turkeyts" and password as "TechnoStudy123" and click login button

  Scenario: Parameters Editing Discounts Positive
    Given Navigate to discounts
    When Create a discounts
    Then Success message should be displayed

    When Organize a discount
    Then Success message should be displayed

    When Delete discount
    Then Success message should be displayed

  Scenario: Parameters Editing Discounts Negative 1


    Then Navigate to discounts
    And Creating a discount with incomplete information
    And This field is required message should be displayed

  Scenario: Parameters Editing Discounts Negative 2

    Then Navigate to discounts
    And Searching for discounts with wrong data