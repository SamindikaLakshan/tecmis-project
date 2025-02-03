package org.example.tecmis;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;

public class Student extends Application {

    private static Pane dsPane;
    private static AnchorPane rootPane;
    private static Pane atPane;
    static Circle profile_img;




    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Student.class.getResource("student.fxml"));
        Scene student = new Scene(fxmlLoader.load(), 1000, 500);
        stage.setTitle("Student");
        stage.setScene(student);
        stage.show();
        dsPane = (Pane) student.lookup("#dashboard");
        rootPane=(AnchorPane) student.lookup("#root");
        profile_img = (Circle) student.lookup("#profileimg");

        String st_id="TG0008";
        load_profile.load_profile(st_id);

    }
    public static Circle pImage(){
        return profile_img;
    }

    public static void Cl(Pane p){
        atPane= p;
        dsPane.setVisible(false);
        rootPane.getChildren().add(p);
    }
    public static void show(){
        atPane.setVisible(false);
        dsPane.setVisible(true);

    }


    public static void main(String[] args) {
        launch();
    }


}
