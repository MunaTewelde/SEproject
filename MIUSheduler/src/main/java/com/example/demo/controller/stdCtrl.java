//package com.example.demo.controller;
//
//import com.example.demo.entity.Course;
//import com.example.demo.entity.student;
//import com.example.demo.service.stdSrvc;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.*;
//
//@Controller
//public class stdCtrl {
//    @Autowired
//    private stdSrvc stdSrvc;
//
//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }
//
//    @GetMapping("/form")
//    public String form(){
//        return "form";
//    }
//
//    @PostMapping("/save")
//    public String save(student student){
//        System.out.println("inside controller");
//        Map<Integer, Course> a = new HashMap<>();
//        a.put(415,new Course("se","cs415"));
//        a.put(510,new Course("mpp", "cs510"));
//        a.put(390,new Course("fpp", "cs390"));
//        a.put(401,new Course("ea", "cs401"));
//
//        student.setList(a);
//        System.out.println(student.toString());
//        stdSrvc.save(student);
//        return "success";
//    }
//    @GetMapping("/view")
//    public String viewStudent(){
//        Optional<student> a = stdSrvc.viewStudent(8);
//        System.out.println(a.toString());
//
//        return "view";
//    }
//}
