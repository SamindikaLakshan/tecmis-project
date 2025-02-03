module org.example.tecmis {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;


    opens org.example.tecmis to javafx.fxml;
    opens org.example.tecmis.Technical_officer to javafx.fxml;
    opens org.example.tecmis.Lecture to javafx.fxml;
    exports org.example.tecmis;
    exports org.example.tecmis.Technical_officer;
    exports org.example.tecmis.Lecture;





}

