package com.sparta.spa_api.restassured.RESTCourseTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetAllCoursesTest {

    @Test
    void getAllCourses_shouldReturn200() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .get("/courses")
                .then()
                .log().all()
                .statusCode(200)
                .body("$", not(empty()));
    }
}
