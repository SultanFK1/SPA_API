package com.sparta.spa_api.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainerDTOPOJO{

	@JsonProperty("course_id")
	private CourseId courseId;

	@JsonProperty("id")
	private int id;

	@JsonProperty("trainer_name")
	private String trainerName;

	public CourseId getCourseId(){
		return courseId;
	}

	public int getId(){
		return id;
	}

	public String getTrainerName(){
		return trainerName;
	}
}