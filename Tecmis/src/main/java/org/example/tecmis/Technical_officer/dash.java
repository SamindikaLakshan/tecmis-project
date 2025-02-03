package org.example.tecmis.Technical_officer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.example.tecmis.HelloApplication;
import org.example.tecmis.HelloController;

import java.io.IOException;
import java.util.Objects;

public class dash {

    @FXML
    private Button profileButton;

//    public static void main(String[] args) {
//        launch();
//    }

//    @Override
//    public void start(Stage primaryStage)  {
//        try {
//            // Load the FXML file
//            Parent root = FXMLLoader.load(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("Dash.fxml"))));
//
//            // Create a scene with the root node
//            Scene scene = new Scene(root);
//
//            // Set the scene to the primary stage
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("TECMIS"); // Set the title of the window
//            primaryStage.show(); // Display the window
//        } catch (IOException e) {
//            e.printStackTrace(); // Print any errors if loading fails
//        }
//    }
    public void Profilebtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Officerview.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void Profileupdatebtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Profileupdate.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void Viewattendencebtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Attendenceview.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void Updateattendencebtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Attedenceupdate.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }

    public void Viewmedicalbtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Viewmedical.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }

    public void Updatemedicalbtn(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Updatemedical.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }

    public void Viewnotice(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Notice.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }

    public void Viewtimetable(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Timetable.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }
    }


    public void logOut(ActionEvent actionEvent) {
        HelloController.closeWindow();
        HelloApplication.showWindow();
    }
}

