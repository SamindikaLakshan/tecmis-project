package org.example.tecmis.Lecture;

public class asiignment extends AssignmentController {
    private String Std_id;
    private String crs_id;
    private int asm_no;
    private int asm_mark;

    public asiignment(String std_id, String crs_id, int asm_no, int asm_mark) {
        Std_id = std_id;
        this.crs_id = crs_id;
        this.asm_no = asm_no;
        this.asm_mark = asm_mark;
    }

    public String getStd_id() {
        return Std_id;
    }

    public String getCrs_id() {
        return crs_id;
    }

    public int getAsm_no() {
        return asm_no;
    }

    public int getAsm_mark() {
        return asm_mark;
    }
}
