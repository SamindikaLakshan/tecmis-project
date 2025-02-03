package org.example.tecmis;
import org.example.tecmis.connection.DBconnection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class time_table implements Initializable {
    @FXML
    private TableColumn<Person, String> friday;

    @FXML
    private TableColumn<Person, String> idColumn;

    @FXML
    private TableColumn<Person, String> monday;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, String> thursday;

    @FXML
    private TableView<Person> timeTable;

    @FXML
    private TableColumn<Person, String> tuesday;

    @FXML
    private TableColumn<Person, String> wednesday;

    public void timeTable(){
        String c_id, lecture,mon,tue,wen,thu,fri;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM timetable";
            ResultSet rs = stmt.executeQuery(myStatement);

            ObservableList<Person> students = FXCollections.observableArrayList();
            while (rs.next()) {
                c_id = rs.getString(1);
                lecture = rs.getString(2);
                mon = rs.getString(3);
                tue = rs.getString(4);
                wen = rs.getString(5);
                thu = rs.getString(6);
                fri = rs.getString(7);


                Person st =new Person();
                st.setId(c_id);
                st.setName(lecture);
                st.setMon(mon);
                st.setTue(tue);
                st.setWen(wen);
                st.setThu(thu);
                st.setFri(fri);
                students.add(st);

            }

            timeTable.setItems(students);
            idColumn.setCellValueFactory(f -> f.getValue().idProperty());
            nameColumn.setCellValueFactory(f -> f.getValue().nameProperty());
            monday.setCellValueFactory(f -> f.getValue().monProperty());
            tuesday.setCellValueFactory(f -> f.getValue().tueProperty());
            wednesday.setCellValueFactory(f -> f.getValue().wenProperty());
            thursday.setCellValueFactory(f -> f.getValue().thuProperty());
            friday.setCellValueFactory(f -> f.getValue().friProperty());



        } catch (SQLException e) {
            System.out.println("err");
            throw new RuntimeException(e);
        }
    }



    @FXML
    void back(ActionEvent event) {
        HelloController.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeTable();
    }
}
