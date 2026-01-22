package com.sparta.spa_api.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrainersItem{

	@JsonProperty("course")
	private String course;

	@JsonProperty("id")
	private int id;

	@JsonProperty("trainer_name")
	private String trainerName;

	public String getCourse(){
		return course;
	}

	public int getId(){
		return id;
	}

	public String getTrainerName(){
		return trainerName;
	}
}