package com.sparta.spa_api.restassured.RESTCourseTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class DeleteCourseTest {

    @Test
    void deleteCourse_shouldReturn204() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .delete("/courses/1")
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }
}
