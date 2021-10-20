package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Student student1 = new Student("Ang", " Francis", 1, 61, 3);
    Student student2 = new Student("John", " Tan", 2, 50, 3);
    Student student3 = new Student("Mary", " Jane", 3, 75, 3);

    student1.printFullName();
    student2.isApproved();
    student3.changeYearIfApproved();


    Courses course = new Courses("Biology", "Howard", 4, new ArrayList<Student>());
    course.printCourse();
    course.enroll(student3);
    course.enroll(student1);
    course.unenroll(student3);

    course.countStudents();

    System.out.println("Best grade: " + course.bestGrade());
    }

}
