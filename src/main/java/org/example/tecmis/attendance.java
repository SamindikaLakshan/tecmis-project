package org.example.tecmis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.tecmis.connection.DBconnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class attendance implements Initializable{


    @FXML
    private TableView<Person> studentTable;

    @FXML
    private TableColumn<Person, String> idColumn;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, String> attendanceColumn;
    
    public void back(){
        HelloController.show();
    }

    public void displayAllStudent(){
        String id, name,attendance,count;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT course_unit.course_code,course_unit.course_name,attendance.Count FROM attendance INNER JOIN course_unit ON attendance.Crs_id = course_unit.course_code WHERE attendance.Std_id = 'TG0001'";
            ResultSet rs = stmt.executeQuery(myStatement);

            ObservableList<Person> students = FXCollections.observableArrayList();
            while (rs.next()) {
                id = rs.getString(1);
                name = rs.getString(2);
                attendance = rs.getString(3);

                System.out.println(attendance);

                Person st =new Person();
                st.setId(id);
                st.setName(name);
                st.setAttendance(attendance);
                students.add(st);

            }

            studentTable.setItems(students);
            idColumn.setCellValueFactory(f -> f.getValue().idProperty());
            nameColumn.setCellValueFactory(f -> f.getValue().nameProperty());
            attendanceColumn.setCellValueFactory(f -> f.getValue().attendanceProperty());


        } catch (SQLException e) {
            System.out.println("re");
            throw new RuntimeException(e);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayAllStudent();
    }



}



