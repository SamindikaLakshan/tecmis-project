package org.example.tecmis.Lecture;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class studentTable {
    @FXML
    private TableColumn<studentTable, String> stCColumn;

    @FXML
    private TableColumn<studentTable, String> stDColumn;

    @FXML
    private TableColumn<studentTable, String> stEcolumn;

    @FXML
    private TableColumn<studentTable, String> stIDColumn;

    @FXML
    private TableColumn<studentTable, String> stNColumn;

    @FXML
    private TableColumn<studentTable, String> stNICColumn;

    @FXML
    private TableColumn<studentTable, String> stSColumn;

    @FXML
    private TableView<studentTable> studentsTable;

    public void setValueFactory(){
        stIDColumn.setCellValueFactory(new PropertyValueFactory<>("Std_id"));
        stNColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        stNICColumn.setCellValueFactory(new PropertyValueFactory<>("NIC"));
        stEcolumn.setCellValueFactory(new PropertyValueFactory<>("Email"));
        stCColumn.setCellValueFactory(new PropertyValueFactory<>("Contact"));
        stSColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));
        stDColumn.setCellValueFactory(new PropertyValueFactory<>("Dep_id"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;


        String stdId, name, email, contact, status, dep_id, nic;
        try{
            stmt=con.createStatement();
            String query="select * from student";

            studentsTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                stdId =rs.getString(3);
                name =rs.getString(2);
                email =rs.getString(3);
                contact =rs.getString(4);
                nic =rs.getString(5);
                status =rs.getString(7);
                dep_id =rs.getString(8);


                StudentDetails add_record = new StudentDetails(stdId, name, email, contact, nic, status, dep_id);
                studentsTable.getItems().add(add_record);
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

