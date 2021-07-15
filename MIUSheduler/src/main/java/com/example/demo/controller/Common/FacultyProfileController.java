package com.example.demo.controller.Common;

import com.example.demo.entity.FacultyPreferenceForm;
import com.example.demo.entity.FacutlyProfile;
import com.example.demo.service.FacultyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FacultyProfileController {
    @Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/getFacultyDashBoard")
    public String dashBoard(){
        return "FacultyDashBoard";
    }

    @GetMapping("/getFacultyProfileManage")
    public String facultyCRUD(){
        return "FacultyCRUD";
    }

    @GetMapping("/getFacultyProfileForm")
    public String getFacultyForm(){
        return "FacultyProfile";
    }

    @PostMapping("/saveFacultyProfile")
    public String saveFacutlyProfile(FacutlyProfile facutlyProfile){
        facultyProfileService.saveFacultyProfile(facutlyProfile);
        return "SuccessPage";
    }

    @GetMapping("/viewFacultyProfileByNameForm")
    public String getFacultyProfile(){
        return "FacultyRead";
    }

    @PostMapping("/viewFacultyProfileByFullName")
    public String getFacultyProfileById(String firstName, String lastName, Model model){
        FacutlyProfile faculty = facultyProfileService.getFacultyProfileByName(firstName,lastName);
        model.addAttribute(faculty);
        return "FacultyProfileView" ;
    }

    @GetMapping("/deleteFacultyProfileForm")
    public String deleteFacultyForm(){
        return "FacultyProfileDelete";
    }

    @PostMapping("/deleteFacultyProfile")
    public String deleteFacutlyProfile(String idNumber){
        facultyProfileService.deleteFacultyById(idNumber);
        return "SuccessPage";
    }

    @GetMapping("/viewFacultyScheduleForm")
    public String viewFacultyScheduleF(){
//        view schedule id form
        return "FacultySchduleViewForm";
    }

    @PostMapping("/viewFacultySchedule")
    public String viewFacultySchedule(String idNumber, Model model){
        List<FacultyPreferenceForm> output = facultyProfileService.viewFacultySchedule(idNumber);
        model.addAttribute(output);
        return "FacultyPreferenceView";
    }

    @GetMapping("/preferenceForm")
    public String facultyPreference(){
        return "FacultyPreferenceForm";
    }

    @PostMapping("/savePreference")
    public String savePreference(FacultyPreferenceForm facultyPreferenceForm){
        facultyProfileService.saveFacultypreference(facultyPreferenceForm);
        return "SuccessPage";
    }




}
