package org.example.tecmis.Lecture;

public class Mid extends MidController{
    private String Std_id;
    private String crs_id;
    private int mid_mark;

    public Mid(String std_id, String crs_id, int mid_mark) {
        this.Std_id = std_id;
        this.crs_id = crs_id;
        this.mid_mark = mid_mark;

    }
    public String getStd_id() {
        return Std_id;
    }
    public String getCrs_id() {
        return crs_id;
    }
    public int getMid_mark() {
        return mid_mark;
    }

}
