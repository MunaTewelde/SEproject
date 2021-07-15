package com.example.demo.controller.AdminController;

import com.example.demo.entity.Entry;
import com.example.demo.service.EntryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EntryController {
    @Autowired
    private EntryManagementService entryManagementService;

    @GetMapping("/getEntryDetailForm")
    public String getForm(){
        return "EntryCreate";
    }

    @PostMapping("/saveEntryDetail")
    public String  saveEntry(Entry entry){
        entryManagementService.saveEntry(entry);
        return "SuccessPage";
    }
    @GetMapping("/getDeleteEntryForm")
    public String delete(){
        return "EntryDelete";
    }

    @PostMapping("/deleteEntryDetail")
    public String deleteDetail(String name){
        System.out.println("inside delete method");
        entryManagementService.deleteEntry(name);
        return "SuccessPage";
    }

    @GetMapping("/getAllEntries")
    public String viewAllEntries(Model model){
        List<Entry> entryList= entryManagementService.getAllEntry();
        model.addAttribute(entryList);
        return "EntryRead";
    }

}
