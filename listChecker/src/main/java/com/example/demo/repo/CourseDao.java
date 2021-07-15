package com.example.demo.repo;


import com.example.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Integer> {
    @Override
    void delete(Course entity);

    Course findByCourseCode(String code);
    Course findByCourseName(String name);
    Course deleteByCourseCode(String code);
    void deleteByCourseName(String name);

}
