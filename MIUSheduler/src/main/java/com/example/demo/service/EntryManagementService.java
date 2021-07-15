package com.example.demo.service;


import com.example.demo.entity.Entry;
import com.example.demo.entity.StudentRegistration;
import com.example.demo.entity.StudentSchedule;
import com.example.demo.repo.EntryDao;
import com.example.demo.repo.EntryListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EntryManagementService {
    @Autowired
    private EntryDao entryDao;
    @Autowired
    private EntryListDao entryListDao;
//    @Autowired
//    private StudentScheduleDao studentScheduleDao;

    public void deleteEntry(String name){
        Entry a = entryDao.findByName(name);
        entryDao.delete(a);
    }

    public void saveEntry(Entry entry){
        entryDao.save(entry);
    }

    public List<Entry> getAllEntry(){
        return entryDao.findAll();
    }


    public void generate(int studentPerClass, String entryName){

        List<StudentRegistration> registrationList = entryListDao.findAllByEntryName(entryName.toUpperCase());

        List<StudentRegistration> mppTrack = registrationList.stream()
                .filter(studentRegistration -> studentRegistration.getStartingTrack().equalsIgnoreCase("mpp"))
                .collect(Collectors.toList());

        List<StudentRegistration> fppTrack = registrationList.stream()
                .filter(studentRegistration -> studentRegistration.getStartingTrack().equalsIgnoreCase("fpp"))
                .collect(Collectors.toList());

        Entry entry = entryDao.findByName(entryName);
        int fpp = 0;
        int mpp = 0;


        fpp+=entry.getFpp();
        fpp+=entry.getFppCPT();
        fpp+=entry.getFppOPT();
        mpp+=entry.getMpp();
        mpp+=entry.getMppCPT();
        mpp+=entry.getMppOPT();


        int[] cls = classGenerator(studentPerClass,fpp);
        HashMap<Integer, List<StudentRegistration>> fppResult= sectionGenerate(cls,fppTrack);

        cls = classGenerator(studentPerClass,mpp);
        HashMap<Integer, List<StudentRegistration>> mppResult = sectionGenerate(cls,mppTrack);


        for(Map.Entry<Integer,List<StudentRegistration>> t: fppResult.entrySet()){

            List<StudentRegistration> temp = t.getValue();
            for(StudentRegistration temp1: temp){

                StudentSchedule schedule = temp1.getScheduleMap().get(entryName);

//                StudentSchedule studentSchedule = new StudentSchedule(temp1.getIdNumber(),entryName,)

//                schedule.setBlockName(temp1.getEntryName());
                schedule.setCourseCode("CS390");
//                schedule.setStudentId(temp1.getIdNumber());
                schedule.setSectionName(t.getKey().toString());
                temp1.getScheduleMap().replace(entryName,schedule);
                entryListDao.save(temp1);
//                studentScheduleDao.save(schedule);
            }
        }
        for(Map.Entry<Integer,List<StudentRegistration>> t: mppResult.entrySet()){
            List<StudentRegistration> temp = t.getValue();
            for(StudentRegistration temp1: temp){
                StudentSchedule schedule = temp1.getScheduleMap().get(entryName);
//                schedule.setBlockName(temp1.getEntryName());
                schedule.setCourseCode("CS401");
//                schedule.setStudentId(temp1.getIdNumber());
                schedule.setSectionName(t.getKey().toString());
                temp1.getScheduleMap().replace(entryName,schedule);
                entryListDao.save(temp1);
//                studentScheduleDao.save(schedule);
            }
        }

    }

    private HashMap<Integer, List<StudentRegistration>> sectionGenerate(int[] cls, List<StudentRegistration> entryList){
        HashMap<Integer, List<StudentRegistration>> result = new HashMap<>();
        List<StudentRegistration> us = new ArrayList<>();
        List<StudentRegistration> opt = new ArrayList<>();
        List<StudentRegistration> cpt = new ArrayList<>();

        for(StudentRegistration s: entryList){
            if(s.getTrackType().equalsIgnoreCase("us")){
                us.add(s);
            }else if (s.getTrackType().equalsIgnoreCase("opt")){
                opt.add(s);
            }else{
                cpt.add(s);
            }
        }


        for(int z=0;z< cls.length;z++){
            List<StudentRegistration> section1 = new ArrayList<>();
            int u = cls[z];
            while (section1.size()<u){
                int one = 0;
                int two = 0;
                int three = 0;
                if(us.size() != 0)  one = (int)(Math.random()*100)/(us.size()*2);
                if(opt.size() !=0)  two = (int)(Math.random()*100)/(opt.size()*2);
                if(cpt.size() !=0)  three = (int)(Math.random()*100)/(cpt.size()*2);
                if(us.size() !=0 && section1.size()<u){
                    if(one>us.size()-1 || one<0){
                        one = us.size()/2;
                        section1.add(us.get(one));
                        us.remove(one);
                    }else {
                        section1.add(us.get(one));
                        us.remove(one);
                    }
                }
//                if(section1.size())
                if(opt.size() !=0 && section1.size()<u){
                    if(two>opt.size()-1 || two<0){
                        two = opt.size()/2;
                        section1.add(opt.get(two));
                        opt.remove(two);
                    }else {
                        section1.add(opt.get(two));
                        opt.remove(two);
                    }
                }
                if(cpt.size() !=0 && section1.size()<u){
                    if(three>cpt.size()-1 || three<0){
                        three = cpt.size()/2;
                        section1.add(cpt.get(three));
                        cpt.remove(three);
                    }else {
                        section1.add(cpt.get(three));
                        cpt.remove(three);
                    }
                }

            }
            result.put(z+1,section1);
        }
        return result;

    }

    private int[] classGenerator(int studentPerClass, int totalNumberOfStudents ){

        int sections = totalNumberOfStudents/studentPerClass;
        int reminder = totalNumberOfStudents%studentPerClass;
        int[] cls;

        if(reminder>=(studentPerClass/2)){
            sections+=1;
            reminder = totalNumberOfStudents%sections;
            cls = new int[sections];
            studentPerClass = totalNumberOfStudents/sections;
            for(int i=0; i<cls.length; i++){
                if(reminder>0){
                    cls[i] = (studentPerClass + 1);
                    reminder--;
                }else cls[i] = (studentPerClass);
            }
            System.out.println("condition 1");
        }else {
            cls = new int[sections];
            int reminder2 = reminder/sections;
            reminder = reminder%sections;

            for(int i=0; i<cls.length; i++){
                if(reminder>0){
                    cls[i] = (studentPerClass + reminder2 + 1);
                    reminder--;
                }else cls[i] = (studentPerClass + reminder2);
            }
            System.out.println("condition 2");
        }
        System.out.println(Arrays.toString(cls));
        return cls;
    }





}
