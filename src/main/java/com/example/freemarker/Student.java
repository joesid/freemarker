package com.example.freemarker;

public class Student {
    private Integer Id;
    private String studentName;
    private double grade;


    public Student(Integer id, String studentName, double grade){
        Id = id;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public Integer getId(){

        return Id;
    }
}
