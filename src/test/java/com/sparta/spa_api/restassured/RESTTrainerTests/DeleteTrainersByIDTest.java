package com.sparta.spa_api.restassured.RESTTrainerTests;

import com.sparta.spa_api.restassured.utils.Config;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;

public class DeleteTrainersByIDTest {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = Config.getBaseUri();
    }

    @Test
    void shouldDeleteTrainerById() {

        RestAssured
                .given()
                .pathParam("id", 1)
                .when()
                .delete(Config.getTrainerById())
                .then()
                .statusCode(anyOf(is(200), is(204)));
    }
}
