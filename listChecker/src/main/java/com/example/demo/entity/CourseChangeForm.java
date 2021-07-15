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
public class CourseChangeForm {
    @Id
    @GeneratedValue
    private int id;
    private String studentId;
    private String firstName;
    private String lastName;
    private String blockName;
    private String dropCourseCode;
    private String addCourseCode;
}
