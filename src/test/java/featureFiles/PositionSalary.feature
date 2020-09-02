Feature: Position salary functionality

  Scenario: Login  with  username and  password
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully

  Scenario: Create a new position salary
    And Navigate to Position Salary page
    When User create a position salary name as "New Position Salary"
    Then Success message should be displayed
