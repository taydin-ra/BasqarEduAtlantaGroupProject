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
    Given I enter text to follwing elements
    Given I click on save button
    Then New registration created is successfuly










