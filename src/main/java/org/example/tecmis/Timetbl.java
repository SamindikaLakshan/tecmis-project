package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Timetbl {
    private final StringProperty id5;
    private final StringProperty name5;
    private final StringProperty mon5;
    private final StringProperty  tue5;
    private final StringProperty  wed5;
    private final StringProperty  thu5;
    private final StringProperty  fri5;

    public Timetbl()
    {
        id5 = new SimpleStringProperty(this, "id");
        name5 = new SimpleStringProperty(this, "name");
        mon5 = new SimpleStringProperty(this, "mon");
        tue5 = new SimpleStringProperty(this, "tue");
        wed5 = new SimpleStringProperty(this, "wed");
        thu5 = new SimpleStringProperty(this, "thu");
        fri5 = new SimpleStringProperty(this, "fri");
    }
    public StringProperty idProperty() { return id5; }
    public String getId() { return id5.get(); }
    public void setId(String newId) { id5.set(newId); }

    public StringProperty nameProperty() { return name5; }
    public String getName() { return name5.get(); }
    public void setName(String newName) { name5.set(newName); }

    public StringProperty monProperty() { return mon5; }
    public String getMon() { return mon5.get(); }
    public void setMon(String newMobile) { mon5.set(newMobile); }

    public StringProperty tueProperty() { return tue5; }
    public String getTue() { return tue5.get(); }
    public void setTue(String newCourse) { tue5.set(newCourse); }

    public StringProperty wedProperty() { return wed5; }
    public String getWed() { return wed5.get(); }
    public void setWed(String newCourse) { wed5.set((newCourse)); }

    public StringProperty thuProperty() { return thu5; }
    public String getThu() { return thu5.get(); }
    public void setThu(String newCourse) { thu5.set((newCourse)); }

    public StringProperty friProperty() { return fri5; }
    public String getFri() { return fri5.get(); }
    public void setFri(String newCourse) { fri5.set((newCourse)); }
}
