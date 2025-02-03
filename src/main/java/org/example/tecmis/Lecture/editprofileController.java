package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.Integer.valueOf;

public class editprofileController {
    @FXML
    private TextField newaddress;

    @FXML
    private TextField newconatct;

    @FXML
    private TextField newemail;

    @FXML
    private Button updateprofilebutton;

    @FXML
    private Button cancelButton;


    @FXML
    private Label updateDisplay;

    @FXML
    private TextField pas;


    @FXML
    public void saveProfile(ActionEvent actionEvent) throws SQLException {
        String address = newaddress.getText();
        String contact = newconatct.getText();
        String email = newemail.getText();
        String text = pas.getText();
        int intPas = Integer.parseInt(text);
        int newCon = Integer.parseInt(contact);

        myconnection dc;
        dc = new myconnection();
        Connection con = dc.GetMyConnection();
        Statement stmt = con.createStatement();

        String query = "UPDATE lecture SET address = '" + address + "', Contact = " + newCon + ", Email = '" + email + "' WHERE pasword = " + intPas;
        String query1 = "SELECT * FROM lecture WHERE pasword = " + intPas;

        ResultSet rs = stmt.executeQuery(query1);
        String oldPas = "";

        while (rs.next()) {
            oldPas = rs.getString(6);
        }

        if (!String.valueOf(intPas).equals(oldPas)) {
            updateDisplay.setText("Incorrect Password");
        } else {
            try {
                stmt.executeUpdate(query);
                updateDisplay.setText("Profile Updated");
            } catch (SQLException e) {
                System.out.println("Error in updating profile");
                throw new RuntimeException(e);
            }
        }

        stmt.close();
        con.close();
    }

    @FXML
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}