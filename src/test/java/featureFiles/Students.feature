Feature: Students functionality

  Background: Students scenario background

    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully

  Scenario:Create a new student
    Given Navigate to Student Page
    And Click on
      | cookieMessageButton |
      | StudentButton       |
      | StudentsButton      |
      | AddButton           |
    And User sending input to form
      | FirstNameInput | Minas    |
      | LastNameInput  | Yildiran |
      | StudentIdInput | 5353     |
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
#      | DocumentTypeDropdown     |
#      | Option1                  |
    And Select to dropdown menu
    And User sending input to form
      | DocumentNumberInput | 123456 |
    And Click in the form page
      | RepresentativesButton   |
      | PopUpPlusButton         |
      | RepresentativesDropdown |
      | Option1                 |
    And User sending input to form
      | PopUpFirstNameInput   | Merve      |
      | PopUpLastNameInput    | Eksilioglu |
      | PopUpMobilePhoneInput | 2163434753 |
    And Click in the form page
      | PopUpCountryButton   |
      | Option2              |
      | PopUpAddButton       |
      | SaveButton           |
      | PopUpEntryFromButton |
      | Option2              |
      | EnrollmentSaveButton |
    Then Success message should be displayed

  Scenario:Edit a new student
    Given Navigate to Student Page
    And Click on
      | StudentButton  |
      | StudentsButton |
    And User sending input to form
      | StudentIdSearchInput | 5353 |
    And Click in the form page
      | SearchButton |
      | EditButton   |
    And User sending input to form
      | FirstNameInput | Mina |
    And Click in the form page
      | SaveButton |
    Then Success message should be displayed

  Scenario:Delete a new student
    Given Navigate to Student Page
    And Click on
      | StudentButton  |
      | StudentsButton |
    And User sending input to form
      | StudentIdSearchInput | 5353 |
    And Click in the form page
      | SearchButton |
      | DeleteButton |
      | YesButton    |
    Then Success message should be displayed


