package restAssuredSessionBatch25;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class GetProducts extends BaseTest {
    @Test
    public void verifyUserGEtAllProducts(){

        RestAssured.given()
                .baseUri("http://localhost:8090")
                .basePath("/api/v1/products")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();


    }


}
