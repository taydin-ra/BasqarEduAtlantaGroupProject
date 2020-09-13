package restAssured;

import PojoFiles.FeesType;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Fees {
//    private Cookies cookies;
//
//    private String feesTypeId;
//    FeesType feesType = new FeesType();


    @Test
    public void loginBasqar() {
        Map<String, String> login = new HashMap<>();
        login.put("username", "daulet2030@gmail.com");
        login.put("password", "TechnoStudy123@");

        Cookies cookies = given().
                contentType(ContentType.JSON)
                .body(login)
                .log().body()
                .when()
                .post("https://test.basqar.techno.study/auth/login")
                .then()
                .log().body()
                .statusCode(200)
                .extract().response().getDetailedCookies();

        FeesType feesType = new FeesType();
        feesType.setName("Merve");
        feesType.setCode("Bio101");
        feesType.setBudgetAccountIntegrationCode(2020101);
        feesType.setPriority(4);
        feesType.setActive(true);

       String feeId = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(feesType)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/fee-types")
                .then()
                .log().body()
                .statusCode(201)
               .extract().jsonPath().getString("id");

        // search my fee

        int searchItem = feesType.getPriority();

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(searchItem)
                .when()
                .put("https://test.basqar.techno.study/school-service/api/fee-types/search")
                .then()
                .log().body()
                .statusCode(200);

//        // edit my fee
//
//feesType.setBudgetAccountIntegrationCode(2020105);
//
//        given()
//                .cookies(cookies)
//                .contentType(ContentType.JSON)
//                .body(feesType)
//                .when()
//                .put("https://test.basqar.techno.study/school-service/api/fee-types")
//                .then()
//                .log().body()
//                .statusCode(200);

        // Delete the fee

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete("https://test.basqar.techno.study/school-service/api/fee-types/" + feeId)
                .then()
                .statusCode(200);


    }

//    @Test(priority = 0)
//
//    public void createAFeeType() {
//        feesType.setName("Merve");
//        feesType.setCode("Bio101");
//        feesType.setIntegrationCode("2020101");
//        feesType.setPriority(4);
//        feesType.setActive(true);
//
//        feesTypeId = given()
//                .cookies(cookies)
//                .contentType(ContentType.JSON)
//                .body(feesType)
//                .when()
//                .post("https://test.basqar.techno.study/school-service/api/fee-types")
//                .then()
//                .statusCode(201)
//                .log().body()
//                .extract().path("id");
//    }


}
