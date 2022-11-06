package restAssuredSessionBatch25;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class CreatePet {
   @Test
    public void createPet(){
       RestAssured
               .given()
               .baseUri("https://petstore.swagger.io")
               .basePath("/v2/pet")
               .contentType(ContentType.JSON)
               .auth()
               .basic("maria","maria123")
               .log()
               .headers()
               .body("{\n" +
                       "  \"id\": 9223372036854776000,\n" +
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
                       "      \"name\": \"husky\"\n" +
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
