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

public class medical implements Initializable {
    @FXML
    private TableView<Person> medical;

    @FXML
    private TableColumn<Person, String> medical_count;

    @FXML
    private TableColumn<Person, String> s_id;

    @FXML
    private TableColumn<Person, String> s_name;
    public void back() {
        HelloController.show();
    }

    public void medical(){
        String c_id, m_count,c_name;
        int c_credit;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String myStatement = "SELECT cu.course_name, m.Crs_id, m.Count FROM medical m JOIN course_unit cu ON m.Crs_id = cu.course_code WHERE m.Std_id = 'TG0010'";
            ResultSet rs = stmt.executeQuery(myStatement);

            ObservableList<Person> students = FXCollections.observableArrayList();
            while (rs.next()) {
                c_id = rs.getString(1);
                m_count = rs.getString(2);
                c_name = rs.getString(3);


                Person st =new Person();
                st.setId(c_id);
                st.setName(c_name);
                st.setaddress(String.valueOf(m_count));
                students.add(st);

            }

            medical.setItems(students);
            s_name.setCellValueFactory(f -> f.getValue().idProperty());
            s_id.setCellValueFactory(f -> f.getValue().addressProperty());
            medical_count.setCellValueFactory(f -> f.getValue().nameProperty());


        } catch (SQLException e) {
            System.out.println("err");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        medical();
    }
}
