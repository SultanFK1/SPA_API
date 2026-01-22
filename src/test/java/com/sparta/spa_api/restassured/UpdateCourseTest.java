package com.sparta.spa_api.restassured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class UpdateCourseTest {

    @Test
    void updateCourse_shouldReturn200() {
        String body = """
                {
                  "courseName": "UpdatedCourse12"
                }
                """;

        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put("/courses/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("courseName", equalTo("UpdatedCourse12"));
    }
}
