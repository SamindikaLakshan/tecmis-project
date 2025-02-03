package org.example.tecmis;

import org.example.tecmis.connection.DBconnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class gpa implements Initializable {

    @FXML
    private Label gpa;

    @FXML
    private Label s_name;

    @FXML
    private Label st_id;

//    @FXML
//    private VBox details;
    @FXML
    private Pane pane;

    @FXML
    void back() {
        HelloController.show();
    }

    void student_gpa(){
        String total_credit = null, s_id = null, num_course = null, std_name = null;
        int c_credit;
        DBconnection mdc;

        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();
        try {
            String myStatement = "SELECT s.Std_id, s.name, SUM(g.points) AS total_points FROM student s JOIN grads g ON s.Std_id = g.Std_id WHERE s.Std_id = ? GROUP BY s.Std_id, s.name";
            String myStatement2 = "SELECT COUNT(Crs_id) FROM grads WHERE Std_id=?";

            PreparedStatement pstmt = con.prepareStatement(myStatement);
            pstmt.setString(1, User.getUser());

            PreparedStatement pstmt2 = con.prepareStatement(myStatement2);
            pstmt2.setString(1, User.getUser());

            ResultSet rs1 = pstmt.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();

            while (rs1.next()) {
                s_id = rs1.getString(1);
                std_name = rs1.getString(2);
                total_credit = rs1.getString(3);
            }

            while (rs2.next()) {
                num_course = rs2.getString(1);
            }

            float st_gpa = Float.parseFloat(total_credit) / Float.parseFloat(num_course);
            String formattedGPA = String.format("%.2f", st_gpa);
            gpa.setText(formattedGPA);
            s_name.setText(std_name);
            st_id.setText(s_id);

            showResult();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        student_gpa();
    }

    public void showResult(){

        try {
             String c_name,c_id,grade;
            int c_credit;
            DBconnection mdc;

            mdc = new DBconnection();
            Connection con = mdc.getMyConnection();
            Statement stmt;
            stmt = con.createStatement();
            String myStatement = "SELECT g.Crs_id, c.course_name, g.grade FROM grads g JOIN course_unit c ON g.Crs_id = c.course_code WHERE g.Std_id = 'TG0001'";
            ResultSet rs = stmt.executeQuery(myStatement);

            int i=0;
            while (rs.next()) {

                c_name= rs.getString(2) ;
                grade=rs.getString(3);
                c_id=rs.getString(1);


                Label label = new Label(c_id);
                Label label2 = new Label( c_name);
                Label label3 = new Label( grade);


                label.setLayoutX(0);
                label.setLayoutY(50 + i * 30);

                label2.setLayoutX(150);
                label2.setLayoutY(50 + i * 30);

                label3.setLayoutX(500);
                label3.setLayoutY(50 + i * 30);

                pane.getChildren().addAll(label,label2,label3);

                i++;


            }


    } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
