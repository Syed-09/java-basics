package com.training.Feb19th_Day1.CourseTask;
public class CourseTester {
    public static void main(String[] args   ){

        Course[] courseArr = new Course[5];
        courseArr[0] = new Course("Java",1);
        courseArr[1] = new Course("Python", 2);
        courseArr[2] = new Course("AngularJS", 3);
        courseArr[3] = new Course("SpringBoot", 4);
        courseArr[4] = new Course("Ruby", 5);
        System.out.println(courseFinder("C++",courseArr));
    }

    public static String courseFinder(String myCourse, Course[] Array){
        for (Course course: Array){
            if (course.getCourseName().equals(myCourse)){
                return "Found your Course!!";
            }
        }
        return "Sorry, We don't have your course!!";
    }

}
