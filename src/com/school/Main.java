package com.school;
import java.util.ArrayList;
import java.util.List;

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

        // Attendance logging using encapsulated IDs
        System.out.println("\n---- Attendance Records ----");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Valid statuses
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));

        // Case-insensitive allowed
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "present"));

        // Invalid status to trigger validation
        attendanceLog.add(new AttendanceRecord(students[3].getStudentId(), courses[0].getCourseId(), "Late"));

        for (AttendanceRecord r : attendanceLog) {
            r.displayRecord();
        }
    }
}
