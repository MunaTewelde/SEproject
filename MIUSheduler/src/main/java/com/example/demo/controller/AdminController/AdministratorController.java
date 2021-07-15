package com.example.demo.controller.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministratorController {

    @GetMapping("/adminDashBoard")
    public String getAdminDashBoard(){
        return "AdminDashBoard";
    }

    @GetMapping("/courseDashBoard")
    public String getCourseDashBoard(){
        return "/coursesCRUD";
    }

    @GetMapping("/blockDashBoard")
    public String getBlockDashBoard(){
        return "/blocksCRUD";
    }

    @GetMapping("/annualScheduleDashBoard")
    public String manageSchedule(){
        return "/annualSchedule";
    }
    @GetMapping("/entryDashBoard")
    public String getEntryDashBoard(){
        return "/entryCRUD";
    }
    @GetMapping("/facultyProfileCrud")
    public String profileCrud(){
        return "/ProfileCrud";
    }
    @GetMapping("/userAccountCRUD")
    public String createAccount(){
        return "userAccountCRUD";
    }
}
