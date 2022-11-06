package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class GetAllProducts extends BaseTest {

    @Test
   public void verifyUSerGetAllProducts(){
        request.basePath("api/v1/products")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();
    }

    @Test
    public void verifyUSerGetErrorAllProducts(){
        request.basePath("api/v1/products")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();
    }

}
