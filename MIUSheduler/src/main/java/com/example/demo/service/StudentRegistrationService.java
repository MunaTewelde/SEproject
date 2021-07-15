package com.example.demo.service;

import com.example.demo.entity.IdGenerator;
import com.example.demo.entity.StudentRegistration;
import com.example.demo.entity.StudentSchedule;
import com.example.demo.repo.EntryListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentRegistrationService {
    @Autowired
    private EntryListDao entryListDao;

    public void saveRegistration(StudentRegistration studentRegistration){
        studentRegistration.setIdNumber(IdGenerator.generateForStudent());


        StudentRegistration s = scheduleGenerator(studentRegistration);

        for(Map.Entry<String,StudentSchedule> t: studentRegistration.getScheduleMap().entrySet()){
            StudentSchedule get = t.getValue();
            System.out.println("key = " + t.getKey() + " , value = "+ get.toString());
        }
        System.out.println(s.toString());
        System.out.println("just before saving");
        entryListDao.save(s);
//        return entryListDao.save(s);
    }

    private StudentRegistration scheduleGenerator(StudentRegistration studentRegistration){

        Map<Integer,String> months = new HashMap<>(){{
            put(1,"January"); put(2,"February"); put(3,"March"); put(4,"April");
            put(5,"May"); put(6,"June"); put(7,"July"); put(8,"August");
            put(9,"September"); put(10,"October"); put(11,"November"); put(12,"December");
        }};

        int z=0;
        String startingTrack = studentRegistration.getStartingTrack();

        System.out.println(startingTrack + " == starting track");

        if(startingTrack.equalsIgnoreCase("mpp")){
            String trackType = studentRegistration.getTrackType();
            if(trackType.equalsIgnoreCase("us")) z=9;
            else if (trackType.equalsIgnoreCase("cpt")) z=5;
            else z=4;
        }else {
            String trackType = studentRegistration.getTrackType();
            if(trackType.equalsIgnoreCase("us")) z=10;
            else if (trackType.equalsIgnoreCase("cpt")) z=6;
            else z=5;
        }

        String studentEntry = studentRegistration.getEntryName();
        int getKey = 0;
        System.out.println("entry name === "+ studentEntry);


        for(Map.Entry<Integer,String> t: months.entrySet()){
            if(t.getValue().equalsIgnoreCase(studentEntry)){
                getKey = t.getKey();
                break;
            }
        }
        for(int i=0; i<=z;i++){
            String key = months.get(getKey);
            getKey++;
            if(getKey>12) getKey-=12;
            StudentSchedule a = new StudentSchedule();
            a.setStudentId(studentRegistration.getIdNumber());
            a.setBlockName(key);
            studentRegistration.addToScheduleMap(key,a);
        }
        return studentRegistration;
    }
}
