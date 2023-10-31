@SmokeTest @Regression
Feature: Editing Grade Levels

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

  Scenario: Grade Levels Functionality
    When The user navigates to grade levels
      | setUp                      |
      | setUpParameters            |
      | setUpParametersGradeLevels |


    And The user adds a new grade level
    Then The grade level should be added successfully

    And The user edits a grade level
    Then The grade level should be edited successfully

    And The user deletes a grade level
    Then The grade level should be deleted successfully