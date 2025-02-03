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


public class AddCourseController {
    @FXML
    private TextField newCourse;

    @FXML
    private TextField newCredit;

    @FXML
    private TextField newName;

    @FXML
    private Label notify;

    @FXML
    private Button cancelButton;

    @FXML
    private Button saveMe;

    @FXML
    void saveMe(ActionEvent event) {
        String newCode = newCourse.getText();
        String crsName = newName.getText();;
        String newcredit = newCredit.getText();
        int newCreditInt = Integer.parseInt(newcredit);


        myconnection dc;
        dc = new myconnection();
        Connection con = dc.GetMyConnection();

        String query = "INSERT INTO course_unit VALUES(?,?,?)";

        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, newCode);
            pstmt.setString(2, crsName);
            pstmt.setInt(3, newCreditInt);

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
