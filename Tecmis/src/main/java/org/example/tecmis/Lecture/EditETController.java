package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EditETController {

    @FXML
    private TextField crs;

    @FXML
    private TextField newMark;

    @FXML
    private Button save;

    @FXML
    private TextField std;

    @FXML
    private Label notify;

    @FXML
    private Button cancelButton;

    @FXML
    void saveMe(ActionEvent event) {
        String stdVal = std.getText();
        String crsVal = crs.getText();
        String newMarkVal = newMark.getText();
        int newMarkValInt = Integer.parseInt(newMarkVal);

        myconnection dc;
        dc = new myconnection();
        Connection con = dc.GetMyConnection();

        String query = "UPDATE end_theory SET End_marks = ? WHERE Std_id = ? AND Crs_id = ?";

        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, newMarkValInt);
            pstmt.setString(2, stdVal);
            pstmt.setString(3, crsVal);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                notify.setText("Marks updated successfully");
            } else {
                notify.setText("No matching records found");
            }
        } catch (SQLException e) {
            notify.setText("Error updating marks: " + e.getMessage());
            e.printStackTrace();
        }

    }
    @FXML
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
