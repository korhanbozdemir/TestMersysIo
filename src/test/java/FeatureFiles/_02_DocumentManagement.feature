Feature: Certification management functionality

  Scenario: Certification management positive test

    Given Navigate to Campus
    When Enter username as "turkeyts" and password as "TechnoStudy123" and click login button
    Then Navigate to  Attestations

    And Create a attestations
    And Success message should be displayed

    When Document editing
    Then Success message should be displayed

    When Delete documents
    Then Success message should be displayed

  Scenario: Certification management negative test 1
    Given Navigate to Campus
    When Enter username as "turkeyts" and password as "TechnoStudy123" and click login button
    Then Navigate to  Attestations
    When Create a document with the same data
    And Already exists message should be displayed


  Scenario: Certification management negative test 2

    Given Navigate to Campus
    When Enter username as "turkeyts" and password as "TechnoStudy123" and click login button
    Then Navigate to  Attestations
    And Search with incorrect data