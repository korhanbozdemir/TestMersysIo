@SmokeTest @Regression
Feature: SchoolSetup Functionality

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully


    And Navigate to schoolsetup
      | setUp       |
      | setUpSchoolSetUp |
      | setUpSchoolSetUpLocations   |

  Scenario: Create a schoolsetup

    Then Click button add
    When Add a location name as "yasin" and shortname as "kemal" and location as laboratory and capacity as "100" and click to empty area and click to save
    And  Click to edit and edit at name as "fatih" and edit shortname as "sultan" and edit location as other and edit capacity as "105" and click to empty area and click to save
    Then Click delete button and user should displayed verifieing message and click to button delete


  Scenario: Create a mistake locations save

    Then Click button add
    When Add a location name as "cumhuriyet" and shortname as "" and location as laboratory and capacity as "102"
    And User should display This field cannot be left blank!

  Scenario: Create a mistake nonactivity locations save

    Then Click button add
    When Add a location name as "ankara" and shortname as "cankaya" and location as laboratory and capacity as "103" and Click to activity and click to save

