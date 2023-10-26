Feature: Department Operations

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

  Scenario: Adding, deleting and editing sections by user
    When User navigates to sections
      | setupButton |
      | schoolSetupButton |
      | departmentsButton |

    And Add departments
    Then It was seen that the section was added

    And Department editing
    Then It was seen that it was edited

    And Delete a department
    Then Deletion seen