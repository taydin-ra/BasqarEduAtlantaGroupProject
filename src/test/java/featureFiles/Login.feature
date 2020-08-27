Feature: Login functionallty

  Scenario Outline: Login  with  username and  password
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the "<username>" and "<password>"
    And Click on loggin button
    Then I am logged in successfully
    Examples:
      | username             | password        |
     #Valid username and password
      | daulet2030@gmail.com | TechnoStudy123@ |
     #Invalid username and valid password
      | daulet203@gmail.com  | TechnoStudy123@ |
     #Invalid username and valid password
      | daulet2030@gmail.com | TechnoStudy123  |
     #Invalid username and password
       | daulet203@gmail.com | TechnoStudy123  |
