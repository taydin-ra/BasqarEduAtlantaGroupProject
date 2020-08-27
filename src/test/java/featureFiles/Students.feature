Feature: Students functionality

  Background: Students scenario background

    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on loggin button
    Then I am logged in successfully

  Scenario:Create a new student
    Given Navigate to Student Page
    And Click on
      | StudentButton  |
      | StudentsButton |
      | AddButton      |
    And User sending input to form
    And Click in the form page
      | GenderDropdown           |
      | Option2                  |
      | GradeLevelDropdown       |
      | Option2                  |
      | SchoolDepartmentDropdown |
      | Option1                  |
      | SectionDropdown          |
      | Option1                  |
      | CitizenshipDropdown      |
      | Option5                  |

    And User sending input to form
    And Click in the form page


