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

public class AssignmentController {

    @FXML
    private TableColumn<AssignmentController, String> assignmentMarks;

    @FXML
    private TableColumn<AssignmentController, String> assignmentNo;

    @FXML
    private TableView<AssignmentController> assignmentTable;

    @FXML
    private TableColumn<AssignmentController, String> courseID;

    @FXML
    private TableColumn<AssignmentController, String> studentID;

    @FXML
    private Button editMark;


    @FXML
    private Button cancelButton;

    public void setValueFactory(){
        studentID.setCellValueFactory(new PropertyValueFactory<>("Std_id"));
        courseID.setCellValueFactory(new PropertyValueFactory<>("Crs_id"));
        assignmentNo.setCellValueFactory(new PropertyValueFactory<>("Asm_no"));
        assignmentMarks.setCellValueFactory(new PropertyValueFactory<>("Asm_mark"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;

        int asmNo, asmMark;
        String stdId, crsId;
        try{
            stmt=con.createStatement();
            String query="select * from assignment";

            assignmentTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                asmNo=rs.getInt(2);
                asmMark =rs.getInt(3);
                stdId =rs.getString(4);
                crsId =rs.getString(5);

                asiignment add_record = new asiignment(stdId,crsId,asmNo,asmMark);
                assignmentTable.getItems().add(add_record);
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
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditAssignment.fxml"));

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

