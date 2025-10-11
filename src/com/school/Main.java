package com.school;

public class Main {
    public static void main(String[] args) {
        // Array of Students (auto-generated IDs)
        Student[] students = new Student[4];
        students[0] = new Student("Jayant");
        students[1] = new Student("Aman");
        students[2] = new Student("Riya");
        students[3] = new Student("Kunal");

        // Array of Courses (auto-generated IDs)
        Course[] courses = new Course[3];
        courses[0] = new Course("Object Oriented Programming");
        courses[1] = new Course("Data Structures");
        courses[2] = new Course("Algorithms");

        // Display Students
        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayStudent();
        }

        // Display Courses
        System.out.println("\n---- Courses ----");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
