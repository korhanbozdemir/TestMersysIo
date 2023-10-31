@SmokeTest @Regression
Feature: Position Category Document Management Functionality


  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

  Scenario: Select Position category

    When The user navigates to Position Category
      | humanResources      |
      | humanRecourcesSetUp |
      | HumanRecourcesSetUpPositionsCat |

    And The user adds a new position1
    Then The position should be added successfully1

    And User should be edit the position1
    Then The position should be edited successfully1

    And User should be able to delete the position1
    Then The position should be deleted successfully1






