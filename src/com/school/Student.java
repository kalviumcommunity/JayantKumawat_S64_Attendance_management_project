package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    private int studentId;
    private String name;

    // Constructor for auto ID generation
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
