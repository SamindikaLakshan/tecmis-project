package org.example.tecmis.Technical_officer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("Test.fxml"))));

            // Create a scene with the root node
            Scene scene = new Scene(root);

            // Set the scene to the primary stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Your Application Title"); // Set the title of the window
            primaryStage.show(); // Display the window
        } catch (IOException e) {
            e.printStackTrace(); // Print any errors if loading fails
        }
    }
}
