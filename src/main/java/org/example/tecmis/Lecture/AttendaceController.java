package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AttendaceController {
    @FXML
    private Button attendaceButton;

    @FXML
    private Button medicalButton;

    @FXML
    private Button cancelButton;

    @FXML
    void studentAttendace(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Attendance-Table.fxml"));

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

    @FXML
    void studentsMedical(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Medical-Table.fxml"));

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
    @FXML
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
