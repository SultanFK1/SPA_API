package com.sparta.spa_api.restassured.RESTStudentTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetAllStudentsTest {

    @Test
    void getAllStudents_shouldReturn200() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .get("/student")
                .then()
                .statusCode(200)
                .body("$", not(empty()))
                .body("[0].id", notNullValue());
    }
}
