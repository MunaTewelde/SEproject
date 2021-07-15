package com.example.demo.entity;

public class IdGenerator {

    public static String generateForAdmin(){
        return "A" + (int)(Math.floor(Math.random()*10000));
    }

    public static String generateForFaculty(){
        return "F" + (int)(Math.floor(Math.random()*10000));
    }
    public static String generateForStudent(){
        return "S" + (int)(Math.floor(Math.random()*10000));
    }
    public static String generateForLecture(){
        return "Lec" + (int)(Math.floor(Math.random()*10000));
    }

}
