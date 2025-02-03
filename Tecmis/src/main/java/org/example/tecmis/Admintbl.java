package org.example.tecmis;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Admintbl {

        private final StringProperty id1;
        private final StringProperty name1;
        private final StringProperty mail1;
        private final StringProperty  password1;
        private final StringProperty  contact1;

        public Admintbl()
        {
            id1 = new SimpleStringProperty(this, "id");
            name1 = new SimpleStringProperty(this, "name");
            mail1 = new SimpleStringProperty(this, "mail");
            password1 = new SimpleStringProperty(this, "Password");
            contact1 = new SimpleStringProperty(this, "Contact");
        }
        public StringProperty idProperty() { return id1; }
        public String getId() { return id1.get(); }
        public void setId(String newId) { id1.set(newId); }

        public StringProperty nameProperty() { return name1; }
        public String getName() { return name1.get(); }
        public void setName(String newName) { name1.set(newName); }

        public StringProperty mailProperty() { return mail1; }
        public String getMail() { return mail1.get(); }
        public void setMail(String newMobile) { mail1.set(newMobile); }

        public StringProperty passwordProperty() { return password1; }
        public String getPassword() { return password1.get(); }
        public void setPassword(String newCourse) { password1.set(newCourse); }

        public StringProperty contactProperty() { return contact1; }
        public String getContact() { return contact1.get(); }
        public void setContact(String newCourse) { contact1.set((newCourse)); }
    }
