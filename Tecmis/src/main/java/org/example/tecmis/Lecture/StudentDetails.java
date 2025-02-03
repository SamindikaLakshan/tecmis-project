package org.example.tecmis.Lecture;

public class StudentDetails extends studentTable{
    private String studentID;
    private String studentName;
    private String studentEmail;
    private String studentContact;
    private String studentNIC;
    private String studentStatus;
    private String studentDepid;

    public StudentDetails(String studentID, String studentName, String studentEmail, String studentContact, String studentNIC, String studentStatus, String studentDepid ) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentContact = studentContact;
        this.studentNIC = studentNIC;
        this.studentStatus = studentStatus;
        this.studentDepid = studentDepid;
    }
    public String getStd_id() {
        return studentID;
    }

    public String getName() {
        return studentName;
    }

    public String getEmail() {
        return studentEmail;
    }

    public String getContact() {
        return studentContact;
    }

    public String getNIC() {
        return studentNIC;
    }

    public String getStatus() {
        return studentStatus;
    }
    public String getDep_id() {
        return studentDepid;
    }

}
