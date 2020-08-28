Feature: New registration approve test

  Scenario: Login to website
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on loggin button
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
      | lastName  | ozkan |
      | firstName | ersin |
    And I click on following elements
      | dateOfBirth |
      | dateOfBirth |
    And I enter text to following elements
      | dateOfBirth | 01/01/1982 |
      | personalId  | 123        |
    And I click on following elements
      | gender       |
      | citizenship  |
      | nationality  |
      | relativeInfo |

    And I click on sutudent info save button
    And I fill up following elements
    And I click Relative Info save button
    Then Created succesfuly New registration Approve










