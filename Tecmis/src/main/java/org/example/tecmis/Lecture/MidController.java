package org.example.tecmis.Lecture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class MidController {

    @FXML
    private TableColumn<MidController, String> midMarks;

    @FXML
    private TableView<MidController> midTable;

    @FXML
    private TableColumn<MidController, String> courseID;

    @FXML
    private TableColumn<MidController, String> studentID;

    @FXML
    private Button editMark;


    @FXML
    private Button cancelButton;

    public void setValueFactory(){
        studentID.setCellValueFactory(new PropertyValueFactory<>("Std_id"));
        courseID.setCellValueFactory(new PropertyValueFactory<>("Crs_id"));
        midMarks.setCellValueFactory(new PropertyValueFactory<>("Mid_mark"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;

        int midMark;
        String stdId, crsId;
        try{
            stmt=con.createStatement();
            String query="select * from mid";

            midTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                midMark =rs.getInt(3);
                stdId =rs.getString(4);
                crsId =rs.getString(2);

                Mid add_record = new Mid(stdId,crsId,midMark);
                midTable.getItems().add(add_record);
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
    void editMark(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditMid.fxml"));

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
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}

