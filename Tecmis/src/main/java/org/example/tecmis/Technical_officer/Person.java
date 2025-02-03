package org.example.tecmis.Technical_officer;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty address;
    private final StringProperty course_id;
    private final StringProperty course_name;
    private final StringProperty course_credit;
    private final StringProperty dayOfWeek;
    private final StringProperty time;
    private final StringProperty user_contact;
    private final StringProperty user_email;

    private final StringProperty setCount;

    private final StringProperty setstudentid;

    private final StringProperty setcourceid;

    private final StringProperty lectureId;
    private final StringProperty mon;
    private final StringProperty tue;
    private final StringProperty wed;
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
        user_contact=new SimpleStringProperty(this,"user_contact");
        user_email=new SimpleStringProperty(this,"user_email");
        setCount=new SimpleStringProperty(this,"setCount");
        setstudentid=new SimpleStringProperty(this,"setstudentid");
        setcourceid=new SimpleStringProperty(this,"setcourceid");

        lectureId = new SimpleStringProperty(this, "lectureId");
        mon = new SimpleStringProperty(this, "mon");
        tue = new SimpleStringProperty(this, "tue");
        wed = new SimpleStringProperty(this, "wed");
        thu = new SimpleStringProperty(this, "thu");
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

    //conatact
    public StringProperty user_contactProperty() { return user_contact; }
    public String getContact() { return user_contact.get(); }
    public void setContact(String newuser_contact) { user_contact.set(newuser_contact); }

    //Email
    public StringProperty user_emailProperty() { return user_email; }
    public String getEmail() { return user_email.get(); }
    public void setEmail(String newuser_email) { user_email.set(newuser_email); }

    //Count
    public StringProperty countProperty() { return setCount; }
    public String getsetCount() { return setCount.get(); }
    public void setCount(String newsetCount) { setCount.set(newsetCount); }

    //LECID
    public StringProperty lecProperty() { return lectureId; }
    public String getlectureId() { return lectureId.get(); }
    public void setlectureId(String newlectureId) { lectureId.set(newlectureId); }

    //MON
    public StringProperty monProperty() { return mon; }
    public String getmon() { return mon.get(); }
    public void setmon(String newmon) { mon.set(newmon); }

    //TUE
    public StringProperty tueProperty() { return tue; }
    public String gettue() { return tue.get(); }
    public void settue(String newtue) { tue.set(newtue); }

    //WED
    public StringProperty wedProperty() { return wed; }
    public String getwed() { return wed.get(); }
    public void setwed(String newwed) { wed.set(newwed); }

    //THUR
    public StringProperty thuProperty() { return thu; }
    public String getthu() { return thu.get(); }
    public void setthu(String newthu) { thu.set(newthu); }

    //FRI
    public StringProperty friProperty() { return fri; }
    public String getfri() { return fri.get(); }
    public void setfri(String newfri) { fri.set(newfri); }

}
