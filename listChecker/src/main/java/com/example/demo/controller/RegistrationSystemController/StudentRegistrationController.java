package com.example.demo.controller.RegistrationSystemController;

import com.example.demo.entity.StudentRegistration;
import com.example.demo.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentRegistrationController {
    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @GetMapping("/getStudentRegistrationForm")
    public String getRegistrationForm(){
        return "StudentRegistrationForm";
    }
    @PostMapping("/apply")
    public String saveRegistrationForm(StudentRegistration studentRegistration){
        System.out.println("inside contorller up");
//        StudentRegistration s =
                studentRegistrationService.saveRegistration(studentRegistration);
        System.out.println("inside controller down");
        return "SuccessPage";
    }
}
