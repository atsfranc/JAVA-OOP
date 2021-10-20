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
    public void isApproved(){
        if (grade >= 60) {
            System.out.println("Registration number " + registration + " is approved");
        } else {
            System.out.println("Sorry, registration number " + registration + " is NOT approved");
        }
    }
    public int changeYearIfApproved() {
        if (grade >= 60) {
            year = year + 1;
            System.out.println("Congratulations, you are promoted to year " + year);
        } else {
            System.out.println("Sorry you have been retained in year " + year);
        }
        return 0;
    }
}

