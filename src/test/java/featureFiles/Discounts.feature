Feature: Create a new discount

  Background:Login  with  username and  password

    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button


  Scenario:Create a discount on Basqar

    Given I click on Setup
    And   I click on Parameter
    And   I click on Discounts
    And   I click on add discount button
    Then  I enter "MyDiscount" in the "description"
    And   I enter "MyD123" in the "integrationCode"
    And   I enter "1" in the "priority"
    Then  I click on Save button
    And   "VerificationMessage" is seen "successfully"
    When I click on Edit button
    Then I update the discount name as"MyDiscount1" in the "description"
    And  I click on Save button
    And  "VerificationMessage" is seen "successfully"
    When I click on delete button
    Then I confirm "Yes"
    And  "VerificationMessage" is seen "successfully"












