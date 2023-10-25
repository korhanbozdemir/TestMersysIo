Feature: Login Process

  Scenario: Verifing visibility of login page elements
    Given Navigate to website
    And The user verifies that they are in login page
    And The user verifies the visibility of campus symbol
    And The user verifies the visibility of social media text
    And The user verifies the visibility of Google Account,Facebook,Microsoft Office symbols

  Scenario: Verifing clickable of login page elements
    And The user verifies if remember me check box is clickable

  Scenario: Not Logging in any username or password
    And The user clicks to log in button
    Then The user sees an error message under input boxes

  Scenario: Logging in with a invalid username and password
    And The user enter an invalid username and password and clicks to log in button
    Then The user sees an error message

  Scenario: Logging in with a valid username and password
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully
