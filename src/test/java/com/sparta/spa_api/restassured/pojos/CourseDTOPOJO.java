package com.sparta.spa_api.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseDTOPOJO{

	@JsonProperty("courseName")
	private String courseName;

	@JsonProperty("id")
	private int id;

	public String getCourseName(){
		return courseName;
	}

	public int getId(){
		return id;
	}
}