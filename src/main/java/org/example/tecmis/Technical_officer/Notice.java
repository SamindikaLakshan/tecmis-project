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

public class Notice {
    @FXML
    private TableView<Person> notice_table;

    @FXML
    private TableColumn<Person, String> noticeid;

    @FXML
    private TableColumn<Person, String> topic;

    @FXML
    private TableColumn<Person, String> notice;

    @FXML
    private TableColumn<Person, String> date;

    @FXML
    private Button viewButton;

    @FXML
    private Button backButton;

    @FXML
    private void handleView() {

        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        String attendence_id,a_count,student_id,cource_id;


        ObservableList<Person> tecofficer = FXCollections.observableArrayList();
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM notice";
            ResultSet rs = stmt.executeQuery(myStatement);


            while (rs.next()) {
                attendence_id = rs.getString(1);
                a_count = rs.getString(4);
                student_id = rs.getString(2);
                cource_id = rs.getString(3);
                //System.out.println(attendence_id);

                Person to =new Person();
                to.setId(attendence_id);
                to.setCount(a_count);
                to.setaddress(student_id);
                to.setcourse_id(cource_id);
                tecofficer.add(to);
            }
            notice_table.setItems(tecofficer);

            noticeid.setCellValueFactory(f -> f.getValue().idProperty());
            topic.setCellValueFactory(f -> f.getValue().addressProperty());
            notice.setCellValueFactory(f -> f.getValue().course_idProperty());
            date.setCellValueFactory(f -> f.getValue().countProperty());

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

