package org.example.tecmis.Lecture;

public class Notice extends NoticeController{
    private String topic;
    private String notice;
    private String date;
    public Notice(String topic, String notice, String date) {
        this.topic = topic;
        this.notice = notice;
        this.date = date;
    }
    public String getTopic() {
        return topic;
    }
    public String getNotice() {
        return notice;
    }
    public String getDate() {
        return date;
    }


}
