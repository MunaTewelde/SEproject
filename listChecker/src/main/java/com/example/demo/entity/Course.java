package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String courseName;
    private String courseCode;
    private String courseDescription;


    public Course(String courseName, String courseCode, String courseDescription) {
        this.courseName = courseName;
        this.courseCode= courseCode;
        this.courseDescription = courseDescription;

    }
}
