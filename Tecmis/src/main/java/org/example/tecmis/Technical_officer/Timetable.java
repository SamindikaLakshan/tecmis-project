package org.example.tecmis.Technical_officer;

import org.example.tecmis.connection.DBconnection;
import org.example.tecmis.Technical_officer.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

public class Timetable {

    @FXML
    private TableView<Person> time_table;
    ;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<Person, String> courceid;

    @FXML
    private TableColumn<Person, String> friid;

    @FXML
    private TableColumn<Person, String> lecid;

    @FXML
    private TableColumn<Person, String> monid;

    @FXML
    private TableColumn<Person, String> thurid;


    @FXML
    private TableColumn<Person, String> tueid;

    @FXML
    private TableColumn<Person, String> wedid;



    @FXML
    void handleView(ActionEvent event) {
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        String cource_id,lec_id,mon_id,tue_id,wed_id,thur_id,fri_id;


        ObservableList<Person> tecofficer = FXCollections.observableArrayList();
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM timetable";
            ResultSet rs = stmt.executeQuery(myStatement);


            while (rs.next()) {
                cource_id = rs.getString(1);
                lec_id = rs.getString(2);
                mon_id = rs.getString(3);
                tue_id = rs.getString(4);
                wed_id = rs.getString(5);
                thur_id = rs.getString(6);
                fri_id = rs.getString(7);

                Person to = new Person();
                to.setcourse_id(cource_id);
                to.setlectureId(lec_id);
                to.setmon(mon_id);
                to.settue(tue_id);
                to.setwed(wed_id);
                to.setthu(thur_id);
                to.setfri(fri_id);
                tecofficer.add(to);
            }
            time_table.setItems(tecofficer);

            courceid.setCellValueFactory(f -> f.getValue().course_idProperty());
            lecid.setCellValueFactory(f -> f.getValue().lecProperty());
            monid.setCellValueFactory(f -> f.getValue().monProperty());
            tueid.setCellValueFactory(f -> f.getValue().tueProperty());
            wedid.setCellValueFactory(f -> f.getValue().wedProperty());
            thurid.setCellValueFactory(f -> f.getValue().thuProperty());
            friid.setCellValueFactory(f -> f.getValue().friProperty());


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

