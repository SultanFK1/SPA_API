package com.sparta.spa_api.restassured.utils;

public class APIConfig {

    private static final String BASE_URI = Config.getBaseUri();

    private static final String ALL_COURSERS = Config.getAllCourses();
    private static final String COURSE_BY_ID = Config.getCourseById();
    private static final String COURSE_SEARCH = Config.getCourseSearch();

    private static final String ALL_TRAINERS = Config.getAllTrainers();
    private static final String TRAINER_BY_ID = Config.getTrainerById();
    private static final String TRAINER_UPDATE_NAME = Config.getTrainerUpdateName();
    private static final String TRAINER_SET_COURSE_NAME = Config.getTrainerSetCourseName();
    private static final String TRAINER_COURSES_BY_TRAINER = Config.getTrainerCoursesByTrainer();

    private static final String ALL_STUDENTS = Config.getAllStudents();
    private static final String STUDENT_BY_ID = Config.getStudentById();
    private static final String STUDENT_GRADUATED = Config.getStudentGraduated();


}
