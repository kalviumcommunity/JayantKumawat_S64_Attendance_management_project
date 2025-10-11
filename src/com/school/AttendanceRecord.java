package com.school;

public class AttendanceRecord implements Storable {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        if (status != null && (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"))) {
            this.status = capitalize(status);
        } else {
            System.out.println("Warning: Invalid attendance status '" + status + "'. Setting status to 'Invalid'.");
            this.status = "Invalid";
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("AttendanceRecord -> Student ID: " + studentId + ", Course ID: C" + courseId + ", Status: " + status);
    }

    @Override
    public String toDataString() {
        return studentId + "," + courseId + "," + status;
    }

    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        String lower = s.toLowerCase();
        return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
    }
}
