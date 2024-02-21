package com.training.Feb21th_Day3;

import java.util.*;

public class Student implements Comparable<Student>{
    private int studId;
    private String studName;
    private int studAge;
    private char studGrade;

    public Student(int studId, String studName, int studAge, char studGrade) {
        this.studId = studId;
        this.studName = studName;
        this.studAge = studAge;
        this.studGrade = studGrade;
    }

    public int getId() {
        return studId;
    }

    public void setId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return studName;
    }

    public void setName(String studName) {
        this.studName = studName;
    }

    public int getAge() {
        return studAge;
    }

    public void setAge(int studAge) {
        this.studAge = studAge;
    }

    public char studgetGrade() {
        return studGrade;
    }

    public void setGrade(char studGrade) {
        this.studGrade = studGrade;
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare( this.getId(), o.getId());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studId == student.studId && studAge == student.studAge && studGrade == student.studGrade && Objects.equals(studName, student.studName);
    }

    @Override
    public int hashCode() {
        return this.studId;
    }

    @Override
    public String toString() {
        return "Student{" + "studId=" + studId + ", studName='" + studName + '\'' + ", studAge=" + studAge + ", studGrade=" + studGrade + '}';
    }
}
