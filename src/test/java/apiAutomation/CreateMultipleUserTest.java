package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.IsEqual;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateMultipleUserTest extends BaseTest{

    @Test
    public void createUSer() {
        String base_url = "https://reqres.in";
        String base_path = "/api/users";
        RequestSpecification requestSpec = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setBaseUri(base_url)
                .setBasePath(base_path)
                .setContentType(ContentType.JSON)
                .build();

//        User user1 = new User();
//        user1.name = "Amal";
//        user1.job = "Software Engineer";
//
//        User user2 = new User();
//        user2.name = "Manu";
//        user2.job = "Senior Software Engineer";
//
//        List<User> users = new ArrayList<User>();
//        users.add(user1);
//        users.add(user2);

//        for (User user : users) {
           String  body = request
                    .spec(requestSpec)
                    .body(new File("src/main/resources/Data/user.json"))
                    .when()
                    .post()
                    .then()
                    .assertThat()
                    .statusCode(201)
                    .body("name", IsEqual.equalTo("Jemsy"))
                    .log()
                    .all()
                    .extract().body().asString();

//        }
    }
}
