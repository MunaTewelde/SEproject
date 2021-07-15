package com.example.demo.service;

import com.example.demo.entity.student;
import com.example.demo.repo.stdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class stdSrvc {
    @Autowired
    private stdRepo stdRepo;

    public void save(student student){
        student student1= stdRepo.save(student);
        System.out.println("added successfully");
    }

    public Optional<student> viewStudent(int id){
        return stdRepo.findById(id);
    }
}
