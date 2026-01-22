package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class SetTrainerCourseNameTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    @Test
    void shouldSetCourseNameForTrainer() {

        String requestBody = "Apii Automation";

        RestAssured
                .given()
                .contentType("application/json")
                .accept("application/json")
                .pathParam("id", 2)
                .body(requestBody)
                .when()
                .put(Config.getTrainerSetCourseName())
                .then()
                .statusCode(201)
                .body("courseName", equalTo("Apii Automation"))
                .body("id", notNullValue());
    }
}
