Feature: Create a new grade level

  Scenario: Login to website
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully

  Scenario: opening grade lavel
    When go to setup menu
    When Chose garde lavel from Parametrs and click

    And I enter text to following elements
      | dateOfBirth | 01/01/1982 |
      | personalId  | 123        |
    And I click on following elements
      | gender       |
      | citizenship  |
      | nationality  |
      | relativeInfo |
