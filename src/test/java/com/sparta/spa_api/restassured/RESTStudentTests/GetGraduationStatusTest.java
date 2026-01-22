package com.sparta.spa_api.restassured.RESTStudentTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class GetGraduationStatusTest {

    @Test
    void getGraduationStatus_shouldReturn200() {
        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .when()
                .get("/student/1/graduated")
                .then()
                .statusCode(200);
    }
}
