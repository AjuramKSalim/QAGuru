package restAssuredSessionBatch25;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class CreateUserPojo extends BaseTest

{
    @Test
    public void createUser(){


    User user1 = new User();
    user1.name = "Mariya";
    user1.job = "Software Engineer";

    User user2 = new User();
    user2.name = "Mariya";
    user2.job = "Software Engineer";

    List<User> users = new ArrayList<>();
     users.add(user1);
     users.add(user2);

    request.basePath("/api/users")
            .body(new File("src/main/resources/Data/user.json"))
            .when()
            .post()
            .then()
            .assertThat()
            .statusCode(200)
            .body("name", IsEqual.equalTo("Mariya"))
            .log()
            .all();

}
}
