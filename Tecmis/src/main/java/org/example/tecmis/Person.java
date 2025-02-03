package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;

public class Person {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty address;
    private final StringProperty course_id;
    private final StringProperty course_name;
    private final StringProperty course_credit;
    private final StringProperty dayOfWeek;
    private final StringProperty time;
    private final StringProperty attendance;
    private final StringProperty count;

    private final StringProperty mon;
    private final StringProperty tue;
    private final StringProperty wen;
    private final StringProperty thu;
    private final StringProperty fri;


    public Person()
    {

        id = new SimpleStringProperty(this, "id");
        name = new SimpleStringProperty(this, "name");
        address=new SimpleStringProperty(this,"address");
        course_id=new SimpleStringProperty(this,"course_id");
        course_name=new SimpleStringProperty(this,"course_name");
        course_credit=new SimpleStringProperty(this,"course_credit");
        dayOfWeek=new SimpleStringProperty(this,"dayOfWeek");
        time=new SimpleStringProperty(this,"time");
        attendance=new SimpleStringProperty(this,"attendance");
        count = new SimpleStringProperty(this, "count");

        mon=new SimpleStringProperty(this,"mon");
        tue=new SimpleStringProperty(this,"tue");
        wen=new SimpleStringProperty(this,"wen");
        thu=new SimpleStringProperty(this,"thu");
        fri = new SimpleStringProperty(this, "fri");
    }

    public StringProperty idProperty() {
        return id;
    }
    public String getId() {
        return id.get();
    }
    public void setId(String newId) {
        id.set(newId);
    }

    public StringProperty nameProperty() { return name; }
    public String getName() { return name.get(); }
    public void setName(String newName) { name.set(newName); }

    //Address
    public StringProperty addressProperty() { return address; }
    public String getaddress() { return address.get(); }
    public void setaddress(String newAddress) { address.set(newAddress); }

    //Attendance
    public StringProperty attendanceProperty() { return attendance; }
    public String getAttendance() { return attendance.get(); }
    public void setAttendance(String newAttendance) { attendance.set(newAttendance); }

    //Subject Name
    public StringProperty course_nameProperty() { return course_name; }
    public String getcourse_name() { return course_name.get(); }
    public void setcourse_name(String newcourse_name) { course_name.set(newcourse_name); }

    //Subject code
    public StringProperty course_idProperty() { return course_id; }
    public String getcourse_id() { return course_id.get(); }
    public void setcourse_id(String newcourse_id) { course_id.set(newcourse_id); }

    //course_credit
    public StringProperty course_creditProperty() { return course_credit; }
    public String getcourse_credit() { return course_credit.get(); }
    public void setcourse_credit(String newcourse_id) { course_credit.set(newcourse_id); }

    //dayOfWeek
    public StringProperty dayOfWeekProperty() { return dayOfWeek; }
    public String dayOfWeek() { return dayOfWeek.get(); }
    public void dayOfWeek(String newcourse_id) { dayOfWeek.set(newcourse_id); }

    //Time
    public StringProperty timeProperty() { return time; }
    public String time() { return time.get(); }
    public void time(String newcourse_id) { time.set(newcourse_id); }

    //Count
    public StringProperty countProperty() { return count; }
    public String getCount() { return count.get(); }
    public void setCount(String newCount) { time.set(newCount); }


    //Monday
    public StringProperty monProperty() { return mon; }
    public String getMon() { return mon.get(); }
    public void setMon(String newMon) { mon.set(newMon); }

    //Tuesday
    public StringProperty tueProperty() { return tue; }
    public String getTue() { return tue.get(); }
    public void setTue(String newTue) { tue.set(newTue); }

    //Wendsday
    public StringProperty wenProperty() { return wen; }
    public String getWen() { return wen.get(); }
    public void setWen(String newWen) { wen.set(newWen); }

    //Thursday
    public StringProperty thuProperty() { return thu; }
    public String getThu() { return thu.get(); }
    public void setThu(String newThu) { thu.set(newThu); }

    //Friday
    public StringProperty friProperty() { return fri; }
    public String getfri() { return fri.get(); }
    public void setFri(String newFri) { fri.set(newFri); }


}