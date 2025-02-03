package org.example.tecmis.Lecture;

public class Attendance extends AttendaceController{
    private String Std_id;
    private String crs_id;
    private String count;
    public Attendance(String Std_id, String crs_id, String count) {
        this.Std_id = Std_id;
        this.crs_id = crs_id;
        this.count = count;

    }
    public String getStd_id() {
        return Std_id;
    }

    public String getCrs_id() {
        return crs_id;
    }
    public String getCount() {
        return count;
    }


}
