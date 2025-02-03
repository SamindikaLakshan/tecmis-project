package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Totbl {
    private final StringProperty id;
    private final StringProperty name;
    private final StringProperty mail;
    private final StringProperty  password;
    private final StringProperty  contact;

    public Totbl()
    {
        id = new SimpleStringProperty(this, "id");
        name = new SimpleStringProperty(this, "name");
        mail = new SimpleStringProperty(this, "mail");
        password = new SimpleStringProperty(this, "Password");
        contact = new SimpleStringProperty(this, "Contact");
    }
    public StringProperty idProperty() { return id; }
    public String getId() { return id.get(); }
    public void setId(String newId) { id.set(newId); }

    public StringProperty nameProperty() { return name; }
    public String getName() { return name.get(); }
    public void setName(String newName) { name.set(newName); }

    public StringProperty mailProperty() { return mail; }
    public String getMail() { return mail.get(); }
    public void setMail(String newMobile) { mail.set(newMobile); }

    public StringProperty passwordProperty() { return password; }
    public String getPassword() { return password.get(); }
    public void setPassword(String newCourse) { password.set(newCourse); }

    public StringProperty contactProperty() { return contact; }
    public String getContact() { return contact.get(); }
    public void setContact(String newCourse) { contact.set((newCourse)); }
}
