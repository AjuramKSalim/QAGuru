package restAssuredSessionBatch25;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;


public class CreateUser

{
    @Test
    public void createUser(){
        String base_url = "https://regres.in";
        String base_path= "/api/users";

    RequestSpecification reqSpec = new RequestSpecBuilder()
            .log(LogDetail.ALL)
            .setBaseUri(base_url)
            .setBasePath(base_path)
            .setContentType(ContentType.JSON)
            .build();

    RestAssured.given()
            .spec(reqSpec)
            .body("{\n" +
                    "    \"name\": \"Surya\",\n" +
                    "    \"job\": \"leader\"\n" +
                    "}")
            .when()
            .post()
            .then()
            .assertThat()
            .statusCode(200)
            .body("name", IsEqual.equalTo("Surya"))
            .log()
            .all();

}
}
