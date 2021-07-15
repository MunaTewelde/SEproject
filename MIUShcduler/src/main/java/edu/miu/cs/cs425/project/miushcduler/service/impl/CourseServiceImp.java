package edu.miu.cs.cs425.project.miushcduler.service.impl;

import edu.miu.cs.cs425.project.miushcduler.model.Course;
import edu.miu.cs.cs425.project.miushcduler.repository.CourseRepository;
import edu.miu.cs.cs425.project.miushcduler.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImp implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getListOfCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addNewCourse(Course course) {
        return courseRepository.save(course);
    }
}
