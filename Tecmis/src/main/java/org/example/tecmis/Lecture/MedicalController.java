package org.example.tecmis.Lecture;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicalController {

    @FXML
    private TableColumn<MedicalController, String> count;

    @FXML
    private TableColumn<MedicalController, String> crsid;

    @FXML
    private TableView<MedicalController> medicalTable;

    @FXML
    private TableColumn<MedicalController, String> stdid;

    @FXML
    private Button cancelButton;

    public void setValueFactory(){
        stdid.setCellValueFactory(new PropertyValueFactory<>("Std_id"));
        crsid.setCellValueFactory(new PropertyValueFactory<>("Crs_id"));
        count.setCellValueFactory(new PropertyValueFactory<>("Count"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;


        String stdId, crsId, count;
        try{
            stmt=con.createStatement();
            String query="select * from medical";

            medicalTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                count =rs.getString(2);
                stdId =rs.getString(3);
                crsId =rs.getString(4);

                Medical add_record = new Medical(stdId,crsId,count);
                medicalTable.getItems().add(add_record);
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
}
