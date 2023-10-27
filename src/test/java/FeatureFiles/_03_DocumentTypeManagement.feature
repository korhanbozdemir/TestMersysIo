Feature: Document Functionality

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Navigate to docuument
      | setUp                        |
      | parameters                   |
      | setUpParametersDocumentTypes |


  Scenario: Create a document


    Then Click button register
    When Create a document name as "ahmet" and click level and click ogrenci write as desciription "Basarili" and click save button
    Then Click to  amend edit
    Then Create a document name as "ali" and click level and click ogrenci and delete desciription and click save button
    Then  Search a name as "ali" and click search box and delete


  Scenario: Failur  date search
    Then User should display There is no data to display


  Scenario:Not Description document save
    Then Click button register
    Then Create a document name as "proje" and click level and click ogrenci write as desciription "" and click save button



