package com.herokuapp.verify;


import com.herokuapp.model.StudentPojo;
import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class CreateBookingIdTest extends TestBase {


    @Test
    public void getGetBookingIds() {
        StudentPojo studentPojo = new StudentPojo();

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(studentPojo)
                .when()
                .post("/{/booking}");
        response.prettyPrint();
        response.then().statusCode(200);

    }



}
