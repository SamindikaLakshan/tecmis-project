package org.example.tecmis.Lecture;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class NoticeController {
    @FXML
    private TableColumn<NoticeController, String> date2;

    @FXML
    private TableColumn<NoticeController, String> notice;

    @FXML
    private TableView<NoticeController> noticeTable;

    @FXML
    private TableColumn<NoticeController, String> topic;


    public void setValueFactory(){
        topic.setCellValueFactory(new PropertyValueFactory<>("topic"));
        notice.setCellValueFactory(new PropertyValueFactory<>("notice"));
        date2.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;


        String topic, notice, date;
        try{
            stmt=con.createStatement();
            String query="select * from notice";

            noticeTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                topic =rs.getString(2);
                notice =rs.getString(3);
                date =rs.getString(4);

                Notice add_record = new Notice(topic,notice,date);
                noticeTable.getItems().add(add_record);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void initialize() {
        show();
        setValueFactory();

    }
}
