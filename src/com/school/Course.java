package com.school;

public class Course implements Storable {
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    // Constructor for auto ID generation
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Getter methods
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName);
    }

    @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}
