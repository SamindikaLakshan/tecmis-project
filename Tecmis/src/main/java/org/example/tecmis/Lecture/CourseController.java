package org.example.tecmis.Lecture;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CourseController {
    @FXML
    private Button addNew;

    @FXML
    private TableColumn<CourseController, String> courseCode;

    @FXML
    private TableColumn<CourseController, String> courseName;

    @FXML
    private TableView<CourseController> courseTable;

    @FXML
    private TableColumn<CourseController, String> credits;

    @FXML
    private Button cancelButton;

    public void setValueFactory(){
        courseCode.setCellValueFactory(new PropertyValueFactory<>("course_code"));
        courseName.setCellValueFactory(new PropertyValueFactory<>("course_name"));
        credits.setCellValueFactory(new PropertyValueFactory<>("credits"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;


        String course_code,course_name;
        int credits;
        try{
            stmt=con.createStatement();
            String query="select * from course_unit";

            courseTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                course_code =rs.getString(3);
                course_name =rs.getString(2);
                credits =rs.getInt(3);



                Courses add_record = new Courses(course_code, course_name, credits);
                courseTable.getItems().add(add_record);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void initialize() {
        show();
        setValueFactory();

    }


    @FXML
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }


    @FXML
    void newCourse(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddCourse-Window.fxml"));

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

    public void view(ActionEvent actionEvent) {
    }
}
