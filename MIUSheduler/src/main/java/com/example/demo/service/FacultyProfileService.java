package com.example.demo.service;

import com.example.demo.entity.FacultyPreferenceForm;
import com.example.demo.entity.FacutlyProfile;
import com.example.demo.repo.FacultyPreferenceFormDao;
import com.example.demo.repo.FacultyProfileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyProfileService {
    @Autowired
    private FacultyProfileDao profileDao;
    @Autowired
    private FacultyPreferenceFormDao facultyPreferenceFormDao;

    public void saveFacultypreference(FacultyPreferenceForm facultyPreferenceForm){
        facultyPreferenceFormDao.save(facultyPreferenceForm);
    }
    public List<FacultyPreferenceForm> viewFacultySchedule(String id){
        return facultyPreferenceFormDao.findAllByFacultyId(id);
    }

    public FacutlyProfile saveFacultyProfile(FacutlyProfile facutlyProfile){
        return profileDao.save(facutlyProfile);
    }

    public List<FacutlyProfile> saveFacultyProfiles(List<FacutlyProfile> facultyProfiles){
        return profileDao.saveAll(facultyProfiles);
    }
    public FacutlyProfile getFacultyProfileByName(String firstName, String lastName){
        return profileDao.findFacultyProfileByFirstNameAndLastName(firstName,lastName);
    }

    public void deleteFacultyByName(String firstName , String lastName){
        FacutlyProfile a = getFacultyProfileByName(firstName,lastName);
        profileDao.delete(a);
    }

    public List<FacutlyProfile> getAllFacultyProfile(){
        return profileDao.findAll();
    }
    public String deleteFacultyById(String id){
        profileDao.deleteFacultyProfileByIdNumber(id);
        return "student with id = " + id + " deleted successfully";
    }

//    public FacutlyProfile updateFaculty(FacutlyProfile facutlyProfile){
//        FacutlyProfile profile = getFacultyProfileByName(facutlyProfile.getFirstName());
//        profile.setFirstName(facutlyProfile.getFirstName());
//        profile.setLastName(facutlyProfile.getLastName());
//        profile.setFacultyJob(facutlyProfile.getFacultyJob());
//        profile.setBriefDescription(facutlyProfile.getBriefDescription());
//        return profileDao.save(profile);
//    }

}
