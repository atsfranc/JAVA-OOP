package com.company;
import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> List;

    public Courses (String coursename, String professor, int Year, ArrayList<Student>list) {
        courseName = coursename;
        professorName = professor;
        year = Year;
        List = list;
    }
    public void printCourse() {
        System.out.println("Course: " + courseName + ", Lecturer is Prof " + professorName + ", Level: " + year);
    }

    public void enroll(Student student) {
        List.add(student);
        System.out.println(student.firstName + student.lastName + " has been added to the course");

   }
   public void unenroll(Student student) {
        List.remove(student);
        System.out.println(student.firstName + student.lastName + " has been removed from the course");

   }
   public int countStudents() {
       System.out.println("Number of students in course: " + List.size());
       return List.size();
   }
   public int bestGrade() {
       int bestGrade = 0;
       for (Student student: List){
           if (student.grade > bestGrade){
               bestGrade = student.grade;
           }
       } return bestGrade;
   }
}