package com.sparta.spa_api.restassured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class SearchCourseTest {

    @Test
    void searchCourses_shouldReturn200() {

        RestAssured
                .given()
                .baseUri("http://localhost")
                .port(8091)
                .queryParam("name", "Automation")
                .when()
                .get("/courses/search")
                .then()
                .log().all()
                .statusCode(200)
                .body("$", not(empty()))
                .body("[0].id", notNullValue())
                .body("[0].courseName", containsStringIgnoringCase("automation"));
    }
}
