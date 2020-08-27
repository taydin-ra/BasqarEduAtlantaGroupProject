Feature: Login functionallty


  Scenario: Navigate to website and Login  with  username and  password
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on login button
    Then I am logged in successfully


  Scenario Outline: Login  with  invalid username and/or invalid  password
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the "<username>" and "<password>"
    And Click on login button
    Then Verify the error message due to invalid username or password
    Examples:
      | username             | password        |
     #Invalid username and valid password
      | daulet203@gmail.com  | TechnoStudy123@ |
     #Invalid username and valid password
      | daulet2030@gmail.com | TechnoStudy123  |
     #Invalid username and password
       | daulet203@gmail.com | TechnoStudy123  |

