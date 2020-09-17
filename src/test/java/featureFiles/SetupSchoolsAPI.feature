Feature:Testing API functionality of Schools Admin page

  Background: Login to Basqar with API and get the cookie
    Given Set the base URI of Basqar: "https://test.basqar.techno.study"
    And Set the path of login page: "/auth/login"
    When Set the credentials "daulet2030@gmail.com" and password "TechnoStudy123@"
    Then Login page and get the cookie

  Scenario: Getting the list of schools
    When Set the path of Schools page: "/school-service/api/schools/search"
    When Connect to server with POST and get the list of Schools
    Then Print the list of schools

  Scenario: Crating new school with API
    Given Set the path of Schools page: "/school-service/api/schools"
    Then I will fill the School POJO class with given data
      | Istanbul High School |
      | DHS                  |
      | mask 2               |
      | USD                  |
      | GMT                  |
      | en                   |
      | Burasi Cikmaz Sokak  |
      | United States of America |
      | Clifton              |
      | 30009                |
    When I POST the POJO class and Check if Status Code is 201
    Then Check if the School was created

  Scenario: Editing a School
    Given Set the path of Schools page: "/school-service/api/schools"
    Then I will edit the School POJO class with given data
      | ErzincanCCCC High School |
      | EHS                  |
    And I POST the new POJO class and Check if Status Code is 200
    Then Check if the School name has changed

  Scenario: Deleting a school
    Given I will DELETE with first school from the list with API
    Then Check if the School name was deleted