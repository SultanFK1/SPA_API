package com.sparta.spa_api.restassured.RESTStudentTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class UpdateStudentTest {

    @Test
    void updateStudent_shouldReturn200() {

        String body = """
                {
                  "student_name": "AnythingHere"
                }
                """;

        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put("/student/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1));   // safest assertion
    }
}

// 500 status api code was given not 200 hence why this will fall