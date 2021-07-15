package com.example.demo.controller.StudentController;

import com.example.demo.entity.CourseChangeForm;
import com.example.demo.entity.StudentSchedule;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudentDashBoard")
    public String dashBoard(){
        return "StudentDashBoard";
    }

    @GetMapping("/viewStudentScheduleForm")
    public String viewMySchedule(){
        return "StudentScheduleReadForm";
    }

    @PostMapping("/viewStudentSchedule")
    public String getCourseDashBoard(String id, Model model){
        System.out.println("inside view controller");
        List<StudentSchedule> scheduleList = studentService.viewStudentSchedule(id);

        for(StudentSchedule a: scheduleList){
            System.out.println(a.toString());
        }
        model.addAttribute(scheduleList);
        return "StudentScheduleRead";
    }

    @GetMapping("/requestChangeScheduleForm")
    public String getBlockDashBoard(){
        return "CourseChangeForm";
    }

    @PostMapping("/submitChange")
    public String manageSchedule(CourseChangeForm courseChangeForm){
        studentService.saveCourseChangeRequestForm(courseChangeForm);
        return "SuccessPage";
    }

}
