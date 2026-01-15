package com.sparta.spa_api.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Course}
 */
public class CourseDto implements Serializable {
    private final Integer id;
    private final String course_name;

    public CourseDto(Integer id, String course_name) {
        this.id = id;
        this.course_name = course_name;
    }

    public Integer getId() {
        return id;
    }

    public String getCourse_name() {
        return course_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDto entity = (CourseDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.course_name, entity.course_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course_name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "course_name = " + course_name + ")";
    }
}