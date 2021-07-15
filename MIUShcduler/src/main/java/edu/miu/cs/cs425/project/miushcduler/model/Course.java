package edu.miu.cs.cs425.project.miushcduler.model;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseNumber;
    private String courseName;

    private Course prerequisite;
    private List<Faculty> faculties;
    private List<Student> students;



}
