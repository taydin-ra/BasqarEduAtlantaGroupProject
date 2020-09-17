package stepDefinition;


import PojoFiles.Schools.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.baseURI;


public class SetupSchoolsAPISteps {
    public Cookies cookies;
    public String path;
    Map<String, String> credentials = new HashMap<>();
    public List<String> schoolList;
    School school = new School();
    private RequestSpecification requestSpec;
    public String sid;

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
                        .then().log().status()
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
        TranslateName translateName1 = new TranslateName();

        List<TranslateName> translateNameList = new ArrayList<>();
        translateName1.setData("United States of America");
        translateName1.setDefaultLang(false);
        translateName1.setLang("en");
        translateNameList.add(0, translateName1);

        TranslateName translateName2 = new TranslateName();
        translateName2.setData("Америка Құрама Штаттары");
        translateName2.setDefaultLang(false);
        translateName2.setLang("kk");
        translateNameList.add(1, translateName2);

        TranslateName translateName3 = new TranslateName();
        translateName3.setData("Соединенные Штаты Америки");
        translateName3.setDefaultLang(false);
        translateName3.setLang("ru");
        translateNameList.add(2, translateName3);

        school.setName(list.get(0));
        school.setShortName(list.get(1));


        Address address = new Address();
        City city = new City();
        Country country = new Country();
        city.setId("5e59478cf09c4b6e92379ba0");
        city.setName(list.get(8));
        country.setId("5baac28d91cefe05fc6e3fe6");
        country.setName(list.get(7));
        country.setCode("US");
        country.setTranslateName(translateNameList);
        address.setCity(city);
        address.setCountry(country);
        address.setPostalCode(list.get(9));
        address.setStreet(list.get(6));
        address.setCountry(country);
        school.setAddress(address);

        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail("");
        contactInfo.setFax("");
        contactInfo.setPhone("");
        contactInfo.setWeb("");
        school.setContactInfo(contactInfo);

        school.setActive(true);
        school.setTimeZone(list.get(4));
        school.setCurrency(list.get(3));
        school.setPhoneMask(list.get(2));
        school.setLanguage(list.get(5));
    }

    @When("^I POST the POJO class and Check if Status Code is (\\d+)$")
    public void iPOSTThePOJOClassAndCheckIfStatusCodeIs(int statusCode) {
        sid = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(school)
                .when()
                .post(path)                //"/school-service/api/schools"
                .then().statusCode(statusCode)
                .extract().response().jsonPath().getString("id");
        ;
    }

    @Then("^Check if the School was created$")
    public void check_if_the_School_was_created() {
        path = "/school-service/api/schools/search";

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body("{}")
                .when()
                .post(path)
                .then()
                .statusCode(200)
                .body("name[0]", equalTo(school.getName()))
        ;
    }

    @Then("^I will edit the School POJO class with given data$")
    public void i_will_edit_the_School_POJO_class_with_given_data(DataTable table) {
        List<String> list = table.asList(String.class);

        school.setName(list.get(0));
        school.setShortName(list.get(1));
        school.setPhoneMask("mask1");
        school.setLanguage("en");
    }


    @And("^I POST the new POJO class and Check if Status Code is (\\d+)$")
    public void iPOSTTheNewPOJOClassAndCheckIfStatusCodeIs(int statusCode) {
        sid =          // get the school id
                given()
                        .cookies(cookies)
                        .contentType(ContentType.JSON)
                        .body("{}")
                        .when()
                        .post("/school-service/api/schools/search")
                        .then().log().status().statusCode(statusCode)
                        .extract().response()
                        .jsonPath().getString("id[0]");
        school.setId(sid);     //set the school id

        given()     //edit the school info
                // specify Authorization header, body, Content-Type header
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(school)
                .when()
                .put("/school-service/api/schools")
                .then().log().status().statusCode(statusCode)
                .body("name", equalTo(school.getName()))
        ;

    }

    @Then("^Check if the School name has changed$")
    public void check_if_the_School_name_has_changed() {
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body("{}")
                .when()
                .post("/school-service/api/schools/search")
                .then()
                .statusCode(200)
                .body("name[0]", equalTo(school.getName()))
        ;
    }


    @Given("^I will DELETE with first school from the list with API$")
    public void iWillDELETEWithFirstSchoolFromTheListWithAPI() {
        sid =  given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body("{}")
                .when()
                .post("/school-service/api/schools/search")
                .then().statusCode(200)
                .extract().response()
                .jsonPath().getString("id[0]");

        path = "/school-service/api/schools/" + sid;
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete(path)
                .then().log().status() .statusCode(200)       //.statusCode(200)
        ;
    }

    @Then("^Check if the School name was deleted$")
    public void check_if_the_School_name_was_deleted() {
    }


}
