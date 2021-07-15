package com.example.demo.service;

import com.example.demo.entity.CourseChangeForm;
import com.example.demo.entity.StudentRegistration;
import com.example.demo.entity.StudentSchedule;
import com.example.demo.repo.CourseChangeFormDao;
import com.example.demo.repo.EntryListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private EntryListDao entryListDao;
    @Autowired
    private CourseChangeFormDao courseChangeFormDao;

    public List<StudentSchedule> viewStudentSchedule(String studentId){
        StudentRegistration studentRegistration= entryListDao.findByIdNumber(studentId);
        Map<String, StudentSchedule> scheduleMap = studentRegistration.getScheduleMap();
        List<StudentSchedule> output = new ArrayList<>();
        for(Map.Entry<String , StudentSchedule> t: scheduleMap.entrySet()){
            output.add(t.getValue());
        }
        return output;
    }

    public void saveCourseChangeRequestForm(CourseChangeForm courseChangeForm){
        courseChangeFormDao.save(courseChangeForm);
    }

}
