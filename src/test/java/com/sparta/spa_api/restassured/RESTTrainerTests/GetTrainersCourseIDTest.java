package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetTrainersCourseIDTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    //DOES NOT RUN AS EXPECTED STATUS 500.
    @Test
    void shouldReturnCourseForTrainer() {

        RestAssured
                .given()
                .accept("application/json")
                .pathParam("id", 1)
                .when()
                .get(Config.getTrainerCoursesByTrainer())
                .then()
                .statusCode(200)
                .body("id", notNullValue())
                .body("courseName", notNullValue());
    }
}
