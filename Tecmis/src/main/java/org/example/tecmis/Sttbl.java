package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Sttbl {
    private final StringProperty id3;
    private final StringProperty name3;
    private final StringProperty mail3;
    private final StringProperty  password3;
    private final StringProperty  contact3;
    private final StringProperty  nic3;

    public Sttbl()
    {
        id3 = new SimpleStringProperty(this, "id");
        name3 = new SimpleStringProperty(this, "name");
        mail3 = new SimpleStringProperty(this, "mail");
        password3 = new SimpleStringProperty(this, "Password");
        contact3 = new SimpleStringProperty(this, "Contact");
        nic3 = new SimpleStringProperty(this, "nic");
    }
    public StringProperty idProperty() { return id3; }
    public String getId() { return id3.get(); }
    public void setId(String newId) { id3.set(newId); }

    public StringProperty nameProperty() { return name3; }
    public String getName() { return name3.get(); }
    public void setName(String newName) { name3.set(newName); }

    public StringProperty mailProperty() { return mail3; }
    public String getMail() { return mail3.get(); }
    public void setMail(String newMobile) { mail3.set(newMobile); }

    public StringProperty passwordProperty() { return password3; }
    public String getPassword() { return password3.get(); }
    public void setPassword(String newCourse) { password3.set(newCourse); }

    public StringProperty contactProperty() { return contact3; }
    public String getContact() { return contact3.get(); }
    public void setContact(String newCourse) { contact3.set((newCourse)); }

    public StringProperty nicProperty() { return nic3; }
    public String getNic() { return nic3.get(); }
    public void setNic(String newCourse) { nic3.set((newCourse)); }
}
