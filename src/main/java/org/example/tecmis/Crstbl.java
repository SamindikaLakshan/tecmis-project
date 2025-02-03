package org.example.tecmis;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Crstbl {
    private final StringProperty id4;
    private final StringProperty name4;
    private final StringProperty credit4;

    public Crstbl()
    {
        id4 = new SimpleStringProperty(this, "id");
        name4 = new SimpleStringProperty(this, "name");
        credit4 = new SimpleStringProperty(this, "credit");
    }
    public StringProperty idProperty() { return id4; }
    public String getId() { return id4.get(); }
    public void setId(String newId) { id4.set(newId); }

    public StringProperty nameProperty() { return name4; }
    public String getName() { return name4.get(); }
    public void setName(String newName) { name4.set(newName); }

    public StringProperty creditProperty() { return credit4; }
    public String getCredit() { return credit4.get(); }
    public void setCredit(String newMobile) { credit4.set(newMobile); }

}
