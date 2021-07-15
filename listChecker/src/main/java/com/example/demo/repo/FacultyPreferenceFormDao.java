package com.example.demo.repo;

import com.example.demo.entity.FacultyPreferenceForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyPreferenceFormDao extends JpaRepository<FacultyPreferenceForm, Integer> {
    List<FacultyPreferenceForm> findAllByFacultyId(String id);
}
