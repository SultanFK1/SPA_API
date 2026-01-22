package com.sparta.spa_api.restassured.utils;

public class APIConfig {

    public static final String BASE_URI = Config.getBaseUri();

    public static final String ALL_COURSERS = Config.getAllCourses();
    public static final String COURSE_BY_ID = Config.getCourseById();
    public static final String COURSE_SEARCH = Config.getCourseSearch();

    public static final String ALL_TRAINERS = Config.getAllTrainers();
    public static final String TRAINER_BY_ID = Config.getTrainerById();
    public static final String TRAINER_UPDATE_NAME = Config.getTrainerUpdateName();
    public static final String TRAINER_SET_COURSE_NAME = Config.getTrainerSetCourseName();
    public static final String TRAINER_COURSES_BY_TRAINER = Config.getTrainerCoursesByTrainer();

    public static final String ALL_STUDENTS = Config.getAllStudents();
    public static final String STUDENT_BY_ID = Config.getStudentById();
    public static final String STUDENT_GRADUATED = Config.getStudentGraduated();


}
