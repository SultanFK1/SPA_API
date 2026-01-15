package com.sparta.spa_api;

import com.sparta.spa_api.dtos.CourseDTO;
import com.sparta.spa_api.dtos.CourseMapper;
import com.sparta.spa_api.entities.Course;
import com.sparta.spa_api.repository.CourseRepository;
import com.sparta.spa_api.services.CourseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.NoSuchElementException;
import java.util.Optional;

public class CourseTests {
    private final CourseRepository mockRepository = Mockito.mock(CourseRepository.class);

    private final CourseMapper mockMapper = Mockito.mock(CourseMapper.class);

    private final CourseService sut = new CourseService(mockRepository, mockMapper);


    @Test
    @DisplayName("Ensure CourseService is constructed correctly")
    void constructServiceTest() {
        Assertions.assertInstanceOf(CourseService.class, sut);
    }

    // User Story 3.4
    @Test
    @DisplayName("Course information can be updated")
    void updateCourseHappyPathTest() {

        Course course = new Course("Old Course Name");
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setCourse_name("New Course Name");

        Mockito.when(mockRepository.findById(1)).thenReturn(Optional.of(course));
        Mockito.when(mockRepository.save(course)).thenReturn(course);
        Mockito.when(mockMapper.toDTO(course)).thenReturn(courseDTO);

        CourseDTO updatedCourse = sut.updateCourse(1, courseDTO);

        Assertions.assertNotNull(updatedCourse);
        Assertions.assertEquals("New Course Name", updatedCourse.getCourse_name());
    }

    @Test
    @DisplayName("Update course unhappy path - course not found")
    void updateCourseUnhappyPathTest() {

        Mockito.when(mockRepository.findById(1)).thenReturn(Optional.empty());

        Assertions.assertThrows(NoSuchElementException.class, () -> sut.updateCourse(1, new CourseDTO()));
    }
}
