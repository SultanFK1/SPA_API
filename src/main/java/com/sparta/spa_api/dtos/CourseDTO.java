package com.sparta.spa_api.dtos;

import com.sparta.spa_api.entities.Student;
import com.sparta.spa_api.entities.Trainers;

import java.util.List;

public class CourseDTO {
    private Integer course_id;
    private String course_name;
    private List<Student> course1Students;
    private List<Trainers> course1Trainers;

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public List<Student> getCourse1Students() {
        return course1Students;
    }

    public void setCourse1Students(List<Student> course1Students) {
        this.course1Students = course1Students;
    }

    public List<Trainers> getCourse1Trainers() {
        return course1Trainers;
    }

    public void setCourse1Trainers(List<Trainers> course1Trainers) {
        this.course1Trainers = course1Trainers;
    }



}

