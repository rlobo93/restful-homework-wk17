package com.herokuapp.verify;




import com.herokuapp.testbase.TestBase;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GetBookingIdTest extends TestBase {

    @Test
    public void getAllBookingId(){
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }




}
