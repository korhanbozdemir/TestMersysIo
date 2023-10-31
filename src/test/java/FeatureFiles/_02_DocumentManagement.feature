@SmokeTest @Regression
Feature: Certification management functionality


  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

    And Navigate to  Attestations
      | humanResources      |
      | humanRecourcesSetUp |
      | humanRecourcesSetUpAttestations |

  Scenario: Certification management positive test

    And Create a attestations
    And Success message should be displayed

    When Document editing
    Then Success message should be displayed

    When Delete documents
    Then Success message should be displayed

  Scenario: Certification management negative test 1
    When Create a document with the same data
    And Already exists message should be displayed

  Scenario: Certification management negative test 2
    And Search with incorrect data