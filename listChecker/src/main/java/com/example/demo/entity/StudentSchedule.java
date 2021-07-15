package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class StudentSchedule {
    private String studentId;
    private String blockName;
    private String courseCode;
    private String sectionName;
    private String facultyName;

    @Override
    public String toString() {
        return "StudentSchedule{" +
                "studentId='" + studentId + '\'' +
                ", blockName='" + blockName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }
}
