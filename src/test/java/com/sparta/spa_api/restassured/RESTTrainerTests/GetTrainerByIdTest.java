package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class GetTrainerByIdTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    @Test
    void getTrainerById_shouldReturnTrainer() {

        RestAssured
                .given()
                .accept("application/json")
                .pathParam("id", 1)
                .when()
                .get(Config.getTrainerById())
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("trainer_name", notNullValue());
    }
}
