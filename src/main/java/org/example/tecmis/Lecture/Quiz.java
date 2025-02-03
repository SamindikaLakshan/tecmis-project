package org.example.tecmis.Lecture;

public class Quiz extends QuizController{
    private String Std_id;
    private String crs_id;
    private int quiz_no;
    private int quiz_mark;

    public Quiz(String std_id, String crs_id, int quiz_no, int quiz_mark) {
        this.Std_id = std_id;
        this.crs_id = crs_id;
        this.quiz_no = quiz_no;
        this.quiz_mark = quiz_mark;

    }
    public String getStd_id() {
        return Std_id;
    }
    public String getCrs_id() {
        return crs_id;
    }
    public int getQuiz_no() {
        return quiz_no;
    }
    public int getQuiz_mark() {
        return quiz_mark;
    }



}
