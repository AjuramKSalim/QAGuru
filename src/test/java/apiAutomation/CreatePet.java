package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

public class CreatePet {

    @Test
public void createPet(){
     RestAssured
                .given()
                .baseUri("https://petstore.swagger.io")
                .basePath("/v2/pet/")
                .contentType(ContentType.JSON)
                .auth()
                .basic("maria","maria123")
                .log()
                .headers()
                .body("{\n" +
                        "  \"id\": 3,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"animal\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200)
                .log()
                .all();

    }

}
