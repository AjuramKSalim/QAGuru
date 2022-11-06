package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

public class CreateUserTest {

    @Test
    public void createUSer(){
        String base_url = "https://reqres.in";
        String base_path = "/api/users";
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setBaseUri(base_url)
                .setBasePath(base_path)
                .setContentType(ContentType.JSON)
                .build();
       User surya = new User();
       surya.name="Surya";
       surya.job="Software Engineer";
       RestAssured.given()
                .spec(requestSpec)
                .body(surya)
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(201)
                .body("name", IsEqual.equalTo("Surya"))
                .log()
                .all();
    }
}
