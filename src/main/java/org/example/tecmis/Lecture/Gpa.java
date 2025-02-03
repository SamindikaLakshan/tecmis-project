package org.example.tecmis.Lecture;

public class Gpa extends GpaController{
    private String gpa;
    private String stdid;
    public Gpa(String gpa, String stdid, float v) {
        this.gpa = gpa;
        this.stdid = stdid;

    }
    public String getGpa() {
        return gpa;
    }
    public String getStdid() {
        return stdid;
    }


}
