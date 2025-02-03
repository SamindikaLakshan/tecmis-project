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

public class Attendenceupdate {

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
    private void updateTable() {
        DBconnection mdc ;

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        Statement stmt;
        try {
            stmt=con.createStatement();

            String selectQuery = "SELECT Count FROM attendance WHERE Crs_id = ? AND Std_id = ?";
            String updateQuery = "UPDATE attendance SET Count = ? WHERE Crs_id = ? AND Std_id = ?";

            String a_count = value.getText();
            String student_id = studentid.getText();
            String course_id = courceid.getText();

            // Check if input is valid
            int attendanceCount;
            try {
                attendanceCount = Integer.parseInt(a_count);
                if (attendanceCount != 0 && attendanceCount != 1) {
                    showNotification("Attendance value must be either 0 or 1.");
                    return;
                }
            } catch (NumberFormatException e) {
                showNotification("Attendance value must be an integer (0 or 1).");
                return;
            }

            if (a_count.isEmpty() || student_id.isEmpty() || course_id.isEmpty()) {
                showNotification("Please fill all fields.");
                return; // Stop execution if any field is empty
            }

            // Execute select query to get current count
            PreparedStatement selectStmt = con.prepareStatement(selectQuery);
            selectStmt.setString(1, course_id);
            selectStmt.setString(2, student_id);
            ResultSet resultSet = selectStmt.executeQuery();

            if (resultSet.next()) {
                int currentCount = resultSet.getInt("Count");
                if (attendanceCount == 1) {
                    // If the user inputs 1, increment the count
                    currentCount++;
                }

                if (currentCount >= 0 && currentCount <= 15) {
                    // Update the count only if attendanceCount is 1
                    if (attendanceCount == 1) {
                        // Update the count
                        PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                        updateStmt.setInt(1, currentCount);
                        updateStmt.setString(2, course_id);
                        updateStmt.setString(3, student_id);
                        int rowsAffected = updateStmt.executeUpdate();

                        if (rowsAffected > 0) {
                            showNotification("Attendance count updated successfully.");
                        } else {
                            showNotification("Failed to update attendance count.");
                        }
                    } else {
                        showNotification("Attendance count remains unchanged.");
                    }
                } else {
                    showNotification("Attendance count must be between 0 and 15.");
                }
            } else {
                showNotification("Attendance record not found.");
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

