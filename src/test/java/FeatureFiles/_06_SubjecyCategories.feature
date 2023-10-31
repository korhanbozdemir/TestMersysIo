@Regression
Feature: Subject Categories Processes


  Background:
    Given Navigate to website
    And The user enter a valid username and password and clicks to log in button
    Then The user logs in successfully

    And Click on the element in LeftNav
      | education           |
      | educationSetUp    |
      | educationSetUpSubjectCategories  |

  Scenario: Subject Category
    And Click add button
    And Enter a name and code and click save button
    Then Verify visibility of the successful create message

    And The user searches any category
    And Click change button enter a name and code
    Then Verify visibility of the successful change message

    And Verify visibility of search button and input boxes
    And Enter a available name and click search button
    Then Verify that the name is available in list

    And Verify visibility of the action button and click it
    Then In the opened window click the action button and verify change

    And The user searches any category
    And Click delete icon and delete button
    Then Verify visibility of the successful delete message