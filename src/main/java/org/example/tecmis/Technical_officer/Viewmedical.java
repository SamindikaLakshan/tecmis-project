package org.example.tecmis.Technical_officer;

import org.example.tecmis.connection.DBconnection;
import org.example.tecmis.Technical_officer.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Viewmedical {

    @FXML
    private TableView<Person> medical_table;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<Person, String> corceid;

    @FXML
    private TableColumn<Person, String> count;

    @FXML
    private TableColumn<Person, String> medicalid;

    @FXML
    private TableColumn<Person, String> studentid;

    @FXML
    private Button viewButton;

    @FXML
    private void handleView() {

        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        String medical_id,a_count,student_id,cource_id;


        ObservableList<Person> tecofficer = FXCollections.observableArrayList();
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM medical";
            ResultSet rs = stmt.executeQuery(myStatement);


            while (rs.next()) {
                medical_id = rs.getString(1);
                a_count = rs.getString(4);
                student_id = rs.getString(2);
                cource_id = rs.getString(3);
                //System.out.println(attendence_id);

                Person to =new Person();
                to.setId(medical_id);
                to.setCount(a_count);
                to.setaddress(student_id);
                to.setcourse_id(cource_id);
                tecofficer.add(to);
            }
            medical_table.setItems(tecofficer);

            medicalid.setCellValueFactory(f -> f.getValue().idProperty());
            count.setCellValueFactory(f -> f.getValue().addressProperty());
            studentid.setCellValueFactory(f -> f.getValue().course_idProperty());
            corceid.setCellValueFactory(f -> f.getValue().countProperty());

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
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




