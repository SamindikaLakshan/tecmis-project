package org.example.tecmis.Technical_officer;

import org.example.tecmis.connection.DBconnection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class Updatemedical {

    @FXML
    private TextField courceid;

    @FXML
    private TextField studentid;

    @FXML
    private TextField value;

    @FXML
    private Button backButton;

    @FXML
    private Button updateBtn;

    @FXML
    private void Updatetable() {
        DBconnection mdc ;

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        Statement stmt;
        try {
            stmt=con.createStatement();
            String selectQuery = "SELECT SUM(Count) AS TotalCount FROM medical WHERE Crs_id = ? AND Std_id = ?";
            String updateQuery = "UPDATE medical SET Count = ? WHERE Crs_id = ? AND Std_id = ?";

            String a_count = value.getText();
            String student_id = studentid.getText();
            String course_id = courceid.getText();

            // Check if input is valid
            int medicalCount;
            try {
                medicalCount = Integer.parseInt(a_count);
                if (medicalCount != 0 && medicalCount != 1) {
                    showNotification("Medical value must be either 0 or 1.");
                    return;
                }
            } catch (NumberFormatException e) {
                showNotification("Medical value must be an integer (0 or 1).");
                return;
            }

            if (a_count.isEmpty() || student_id.isEmpty() || course_id.isEmpty()) {
                showNotification("Please fill all fields.");
                return; // Stop execution if any field is empty
            }

            // Execute select query to get current total count for the student
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            selectStmt.setString(1, course_id);
            selectStmt.setString(2, student_id);
            ResultSet resultSet = selectStmt.executeQuery();

            if (resultSet.next()) {
                int totalCount = resultSet.getInt("TotalCount");
                if (totalCount + medicalCount > 3) {
                    showNotification("Total medical count for this student cannot exceed 3.");
                    return;
                }

                // Update the count
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                updateStmt.setInt(1, medicalCount);
                updateStmt.setString(2, course_id);
                updateStmt.setString(3, student_id);
                int rowsAffected = updateStmt.executeUpdate();

                if (rowsAffected > 0) {
                    showNotification("Medical count updated successfully.");
                } else {
                    showNotification("Failed to update medical count.");
                }
            } else {
                showNotification("Medical record not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showNotification(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notification");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void handleBack() {
        try {
            // Load dash.fxml
            Parent dashRoot = FXMLLoader.load(getClass().getResource("Dash.fxml"));

            // Get the current stage
            Stage stage = (Stage) backButton.getScene().getWindow();

            // Close the current stage (window)
            stage.close();

            // Create a new scene with dash.fxml
            Scene scene = new Scene(dashRoot);

            // Set the scene to the current stage
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


