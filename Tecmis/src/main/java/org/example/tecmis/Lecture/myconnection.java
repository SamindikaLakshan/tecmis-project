package org.example.tecmis.Lecture;

//import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class myconnection {

    private String url="jdbc:mysql://localhost:3306/tecmis";
    private String user="root";
    private String password="";
    private Connection con=null;

    public void RegMyConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection successfull!");
        }
        catch(ClassNotFoundException e) {
            throw new RuntimeException("Error: Driver not found!"+e.getMessage());
        }
    }

    public Connection GetMyConnection() {
        RegMyConnection();

        try {
            con= DriverManager.getConnection(url,user,password);
        }
        catch(SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }

        return con;
    }
}
