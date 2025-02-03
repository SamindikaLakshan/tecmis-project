package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Noticetbl {
    private final StringProperty id6;
    private final StringProperty head6;
    private final StringProperty des6;
    private final StringProperty date6;

    public Noticetbl()
    {
        id6 = new SimpleStringProperty(this, "id");
        head6 = new SimpleStringProperty(this, "head");
        des6 = new SimpleStringProperty(this, "des");
        date6 = new SimpleStringProperty(this, "date");
    }
    public StringProperty idProperty() { return id6; }
    public String getId() { return id6.get(); }
    public void setId(String newId) { id6.set(newId); }

    public StringProperty headProperty() { return head6; }
    public String getHead() { return head6.get(); }
    public void setHead(String newName) { head6.set(newName); }

    public StringProperty desProperty() { return des6; }
    public String getDes() { return des6.get(); }
    public void setDes(String newMobile) { des6.set(newMobile); }

    public StringProperty dateProperty() { return date6; }
    public String getDate() { return date6.get(); }
    public void setDate(String newMobile) { date6.set(newMobile); }
}
