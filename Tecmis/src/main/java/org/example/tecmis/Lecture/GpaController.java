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

public class GpaController {
    @FXML
    private Button cancelButton;

    @FXML
    private TableColumn<GpaController, String> gpa1;

    @FXML
    private TableView<GpaController> gpaTable;

    @FXML
    private TableColumn<GpaController, String> stdID;

    @FXML
    private TableColumn<GpaController, String> stdName;

    public void setValueFactory(){
        stdID.setCellValueFactory(new PropertyValueFactory<>("course_code"));
        stdName.setCellValueFactory(new PropertyValueFactory<>("course_name"));
        gpa1.setCellValueFactory(new PropertyValueFactory<>("credits"));

    }


    public void viewGpa() throws SQLException {

        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;

        String s_id = null,num_course = null,std_name = null;
        int c_credit;
        float total_credit =0,gpa;
        try {
            stmt = con.createStatement();

            String myStatement = "SELECT s.Std_id, s.name, (SELECT SUM(g.points) FROM grads g WHERE g.Std_id = s.Std_id) AS total_points, (SELECT COUNT(course_code) FROM course_unit) AS total_courses FROM student s";
            ResultSet rs1 = stmt.executeQuery(myStatement);

            while (rs1.next()) {
                s_id = rs1.getString(1);
                std_name=rs1.getString(2);
                total_credit = rs1.getFloat(3);
                c_credit=rs1.getInt(4);
                System.out.println(s_id);
                System.out.println(std_name);
                gpa=total_credit/c_credit;
                System.out.println(gpa);

                Gpa add_record = new Gpa(s_id,std_name,gpa);
                gpaTable.getItems().add(add_record);

            }

            


    }
    catch (SQLException e) {
        throw new RuntimeException(e);
    }

    }
    @FXML
    public void cancelMe(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void initialize() throws SQLException {
        //viewGpa();

    }

    public void view(ActionEvent actionEvent) throws SQLException {
        viewGpa();
        setValueFactory();
    }


}