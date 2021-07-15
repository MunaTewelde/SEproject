package com.example.demo.repo;

import com.example.demo.entity.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryListDao extends JpaRepository<StudentRegistration,Integer> {
    List<StudentRegistration> findAllByEntryName(String entry);
    List<StudentRegistration> findAllByEntryNameAndAndStartingTrack(String entryName, String startignTrack);
    StudentRegistration findByIdNumber(String id);

}
