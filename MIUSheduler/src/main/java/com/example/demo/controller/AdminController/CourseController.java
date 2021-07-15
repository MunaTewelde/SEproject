package com.example.demo.controller.AdminController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

//    @GetMapping("/CourseHomePage")
//    public String course(){
//        return "HomePageCourse";
//    }

    @GetMapping("/getSaveCourseForm")
    public String register(){
        System.out.println("in there");
        return "CourseCreate";
    }

    @PostMapping("/saveCourse")
    public String addCourse(Course course ){
        System.out.println("inside post controller");
        Course course1 = courseService.saveCourse(course);
        System.out.println("we added it");
        return "SuccessPage";
    }

    @GetMapping("/getAllCourses")
    public String  getAllCourses(Model model){
        List<Course> courseList = courseService.getAllCourses();
        model.addAttribute(courseList);
        return "CourseRead";
    }

    @GetMapping("/getDeleteCourseForm")
    public String delete(){
        return "CourseDelete";
    }

    @PostMapping("/deleteCourseByCourseCode")
    public String deleteCourseByCourseCode(String code){
        courseService.deleteCourseByCode(code);
        return "SuccessPage";
    }

//    @PostMapping("/addCourses")
//    public List<Course> addCourse(@RequestBody List<Course> courseList){
//        return courseService.saveAllCourses(courseList);
//    }
//    @GetMapping("/getCourseByCourseCode/{code}")
//    public Course getStudentById(@PathVariable String code){
//        return courseService.getCourseByCourseCode(code);
//    }
//    @GetMapping("/getCourseByName/{name}")
//    public Course getStudentByName(@PathVariable String name){
//        return courseService.getCoursesByName(name);
//    }
//
//
//    @DeleteMapping("/deleteCourseByName/{name}")
//    public String deleteCourseByName(@PathVariable String name){
//        return courseService.deleteByCourseName(name);
//    }
//    @PutMapping("/updateCourse")
//    public Course updateCourse(@RequestBody Course course){
//        return courseService.updateCourse(course);
//    }
}
