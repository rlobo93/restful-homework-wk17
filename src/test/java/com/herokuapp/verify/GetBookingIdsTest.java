package com.herokuapp.verify;


import com.herokuapp.model.StudentPojo;
import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingIdsTest extends TestBase {


    @Test
    public void getBookingId(){
        Response response = given()
                .when()
                .pathParam("id",1)
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
