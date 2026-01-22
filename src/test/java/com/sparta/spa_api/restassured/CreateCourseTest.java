package com.sparta.spa_api.restassured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class CreateCourseTest {

    @Test
    void createCourse_shouldReturn201() {
        String body = """
                {
                  "courseName": "NewCourse88"
                }
                """;

        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/courses")
                .then()
                .log().all()
                .statusCode(anyOf(is(200), is(201)))
                .body("id", greaterThan(0))
                .body("courseName", equalTo("NewCourse88"));
    }
}
