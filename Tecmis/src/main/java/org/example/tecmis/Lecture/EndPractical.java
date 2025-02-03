package org.example.tecmis.Lecture;

public class EndPractical extends EndPracticalController{
    private String Std_id;
    private String crs_id;
    private int end_mark;

    public EndPractical(String std_id, String crs_id, int end_mark) {
        this.Std_id = std_id;
        this.crs_id = crs_id;
        this.end_mark = end_mark;

    }
    public String getStd_id() {
        return Std_id;
    }
    public String getCrs_id() {
        return crs_id;
    }
    public int getEnd_marks() {
        return end_mark;
    }


}
