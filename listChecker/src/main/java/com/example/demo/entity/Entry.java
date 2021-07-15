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
public class Entry {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String entryDate;
    private int fpp;
    private int fppCPT;
    private int fppOPT;
    private int mpp;
    private int mppCPT;
    private int mppOPT;
//    private List<Faculty> faculties;


}
