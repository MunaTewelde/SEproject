package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class student {
    @Id
    @GeneratedValue
    private int id;
    private String fname;
    private String lname;
    @ElementCollection
    private Map<Integer, Course> list = new HashMap<>();
    public student(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", list=" + list +
                '}';
    }
}
