Feature: New registration approve test

  Scenario: : Login to website
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully

  Scenario: Create a new registration approve
    Given  Navigate to Entrance Exams
    When  Create  a new registration approve
    Then I click on add button
    And I click on following elements
      | gradeLevelOfRegistration |
      | Option2                  |
      | chooseExam               |
      | Option2                  |
      | studentInformation       |
    And I enter text to following elements
      | lastName    | Ozkan      |
      | firstName   | Ersin      |
      | personalId  | 123        |
      | dateOfBirth | 01/01/1982 |
    And I click on following elements gender, citizenship and nationality in the Student information
    And I click on sutudent info save button
    And I fill up following elements
    And I click Relative Info save button
    Then Created succesfuly New registration Approve











