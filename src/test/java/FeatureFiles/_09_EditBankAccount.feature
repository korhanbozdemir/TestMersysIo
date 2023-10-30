Feature: Bank Account Edit Functionality

  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

  Scenario: Select bank accounts

    Given Click on the bank accounts element in LeftNav
    And User should be able to add accounts
    Then The account should be added successfully

    And User should be edit the account
    Then The account should be edited successfully

    And User should be able to delete the account
    Then The account should be deleted successfully
