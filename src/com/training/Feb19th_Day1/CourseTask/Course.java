package com.training.Feb19th_Day1.CourseTask;

public class Course {
    private String courseName;
    private int courseID;

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName(){
        return courseName;
    }
    public int getCourseID(){
        return courseID;
    }
}
