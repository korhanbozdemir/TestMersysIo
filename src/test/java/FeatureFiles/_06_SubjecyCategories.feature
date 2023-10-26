Feature: Subject Categories Processes

  Scenario: Navigate to subject categories
    Given Navigate to website
    And The user clicks to log in button
    And The user verifies that they are in login page
    And The user enter a valid username and password and clicks to log in button
    And Click on the element in LeftNav
      | education           |
      | education setup     |
      | subject categories  |

  Scenario: Add Subject Category
    And Click add button
    And Enter a name and code and click save button
    Then Verify visibility of the successful create message

  Scenario: Change Subject Category
    And The user searches any category
    And Click change button enter a name and code
    Then Verify visibility of the successful change message

  Scenario: Search Subject Category
    And Verify visibility of search button and input boxes
    And Enter a available name and click search button
    Then Verify that the name is available in list


  Scenario: Action In Subject Category
    And Verify visibility of the action button and click it
    Then In the opened window click the action button and verify change

  Scenario: Delete Subject Category
    And The user searches any category
    And Click delete icon and delete button
    Then Verify visibility of the successful delete message