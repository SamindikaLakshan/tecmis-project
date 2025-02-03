package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.tecmis.User;

import java.io.IOException;
import java.sql.*;

public class profile extends editprofileController{
    @FXML
    private Label NameID;

    @FXML
    private Label NameID1;
    @FXML
    private Label NameID2;
    @FXML
    private Label NameID3;



    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;

        String name, contact, address, email;
        try{
            stmt=con.createStatement();
            String query="select * from lecture WHERE Lec_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, User.getUser());

            ResultSet rs=pstmt.executeQuery();
            while (rs.next()) {

                name=rs.getString(2);
                email =rs.getString(3);
                contact =rs.getString(4);
                address =rs.getString(5);

                NameID.setText(name);
                NameID1.setText(email);
                NameID2.setText(address);
                NameID3.setText(contact);

            }

        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println("show lecuture details");
        }

    }
    public void initialize() {
        show();
//        setValueFactory();
    }

    public void editProfile(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile-update.fxml"));

            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setWidth(1000); // Set your desired width
            stage.setHeight(500); // Set your desired height
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("error");
        }
    }


//    public void editProfile(ActionEvent actionEvent) {
//    }
}


