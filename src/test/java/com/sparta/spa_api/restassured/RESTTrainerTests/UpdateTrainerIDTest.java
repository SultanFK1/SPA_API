package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class UpdateTrainerIDTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    @Test
    void shouldUpdateTrainerById() {

        String requestBody = """
                {
                  "id": 1,
                  "trainer_name": "Updated Trainer Name 5"
                }
                """;

        RestAssured
                .given()
                .contentType("application/json")
                .accept("application/json")
                .pathParam("id", 1)
                .body(requestBody)
                .when()
                .put(Config.getTrainerById())
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("trainer_name", equalTo("Updated Trainer Name 5"))
                .body("_links", notNullValue());
    }
}
