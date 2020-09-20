package restAssured;

import PojoFiles.Budget;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BudgetTest {
    @Test

    public void BudgetTest() {
        Budget budget=new Budget();
        budget.setActive(true);
        budget.setStatus("STARTED");
        budget.setDescription("desc");
        budget.setEnterEndDate("2020-09-22T00:00:00.000Z");
        budget.setEnterStartDate("2020-09-20T00:00:00.000Z");

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
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(budget)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/budget-groups")
                .then()
                .log().body()
                .statusCode(201);
    }

}
