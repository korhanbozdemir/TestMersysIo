Feature: Adding New Fields to Admin Panel

  Background:
    Given Navigate to Campus
    When Enter username and password as "turkeyts" and "TechnoStudy123"

#  Background:
#    Given Navigate to website
#    And The user enter a valid username and password and clicks to log in button
#    Then The user logs in successfully

  Scenario: Add a New Fields
    When User navigates to field
      | setUp                 |
      | setUpParameters       |
      | setUpParametersfields |
    And  User adds a new field
    Then New field should be added successfully

    And User edits an existing field
    Then Field should be edited successfully

    And User deletes an existing field
    Then Field should be deleted successfully

