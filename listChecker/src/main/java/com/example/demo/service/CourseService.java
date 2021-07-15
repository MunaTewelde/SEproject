package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repo.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;


    public Course saveCourse(Course course){
        return courseDao.save(course);
    }

    public List<Course> saveAllCourses(List<Course> courseList){
        return courseDao.saveAll(courseList);
    }
    public Course getCourseByCourseCode(String code){
        return courseDao.findByCourseCode(code);
    }
    public Course getCoursesByName(String name){
        return courseDao.findByCourseName(name);
    }

    public List<Course> getAllCourses(){
        return courseDao.findAll();
    }
    public void deleteCourseByCode(String  code){
        Course a= courseDao.findByCourseCode(code);
        courseDao.delete(a);
//        return "Course with code = " + code + " deleted successfully";
    }
    public String deleteByCourseName(String name){
        courseDao.deleteByCourseName(name);
        return "Course with name = " + name + " deleted successfully";
    }

    public Course updateCourse(Course course){
        Course course1 = getCourseByCourseCode(course.getCourseCode());
        course1.setCourseName(course.getCourseName());
        course1.setCourseDescription(course.getCourseDescription());
        return courseDao.save(course1);
    }
}
