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
public class Block {
    @Id
    @GeneratedValue
    private long id;
    private String blockName;
    private String sectionName;
    private String courseCode;
    private String courseName;
    private String facultyName;

    public Block(String blockName, String courseCode, String courseName) {
        this.blockName = blockName;
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
}
