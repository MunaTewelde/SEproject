package com.example.demo.controller.AdminController;

import com.example.demo.service.EntryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntryManagementController {
    @Autowired
    private EntryManagementService entryManagementService;

    @Autowired
    private com.example.demo.service.scheduleGenerator scheduleGenerator;

    @GetMapping("/getEntrySectionForm")
    public String generateEntry(){
        return "SectionCreate";
    }

    @PostMapping("/generateSection")
    public String generateSectoin(Integer studentPerClass, String name){
        entryManagementService.generate(studentPerClass, name);
        return "SuccessPage";
    }

    @GetMapping("/getEntryScheduleFrom")
    public String generateSchedule(){
        return "ScheduleCreate";
    }

    @PostMapping("/scheduleGenerator")
    public String generator(String name){
        scheduleGenerator.generator(name);
        return "SuccessPage";
    }

}
