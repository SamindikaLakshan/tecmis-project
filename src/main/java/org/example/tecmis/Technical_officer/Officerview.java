package org.example.tecmis.Technical_officer;

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
import org.example.tecmis.connection.DBconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Officerview {

    @FXML
    private TableView<Person> officerdetailtable;

    @FXML
    private TableColumn<Person, String> userid;

    @FXML
    private TableColumn<Person, String> username;

    @FXML
    private TableColumn<Person, String> userpwd;

    @FXML
    private TableColumn<Person, String> usercontact;

    @FXML
    private TableColumn<Person, String> useremail;
    @FXML
    private Button viewButton;

    @FXML
    private Button backButton;

    @FXML
    private TableView<User> tableView; // Assuming User is your model class



    // Method to handle VIEW button click
    @FXML
    private void handleView() {

        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        String name,id,pwd,contact,email;


        ObservableList<Person> tecofficer = FXCollections.observableArrayList();
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM tech_officer";
            ResultSet rs = stmt.executeQuery(myStatement);


            while (rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                pwd = rs.getString(3);
                contact = rs.getString(4);
                email = rs.getString(5);
                //System.out.println(name);

                Person to =new Person();
                to.setId(id);
                to.setName(name);
                to.setaddress(String.valueOf(pwd));
                to.setContact(contact);
                to.setEmail(email);
                tecofficer.add(to);
            }
            officerdetailtable.setItems(tecofficer);
            userid.setCellValueFactory(f -> f.getValue().idProperty());
            username.setCellValueFactory(f -> f.getValue().nameProperty());
            userpwd.setCellValueFactory(f -> f.getValue().addressProperty());
            usercontact.setCellValueFactory(f -> f.getValue().user_contactProperty());
            useremail.setCellValueFactory(f -> f.getValue().user_emailProperty());

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
