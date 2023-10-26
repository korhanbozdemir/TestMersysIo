Feature: Adding New Nationalities under Parameters

  Background:
    Given Navigate to Campus
    When Enter username and password as "turkeyts" and "TechnoStudy123"

#  Background:
#    Given Navigate to website
#    And The user enter a valid username and password and clicks to log in button
#    Then The user logs in successfully

  Scenario: Add a New Nationality
    When User navigates to nationality
      | setUp                        |
      | setUpParameters              |
      | setUpParametersNationalities |
    And  User adds a new nationality
    Then New nationality should be added successfully

    And User edits an existing nationality
    Then Nationality should be edited successfully

    And User deletes an existing nationality
    Then Nationality should be deleted successfully

