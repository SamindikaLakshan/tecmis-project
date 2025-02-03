package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;



public class lectureController extends editprofileController{
    @FXML
    private Label welcomeText;

    @FXML
    private Label NameID1;

    @FXML
    private Label NameID2;

    @FXML
    private Label NameID3;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void profilem(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));

            Parent root1 = fxmlLoader.load();
            Stage stage=new Stage();
            stage.setScene(new Scene(root1));
            stage.setWidth(1000); // Set your desired width
            stage.setHeight(500); // Set your desired height
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException e){
            //e.printStackTrace();
            System.out.println("error");
        }
    }
    @FXML
    public void viewCourse(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Course-Window.fxml"));

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
    public void viewStudent(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Student-table.fxml"));

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
    public void marksWindow(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("marks-window.fxml"));

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
    public void viewAttendance(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Attendace-Window.fxml"));

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

    public void viewNotice(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Notice-Window.fxml"));

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

    public void showEligibility(ActionEvent actionEvent) {

    }

    public void viewGpa(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GpaTable.fxml"));

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
//    public void initialize() {
//        DatabaseHandler databaseHandler = new DatabaseHandler();
//        String[] lecturerData = databaseHandler.getLecturerData(1); // Assuming you want data for lecturer with id 1
//        databaseHandler.closeConnection();
//
//        NameID1.setText(lecturerData[0]);
//        NameID2.setText(lecturerData[1]);
//        NameID3.setText(lecturerData[2]);
//    }
}