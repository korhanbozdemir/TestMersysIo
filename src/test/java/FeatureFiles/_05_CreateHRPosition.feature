Feature: Human Resources Position

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

#    Given Navigate to Campus
#    When Write username and password "turkeyts" and "TechnoStudy123" and click login button
#    Then User should login successfully

  Scenario: HR functionality
    When The user navigates to HR
      | humanResources      |
      | humanRecourcesSetUp |
      | humanRecourcesSetUpPositions |


    And The user adds a new position
    Then The position should be added successfully

    And The user updates an existing position
    Then the position should be edited successfully

    And The user searches for a position
    Then The system should display the results

    And The user chooses to enable or disable a position
    Then The position's status should be updated

    And The user deletes a position
   Then The position should be deleted successfully
