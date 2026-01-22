package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class UpdateTrainerNameTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    @Test
    void shouldUpdateTrainerName() {

        String requestBody ="Updated Trainer Name 5";

        RestAssured
                .given()
                .contentType("application/json")
                .pathParam("id", 1)
                .body(requestBody)
                .when()
                .put(Config.getTrainerUpdateName())
                .then()
                .statusCode(201)
                .body("trainer_name", equalTo("Updated Trainer Name 5"));
    }
}
