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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Profileupdate {

    @FXML
    private Button backButton;
    @FXML
    private TextField userIdField;

    @FXML
    private TextField userNameField;

    @FXML
    private TextField userPasswordField;

    @FXML
    private Button updateButton;

    @FXML
    private TextField user_conatact;

    @FXML
    private TextField user_email;

    @FXML
    private void Updatetble() {
        DBconnection mdc = new DBconnection();

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        Statement stmt;
        try {
            stmt=con.createStatement();

             String preparedStatement ="UPDATE officer SET contact_number = ?, email = ? WHERE officer_id = ?";

            String userId = userIdField.getText();
            String email = user_email.getText();
            String conatact = user_conatact.getText();



            if (userId.isEmpty() || email.isEmpty() || conatact.isEmpty()) {
                showNotification("Please fill all fields.");
                return; // Stop execution if any field is empty
            }

            PreparedStatement pst=con.prepareStatement(preparedStatement);
            pst.setInt(1,Integer.parseInt(conatact));
            pst.setString(2,email);
            pst.setInt(3, Integer.parseInt(userId));
            int rowsAffected=pst.executeUpdate();

            //int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                showNotification("User details updated successfully.");
            } else {
                showNotification("Failed to update user details.");
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
        //

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
