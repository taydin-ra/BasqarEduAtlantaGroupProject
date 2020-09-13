package stepDefinition;


import PojoFiles.Schools.Address;
import PojoFiles.Schools.City;
import PojoFiles.Schools.Country;
import PojoFiles.Schools.School;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;


public class SetupSchoolsAPISteps {
    public Cookies cookies;
    String path;
    Map<String, String> credentials = new HashMap<>();
    private List<String> schoolList;
    School school = new School();

    @Given("^Set the base URI of Basqar: \"([^\"]*)\"$")
    public void set_the_base_URI_of_Basqar(String uri) {
        baseURI = uri;
    }

    @Given("^Set the path of login page: \"([^\"]*)\"$")
    public void set_the_path_of_login_page(String path) {
        this.path = path;
    }

    @When("^Set the credentials \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void set_the_credentials_and_password(String userName, String passwd) {

        credentials.put("username", userName);
        credentials.put("password", passwd);

    }

    @Then("^Login page and get the cookie$")
    public void login_page_and_get_the_cookie() {

        cookies = given()
                .contentType(ContentType.JSON)
                .body(credentials)
                .when()
                .post(path)
                .then()
                .statusCode(200)
                .extract().response().detailedCookies();
    }

    @When("^Set the path of Schools page: \"([^\"]*)\"$")
    public void set_the_path_of_Schools_page(String path) {
        this.path = path;
    }

    @When("^Connect to server with POST and get the list of Schools$")
    public void connect_to_server_with_POST_and_get_the_list_of_Schools() {

        schoolList =
                given()
                        .cookies(cookies)
                        .contentType(ContentType.JSON)
                        .body("{}")
                        .when()
                        .post(path)
                        .then().statusCode(200)
                        .extract().response()
                        .jsonPath().getList("name", String.class);
    }

    @Then("^Print the list of schools$")
    public void print_the_list_of_schools() {
        for (String s : schoolList) {
            System.out.println(s);
        }
    }

    @Then("^I will fill the School POJO class with given data$")
    public void i_will_fill_the_School_POJO_class_with_given_data(DataTable table) {
        List<String> list = table.asList(String.class);

        school.setId(null);
        school.setName(list.get(0));
        school.setShortName("hg");
        school.setActive(true);
        Address address = new Address();
        City city = new City();
        Country country = new Country();
        city.setId("5e59478cf09c4b6e92379ba0");
        country.setId("5e59478cf09c4b6e92379ba0");
        address.setCity(city);
        address.setCountry(country);
        address.setPostalCode("30098");
        address.setStreet("hjgjhj gjhg j hgjh g");
        school.setTimeZone("GMT");
        school.setCurrency("USD");
        school.setPhoneMask("mask1");
        school.setLanguage("en");
//        school.setBBBServerEnabled(false);
    }

    @When("^I POST the POJO class$")
    public void i_POST_the_POJO_clas() {
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(school)
                .when()
                .post("/school-service/api/schools")
                .then().statusCode(201)
        ;

    }

    @When("^I should get Satatus Code (\\d+)$")
    public void i_should_get_Satatus_Code(int arg1) {
    }

    @Then("^Check if the School was created$")
    public void check_if_the_School_was_created() {
    }

    @Then("^I will edit the School POJO class with given data$")
    public void i_will_edit_the_School_POJO_class_with_given_data(DataTable arg1) {
    }

    @Then("^I should get Satus code (\\d+)$")
    public void i_should_get_Satus_code(int arg1) {
    }

    @Then("^Check if the School name has changed$")
    public void check_if_the_School_name_has_changed() {
    }

    @Given("^I will get the list of all schools as JSON format by using API$")
    public void i_will_get_the_list_of_all_schools_as_JSON_format_by_using_API() {
    }

    @When("^I select a school from the list$")
    public void i_select_a_school_from_the_list() {
    }

    @Then("^I will DELETE with API$")
    public void i_will_DELETE_with_API() {
    }

    @Then("^Check if the School name was deleted$")
    public void check_if_the_School_name_was_deleted() {
    }

}
