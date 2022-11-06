package apiAutomation;

import  io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetUserDetailsTest {

    @Test
    public void getUserData(){
        String base_url = "https://reqres.in";
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setBaseUri(base_url)
                .setBasePath("/api/users/2")
                .setContentType(ContentType.JSON)
                .build();

        RestAssured.given()
                .spec(requestSpecification)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();
    }
}
