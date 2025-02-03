package org.example.tecmis.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

public class DBconnection {
    private String url="jdbc:mysql://localhost:3306/tecmis";
    private String user="root";
    private String pass="";

    private Connection con=null;

    private void regConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successfully connect");
        }
        catch(ClassNotFoundException e) {
            throw new RuntimeException("Error in registring the Driver class.. "+e.getMessage());
        }
    }

    public Connection getMyConnection(){
        regConnection();

        try{
            con= DriverManager.getConnection(url,user,pass);
        }
        catch (SQLException e){
            System.out.println("Error in getting Connection! ");
        }
        return con;

    }
}
