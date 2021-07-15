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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentRegistration {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String dateOfBirth;
    private String entryName;
    private String startingTrack;
    private String trackType;

//    @OneToOne
//    private Address address;

    @ElementCollection
    private Map<String, StudentSchedule> scheduleMap = new HashMap<>();

    public StudentRegistration(String firstName, String lastName, String dateOfBirth,
                               String entryName, String startingTrack, String trackType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.entryName = entryName;
        this.startingTrack = startingTrack;
        this.trackType = trackType;
//        this.address = address;
    }
    public void addToScheduleMap(String key, StudentSchedule value){
        scheduleMap.put(key,value);
    }
}
