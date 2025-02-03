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

public class EditQuizController {
    @FXML
    private TextField quizNo;

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
        String quizNoVal = quizNo.getText();
        int quizNoValInt = Integer.parseInt(quizNoVal);
        int newMarkValInt = Integer.parseInt(newMarkVal);

        myconnection dc;
        dc = new myconnection();
        Connection con = dc.GetMyConnection();

        String query = "UPDATE quiz SET Qiz_mark = ? WHERE Qiz_no = ? AND Std_id = ? AND Crs_id = ?";

        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, newMarkValInt);
            pstmt.setInt(2, quizNoValInt);
            pstmt.setString(3, stdVal);
            pstmt.setString(4, crsVal);

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
