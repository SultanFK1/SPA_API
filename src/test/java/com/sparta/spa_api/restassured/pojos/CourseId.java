package com.sparta.spa_api.restassured.pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseId{

	@JsonProperty("trainers")
	private List<TrainersItem> trainers;

	@JsonProperty("courseName")
	private String courseName;

	@JsonProperty("students")
	private List<StudentsDTOPOJO> students;

	@JsonProperty("id")
	private int id;

	public List<TrainersItem> getTrainers(){
		return trainers;
	}

	public String getCourseName(){
		return courseName;
	}

	public List<StudentsDTOPOJO> getStudents(){
		return students;
	}

	public int getId(){
		return id;
	}
}