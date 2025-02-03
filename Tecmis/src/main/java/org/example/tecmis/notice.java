package org.example.tecmis;


import org.example.tecmis.connection.DBconnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class notice implements Initializable {

    @FXML
    private VBox notice;

    @FXML
    void back(ActionEvent event) {
        HelloController.show();

    }


    void notices(){
        String topic = null, nt = null,date = null;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM notice";
            ResultSet rs1 = stmt.executeQuery(myStatement);
            notice.setSpacing(10);

            while (rs1.next()) {
                topic = rs1.getString(2);
                nt=rs1.getString(3);
                date = rs1.getString(4);
                System.out.println(topic);
                System.out.println(nt);

                Label label1=new Label(topic);
                Label label2=new Label(nt);
                Label label3=new Label(date);
                label1.getStyleClass().add("custom-label");

                VBox vb=new VBox();
                vb.getChildren().addAll(label1,label2,label3);
                vb.getStyleClass().add("custom-vb");

                notice.getChildren().addAll(vb);

            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        notices();
    }

}
