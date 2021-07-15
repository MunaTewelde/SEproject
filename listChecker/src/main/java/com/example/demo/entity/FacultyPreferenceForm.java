package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FacultyPreferenceForm {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String facultyId;
    private String desiredBlock;
    private String desiredCourse;
    private String extraNote;

}
