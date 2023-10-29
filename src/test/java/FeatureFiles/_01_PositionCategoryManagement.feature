Feature: Position Category Document Management Functionality


  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

  Scenario: select Position category

    Given Click on the position element in LeftNav
    And The user adds a new position
    Then The position should be added successfully

    And User should be edit the position
    Then The position should be edited successfully

    And User should be able to delete the position
    Then The position should be deleted successfully






