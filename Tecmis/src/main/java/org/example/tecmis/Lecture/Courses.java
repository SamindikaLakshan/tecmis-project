package org.example.tecmis.Lecture;

public class Courses extends CourseController{
    private String course_code;
    private String course_name;
    private int credits;

    public Courses(String course_code, String course_name, int credit) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.credits = credit;
    }
    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public int getCredits() {
        return credits;
    }






}
