package com.school;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array of Students (auto-generated IDs via Person)
        Student[] students = new Student[4];
        students[0] = new Student("Jayant", "Freshman");
        students[1] = new Student("Aman", "Sophomore");
        students[2] = new Student("Riya", "Junior");
        students[3] = new Student("Kunal", "Senior");

        // Array of Courses (auto-generated IDs)
        Course[] courses = new Course[3];
        courses[0] = new Course("Object Oriented Programming");
        courses[1] = new Course("Data Structures");
        courses[2] = new Course("Algorithms");

        // Create Teacher and Staff
        Teacher t1 = new Teacher("Dr. Sharma", "Computer Science");
        Staff st1 = new Staff("Meena", "Administrator");

        // Display Persons
        System.out.println("---- People ----");
        for (Student s : students) {
            s.displayDetails();
        }
        t1.displayDetails();
        st1.displayDetails();

        // Display Courses
        System.out.println("\n---- Courses ----");
        for (Course c : courses) {
            c.displayDetails();
        }

        // Attendance logging using encapsulated IDs
        System.out.println("\n---- Attendance Records ----");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Valid statuses
        attendanceLog.add(new AttendanceRecord(students[0].getId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getId(), courses[1].getCourseId(), "Absent"));

        // Case-insensitive allowed
        attendanceLog.add(new AttendanceRecord(students[2].getId(), courses[2].getCourseId(), "present"));

        // Invalid status to trigger validation
        attendanceLog.add(new AttendanceRecord(students[3].getId(), courses[0].getCourseId(), "Late"));

        for (AttendanceRecord r : attendanceLog) {
            r.displayRecord();
        }
    }
}
