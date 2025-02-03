package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MarksController {

    @FXML
    private Button assignment;

    @FXML
    private Button endTheory;

    @FXML
    private Button entPractical;

    @FXML
    private Button finalMarks;

    @FXML
    private Button home;

    @FXML
    private Button mid;

    @FXML
    private Button quiz;

    @FXML
    public void viewAssignment(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("assignment-window.fxml"));

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
    public void viewQuiz(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Quiz-window.fxml"));

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
    public void viewMid(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Mid-window.fxml"));

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
    public void viewEndTheory(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("End-Theory-Window.fxml"));

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
    public void viewEndPractical(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("End-Practical-Window.fxml"));

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
    public void viewFinalMarks(ActionEvent actionEvent) {
    }
}
