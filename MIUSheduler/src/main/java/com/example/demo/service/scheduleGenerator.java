package com.example.demo.service;

import com.example.demo.entity.Block;
import com.example.demo.entity.StudentRegistration;
import com.example.demo.entity.StudentSchedule;
import com.example.demo.repo.BlockDao;
import com.example.demo.repo.EntryListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class scheduleGenerator {
    @Autowired
    private EntryListDao entryListDao;
    @Autowired
    private BlockDao blockDao;

    public void generator(String entryName){

        Map<Integer,String> months = new HashMap<>(){{
            put(1,"January"); put(2,"February"); put(3,"March"); put(4,"April");
            put(5,"May"); put(6,"June"); put(7,"July"); put(8,"August");
            put(9,"September"); put(10,"October"); put(11,"November"); put(12,"December");
        }};

        int Key =0;

        for(Map.Entry<Integer,String> t: months.entrySet()){
            if(t.getValue().equalsIgnoreCase(entryName)){
                Key = t.getKey();
                break;
            }
        }

        List<StudentRegistration> registrationList = entryListDao.findAllByEntryName(entryName);

        for(StudentRegistration s: registrationList){
            Map<String, StudentSchedule> scheduleMap = s.getScheduleMap();
            int z= Key+1;
            int size = scheduleMap.size();
            boolean tookMPP=false;
            boolean tookWAP=false;

            for(Map.Entry<String, StudentSchedule> t: scheduleMap.entrySet()){
                if(t.getValue().getCourseCode() != null){
                    if(t.getValue().getCourseCode().equalsIgnoreCase("CS401")) tookMPP = true;
                    if(t.getValue().getCourseCode().equalsIgnoreCase("CS472")) tookWAP = true;
                }

            }

            while (size >0){
                List<Block> block = blockDao.findAllByBlockName(months.get(z));

                if(!tookMPP){
                    scheduleMap.get(months.get(z)).setCourseCode("CS401");
                    tookMPP=true;

                }else if(!tookWAP){
                    scheduleMap.get(months.get(z)).setCourseCode("CS472");
                    tookWAP = true;

                }else {
                    List<Block> remainingCourses = new ArrayList<>();

                    for(int i=0;i<block.size();i++){
                        boolean present = false;

                        for(Map.Entry<String, StudentSchedule> t: scheduleMap.entrySet()){
                            if(t.getValue().getCourseCode() != null){
                                if(t.getValue().getCourseCode().equalsIgnoreCase(block.get(i).getCourseCode())) present = true;
                            }
                        }
                        if(!present  && !block.get(i).getCourseCode().equalsIgnoreCase("FPP")) remainingCourses.add(block.get(i));
                    }

//                set course here
                    StudentSchedule a= scheduleMap.get(months.get(z));
                    StudentSchedule b = new StudentSchedule();
                    int range = remainingCourses.size()/2;
                    String courseCode = null;
                    if(remainingCourses.size()!=0){
                        courseCode = remainingCourses.get(range).getCourseCode();
                    }
//                    String courseCode = remainingCourses.get(range).getCourseCode();



//                    System.out.println(courseCode);
//                    System.out.println("here we goooo");
                    b.setBlockName(months.get(z));
                    b.setCourseCode(courseCode);
                    b.setStudentId(s.getIdNumber());
//                    System.out.println(b.toString());
                    scheduleMap.replace(months.get(z),b);
                }
                z++;
                if(z>12) z-=12;
                size--;
            }
            s.setScheduleMap(scheduleMap);
            entryListDao.save(s);
        }

    }

}
