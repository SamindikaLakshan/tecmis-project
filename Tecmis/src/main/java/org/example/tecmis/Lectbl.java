package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Lectbl {
    private final StringProperty id2;
    private final StringProperty name2;
    private final StringProperty mail2;
    private final StringProperty  password2;
    private final StringProperty  contact2;

    public Lectbl()
    {
        id2 = new SimpleStringProperty(this, "id");
        name2 = new SimpleStringProperty(this, "name");
        mail2 = new SimpleStringProperty(this, "mail");
        password2 = new SimpleStringProperty(this, "Password");
        contact2 = new SimpleStringProperty(this, "Contact");
    }
    public StringProperty idProperty() { return id2; }
    public String getId() { return id2.get(); }
    public void setId(String newId) { id2.set(newId); }

    public StringProperty nameProperty() { return name2; }
    public String getName() { return name2.get(); }
    public void setName(String newName) { name2.set(newName); }

    public StringProperty mailProperty() { return mail2; }
    public String getMail() { return mail2.get(); }
    public void setMail(String newMobile) { mail2.set(newMobile); }

    public StringProperty passwordProperty() { return password2; }
    public String getPassword() { return password2.get(); }
    public void setPassword(String newCourse) { password2.set(newCourse); }

    public StringProperty contactProperty() { return contact2; }
    public String getContact() { return contact2.get(); }
    public void setContact(String newCourse) { contact2.set((newCourse)); }
}
