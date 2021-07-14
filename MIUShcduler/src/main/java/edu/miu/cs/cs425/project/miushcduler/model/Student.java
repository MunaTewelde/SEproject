package edu.miu.cs.cs425.project.miushcduler.model;

import javax.persistence.*;
import java.util.List;

//@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fName;
    private  String lName;
    private  String email;

    private List<Course> courses;

}
