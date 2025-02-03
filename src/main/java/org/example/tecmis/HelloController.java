package org.example.tecmis;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.example.tecmis.connection.DBconnection;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;


public class HelloController {
    DBconnection mdc;
    private static Pane dsPane;
    private static AnchorPane rootPane;
    private static Pane atPane;
    static Circle profile_img;


    @FXML
    private TextField unfield;

    @FXML
    private TextField passfield;
    private static Stage st;

    @FXML
    void loginreset(ActionEvent event) {
        unfield.setText("");
        passfield.setText("");
    }

    @FXML
    void UserLogin(ActionEvent event) throws SQLException {


        String un,p;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        Statement stmt = con.createStatement();
        //PreparedStatement pst;

        un = unfield.getText();
        p = passfield.getText();

        try {
            String sqlAdmin = "SELECT adm_id,adm_pass FROM admin WHERE adm_id = '" + un + "' AND adm_pass = '" + p + "'";
            String sqlStudent = "SELECT Std_id,Password FROM student WHERE Std_id = '" + un + "' AND Password = '" + p + "'";
            String sqlTechnicalOfficer = "SELECT to_id,to_password FROM tech_officer WHERE to_id = '" + un + "' AND to_password = '" + p+ "'";
            String sqlLecture = "SELECT Lec_id,password FROM lecture WHERE Lec_id = '" + un + "' AND password = '" + p + "'";

            String sql = sqlAdmin + " UNION ALL " + sqlStudent + " UNION ALL " + sqlTechnicalOfficer + " UNION ALL " + sqlLecture;

            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String flag=rs.getString(1);
                String slicedString = flag.substring(0, 2);
                User.setUser(flag);

                if(Objects.equals(slicedString,"AD")){
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("admin/admin.fxml"));
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.setTitle("Admin Dashboard");
                        stage.setWidth(1410);
                        stage.setHeight(820);
                        stage.show();
                        HelloApplication.hideWindow();
                        st=stage;

                    } catch(IOException e) {
                        e.printStackTrace();
                        System.out.println("error2");
                    }

                }
                else if(Objects.equals(slicedString,"TG")){
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("student.fxml"));
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.setTitle("Student Dashboard");
                        stage.setWidth(1000);
                        stage.setHeight(550);
                        stage.show();
                        dsPane = (Pane) root1.lookup("#dashboard");
                        rootPane=(AnchorPane) root1.lookup("#root");
                        profile_img = (Circle) root1.lookup("#profileimg");

                        HelloApplication.hideWindow();
                        st=stage;
                        load_profile.load_profile(User.getUser());

                    } catch(IOException e) {
                        e.printStackTrace();
                        System.out.println("error2");
                    }
                } else if (Objects.equals(slicedString,"TO")) {

                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("technical_officer/Dash.fxml"));
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.setTitle("TO Dashboard");
                        stage.setWidth(800);
                        stage.setHeight(500);
                        stage.show();
                        HelloApplication.hideWindow();
                        st=stage;
                    } catch(IOException e) {
                        e.printStackTrace();
                        System.out.println("error2");
                    }

                } else if (Objects.equals(slicedString,"LE")) {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Lecture/lecture.fxml"));
                        Parent root1 = fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.setTitle("Lecture Dashboard");
                        stage.setWidth(1000);
                        stage.setHeight(600);
                        stage.show();
                        HelloApplication.hideWindow();
                        st=stage;
                    } catch(IOException e) {
                        e.printStackTrace();
                        System.out.println("error2");
                    }
                }

            } else {
                Alert al=new Alert(Alert.AlertType.INFORMATION);
                al.setHeaderText("Invalid");
                al.setContentText("Invalid User name or password!");
                al.showAndWait();
            }

        }
        catch(SQLException ex) {
            System.out.println(ex);
        }






    }

    public static Circle pImage(){
        return profile_img;
    }

    public static void Cl(Pane p){
        atPane= p;
        dsPane.setVisible(false);
        rootPane.getChildren().add(p);
    }
    public static void show(){
        atPane.setVisible(false);
        dsPane.setVisible(true);

    }
    public static void closeWindow(){
        st.close();

    }

}