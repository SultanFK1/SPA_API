package com.sparta.spa_api.restassured.RESTCourseTests;



import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetCourseByIdTest {

    @Test
    void getCourseById_shouldReturn200() {

        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .get("/courses/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("courseName", notNullValue());
    }
}
