package com.example.demo.repo;

import com.example.demo.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stdRepo extends JpaRepository<student,Integer> {

}
