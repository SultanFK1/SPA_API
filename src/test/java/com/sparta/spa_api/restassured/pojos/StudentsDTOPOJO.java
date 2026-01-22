package com.sparta.spa_api.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentsDTOPOJO {

	@JsonProperty("student_name")
	private String studentName;

	@JsonProperty("course")
	private String course;

	@JsonProperty("id")
	private int id;

	@JsonProperty("hasGraduated")
	private boolean hasGraduated;

	public String getStudentName(){
		return studentName;
	}

	public String getCourse(){
		return course;
	}

	public int getId(){
		return id;
	}

	public boolean isHasGraduated(){
		return hasGraduated;
	}
}