package com.sparta.spa_api.restassured.RESTStudentTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetStudentByIdTest {

    @Test
    void getStudentById_shouldReturn200() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .get("/student/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1));
    }
}

