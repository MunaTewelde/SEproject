package com.example.demo.repo;

import com.example.demo.entity.FacutlyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyProfileDao extends JpaRepository<FacutlyProfile,Integer> {
    @Override
    void delete(FacutlyProfile entity);
    FacutlyProfile findFacultyProfileByIdNumber(String id);
    FacutlyProfile findFacultyProfileByFirstNameAndLastName(String firstName, String lastName);
    void deleteFacultyProfileByIdNumber(String id);
    void deleteByFirstName(String name);
}
