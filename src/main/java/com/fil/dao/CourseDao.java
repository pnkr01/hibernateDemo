package com.fil.dao;
import com.fil.model.Course;
import java.util.List;

public interface CourseDao {
    Course findById(int id);
    List<Course> findAllCourses();
    Course save(Course course);
}
