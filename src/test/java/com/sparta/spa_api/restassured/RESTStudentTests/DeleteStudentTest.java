package com.sparta.spa_api.restassured.RESTStudentTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class DeleteStudentTest {

    @Test
    void deleteStudent_shouldReturn200or204() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .delete("/student/1")
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }
}
