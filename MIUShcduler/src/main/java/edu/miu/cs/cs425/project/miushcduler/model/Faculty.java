package edu.miu.cs.cs425.project.miushcduler.model;

import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyId;
    private String facultyNumber;
    private String name;
    private String email;
    private Course course;
//    private List<Student> students;



}
