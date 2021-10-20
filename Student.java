package com.company;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String first, String last, int reg, int Grade, int Year){
        firstName = first;
        lastName = last;
        registration = reg;
        grade = Grade;
        year = Year;
    }
    public void printFullName(){
        System.out.println(firstName + lastName);
    }
    public boolean isApproved(){
        return grade >= 60;
    }
    public void changeYearIfApproved() {
        if (this.isApproved()) {
            year ++;
            System.out.println("Congratulations, you are promoted to year " + year);
        } else {
            System.out.println("Sorry you have been retained in year " + year);
        }

    }
}

