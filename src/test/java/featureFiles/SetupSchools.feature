#Check all functionality of “Schools” menuAcceptance Criteria:
#User should be able to navigate the Basqar page.
#User should be able to login when he/she enters correct username and password.
#User should be able to navigate the Schools page
#User should be able to create a new school.
#User should be able to  edit school
#User should be able to  delete school
#User should be able to  search school
#User should be able to  turn on/off the “Active” button

Feature: Checking all functionality of Setup Schools menu

  Scenario: Login to page with given credentials
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully
    And I click on "Got it" button on cokkies dialog
    When I navigate to "Setup" menu
    And I click on the "School Setup" menu
    And I click on "Schools(Admin)" menu
    Then I should be on the "Schools" page

#  Scenario: Navigating to New School page


  Scenario: Adding new school
    Given I click on "Plus Sign" button on Schools page
    Then I should be on "New School" page
    When I enter the Name and Short Name
      | Name       | Deneme High School |
      | Short Name | DHS                |

    And I select a mask from "Phone Mask" drop down list
      | Mask 2 |
    And I select currency from "Default Currency" drop down list
      | USD |
    And I select time zone from "Default Time Zone" drop down list
      | US/Eastern |
    And Select language from "Default Language" drop down list
      | English |
    And I press "Save" button
    Then I should be in "Address Info" page
    When I enter the "Street" and "Country"
      | Burasi Cikmaz Sokak |
      | USA                 |
    And I select "City" from drop down list
      | Clifton |
    And I enter "Postal Code"
      | 30009 |
    And I click on "Save" button
    Then I should get "School Successfully created" message
    When I press the left arrow button to go to school list page
    Then I should see the new school name on the list



#

#
#  Scenario: Editing an existing school
#    Given I get the list of the school and select one of them randomly
#    When I click on edit button
#    And I enter new "Name"
#    And I enter new "Short Name"
#    And I press "Save" button
#    Then I should get "School successfully updated" message
#    When I press the left arrow button to go to school list page
#    Then I should see the updated name
#      | Erzincan High School |
#      | EHS                  |

  #  Scenario: Deleting the school
#    Given I get the list of schools and select one of them randomly
#    When I press delete button
#    And I click on "Yes" button on pop-up dialog
#    Then I should get "School successfully deleted" message



