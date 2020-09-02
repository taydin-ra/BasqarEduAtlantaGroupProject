Feature: Full Employees Feature Test

  Background:
    Given Navigate to Basqar: "https://test.basqar.techno.study/"
    When Enter the username "daulet2030@gmail.com" and password "TechnoStudy123@"
    And Click on loggin button
    Then I am logged in successfully


  Scenario: Successful employee creating in Basqar
    Given I navigate to Employees screen
    When I create employee with following data
      | School            | George Richfield Public school |
      | FirstName         | Sinan                          |
      | LastName          | Genc                           |
      | DateOfBirth       | 10/25/1980                     |
      | Gender            | Male                           |
      | Employee Type     | Teacher                        |
      | EmployeeID        | 12345                          |
      | Employee Position | History teacher                |
      | Citizenship       | Turkey                         |
      | Nationality       | Turkish                        |
      | Document Type     | Personal ID                    |
      | Document Number   | 123456789                      |
      | PersonalID        | 5678                           |
      | Qualififcation    | Master                         |
      | Phone             | 5652731575                     |
      | Email             | newEmpo@gmail.com              |

    Then Employee is successfully created

  Scenario: Successful employee editing in Basqar
    Given I navigate to Employees screen
    When I searched employee with name in the table
      | School     | George Richfield Public school |
      | First Name | Sinan                          |
      | Status     | All                            |

    And I edit employee successfully

      | Employee Type     | Teacher         |

      | Employee Position | History teacher |

    And I changed some things

      | Employee Type     | Other         |

      | Employee Position | IT specialist |
    Then Employee is successfully edited

  Scenario: Successful employee deleting in Basqar
    Given I navigate to Employees screen
    When I searched employee with name in the table
      | School     | George Richfield Public school |
      | First Name | Sinan                          |
      | Status     | All                            |
  And I delete employee successfully

    Then Employee is successfully deleted


