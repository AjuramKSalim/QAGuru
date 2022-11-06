package apiAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest

{

    RequestSpecification request;

    @BeforeClass
    public void setup(){
        RestAssured.baseURI= "http://localhost:8090/";
        request = RestAssured.given();
        request.header("Content-Type","application/json");

    }

    @AfterClass
    public void teardown(){

    }
}
