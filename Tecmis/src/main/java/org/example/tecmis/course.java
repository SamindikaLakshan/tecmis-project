package org.example.tecmis;

import org.example.tecmis.connection.DBconnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class course implements Initializable {
    @FXML
    private TableView<Person> course_unit;
    @FXML
    private TableColumn<Person, String> s_credit;

    @FXML
    private TableColumn<Person, String> s_id;

    @FXML
    private TableColumn<Person, String> s_name;
    public void back(ActionEvent actionEvent) {
        HelloController.show();
    }


    public void displayAllStudent(){
        String c_id, c_name;
        int c_credit;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT * FROM course_unit";
            ResultSet rs = stmt.executeQuery(myStatement);

            ObservableList<Person> students = FXCollections.observableArrayList();
            while (rs.next()) {
                c_id = rs.getString(1);
                c_name = rs.getString(2);
                c_credit = rs.getInt(3);

                Person st =new Person();
                st.setId(c_id);
                st.setName(c_name);
                st.setaddress(String.valueOf(c_credit));
                students.add(st);

            }

            course_unit.setItems(students);
            s_id.setCellValueFactory(f -> f.getValue().idProperty());
            s_name.setCellValueFactory(f -> f.getValue().nameProperty());
            s_credit.setCellValueFactory(f -> f.getValue().addressProperty());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayAllStudent();
    }


}
