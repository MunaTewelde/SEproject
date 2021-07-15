package edu.miu.cs.cs425.project.miushcduler.service;

import edu.miu.cs.cs425.project.miushcduler.model.Course;

import java.util.List;

public interface CourseService {
    public abstract List<Course> getListOfCourses();
    public abstract Course addNewCourse(Course course);
}
