package com.company;

import java.util.HashSet;

public class Courses {
    String courseName;
    String professorName;
    int year;

    public Courses (String coursename, String professor, int Year) {
        courseName = coursename;
        professorName = professor;
        year = Year;
    }
    public void printCourse() {
        System.out.println("Course: " + courseName + ", Lecturer is Prof " + professorName + ", Level: " + year);
    }
    HashSet<String> List = new HashSet<>();

    public void enroll(Student student) {
        List.add(student.firstName + student.lastName + student.grade);
        System.out.println(student.firstName + student.lastName + " has been added to the course");
        System.out.println(List);
   }
   public void unenroll(Student student) {
        List.remove(student.firstName + student.lastName + student.grade);
        System.out.println(student.firstName + student.lastName + " has been removed from the course");
        System.out.println(List);
   }
   public int countStudents() {
       System.out.println("Number of students in course: " + List.size());
       return List.size();
   }
//   public int bestGrade() {
//
//   }
}