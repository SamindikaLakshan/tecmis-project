package org.example.tecmis;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.tecmis.connection.DBconnection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

//import java.awt.Label;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminCtrl {

    DBconnection mdc;

    //pane variables-------------------------------------------------------------------
    @FXML
    private Pane adminaccountpane;

    @FXML
    private Pane dashpane;


    @FXML
    private Pane profilesettingpane;

    @FXML
    private Pane accountsettingspane;

    @FXML
    private Pane toaccountpane;

    @FXML
    private Pane lecaccountpane;

    @FXML
    private Pane studentaccountpane;

    @FXML
    private Pane coursesettingpane;

    @FXML
    private Pane accountsettingspane1;

    @FXML
    private Pane courseaccountpane;

    @FXML
    private Pane timetablesettingpane;

    @FXML
    private Pane accountsettingspane11;

    @FXML
    private Pane timetablepane;

    @FXML
    private Pane noticesettingpane;

    @FXML
    private Pane accountsettingspane12;

    @FXML
    private Pane noticepane;




    //admin variables----------------------------------------------------------

    @FXML
    private TextField acon;

    @FXML
    private TextField aid;

    @FXML
    private TextField amail;

    @FXML
    private TextField aname;

    @FXML
    private TextField apass;

    @FXML
    private TableView<Admintbl> admintable;

    @FXML
    private TableColumn<Admintbl, String> aidcol;

    @FXML
    private TableColumn<Admintbl, String> anamecol;

    @FXML
    private TableColumn<Admintbl, String> amailcol;

    @FXML
    private TableColumn<Admintbl, String> apasscol;

    @FXML
    private TableColumn<Admintbl, String> aconcol;

    //TO variables---------------------------------------------------------------------
    @FXML
    private TextField tocon;

    @FXML
    private TextField toid;

    @FXML
    private TextField tomail;

    @FXML
    private TextField toname;

    @FXML
    private TextField topass;

    @FXML
    private TableView<Totbl> totable;

    @FXML
    private TableColumn<Totbl, String> toidcol;

    @FXML
    private TableColumn<Totbl, String> tonamecol;

    @FXML
    private TableColumn<Totbl, String> tomailcol;

    @FXML
    private TableColumn<Totbl, String> topasscol;

    @FXML
    private TableColumn<Totbl, String> toconcol;

    //lec variables
    @FXML
    private TextField leccon;

    @FXML
    private TextField lecid;

    @FXML
    private TextField lecmail;

    @FXML
    private TextField lecname;

    @FXML
    private TextField lecpass;

    @FXML
    private TableView<Lectbl> lectable;

    @FXML
    private TableColumn<Lectbl, String> lecidcol;

    @FXML
    private TableColumn<Lectbl, String> lecnamecol;

    @FXML
    private TableColumn<Lectbl, String> lecmailcol;

    @FXML
    private TableColumn<Lectbl, String> lecpasscol;

    @FXML
    private TableColumn<Lectbl, String> lecconcol;

    //student variables-----------------------------------------------------
    @FXML
    private TextField stcon;

    @FXML
    private TextField stid;

    @FXML
    private TextField stmail;

    @FXML
    private TextField stname;

    @FXML
    private TextField stpass;

    @FXML
    private TextField stnic;

    @FXML
    private TableView<Sttbl> sttable;

    @FXML
    private TableColumn<Sttbl, String> stidcol;

    @FXML
    private TableColumn<Sttbl, String> stnamecol;

    @FXML
    private TableColumn<Sttbl, String> stmailcol;

    @FXML
    private TableColumn<Sttbl, String> stpasscol;

    @FXML
    private TableColumn<Sttbl, String> stconcol;

    @FXML
    private TableColumn<Sttbl, String> stniccol;

    //course variables
    @FXML
    private TextField cid;

    @FXML
    private TextField cname;

    @FXML
    private TextField ccredit;

    @FXML
    private TableView<Crstbl> coursetable;

    @FXML
    private TableColumn<Crstbl, String> cidcol;

    @FXML
    private TableColumn<Crstbl, String>cnamecol;

    @FXML
    private TableColumn<Crstbl, String> ccreditcol;

    //time table variables--------------------------------------------------------------
    @FXML
    private TextField tid;

    @FXML
    private TextField tname;

    @FXML
    private TextArea tmon;

    @FXML
    private TextArea tt;

    @FXML
    private TextArea tw;

    @FXML
    private TextArea tthu;

    @FXML
    private TextArea tf;

    @FXML
    private TableView<Timetbl> timetabletable;

    @FXML
    private TableColumn<Timetbl, String> tidcol;

    @FXML
    private TableColumn<Timetbl, String> tnamecol;

    @FXML
    private TableColumn<Timetbl, String> moncol;

    @FXML
    private TableColumn<Timetbl, String> tuecol;

    @FXML
    private TableColumn<Timetbl, String> wedcol;

    @FXML
    private TableColumn<Timetbl, String> thucol;

    @FXML
    private TableColumn<Timetbl, String> fricol;

    //notice variables-------------------------------------------------------------------

    @FXML
    private TextField nhead;

    @FXML
    private TextArea ndes;

    @FXML
    private TableView<Noticetbl> noticetable;

    @FXML
    private TableColumn<Noticetbl, String> nidcol;

    @FXML
    private TableColumn<Noticetbl, String> nheadercol;

    @FXML
    private TableColumn<Noticetbl, String> ndescol;

    @FXML
    private TableColumn<Noticetbl, String> ndatecol;

    //pane controls----------------------------------------------------------------------
    @FXML
    void profile_settings(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(true);
        accountsettingspane.setVisible(true);
        adminaccountpane.setVisible(true);
    }


    @FXML
    void adminaccountsbtn(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(true);
        accountsettingspane.setVisible(true);
        adminaccountpane.setVisible(true);
    }

    @FXML
    void toaccountsbtn(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(true);
        accountsettingspane.setVisible(true);
        adminaccountpane.setVisible(false);
        toaccountpane.setVisible(true);
    }

    @FXML
    void lecaccountsbtn(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(true);
        accountsettingspane.setVisible(true);
        adminaccountpane.setVisible(false);
        toaccountpane.setVisible(false);
        lecaccountpane.setVisible(true);
    }

    @FXML
    void studentaccountsbtn(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(true);
        accountsettingspane.setVisible(true);
        adminaccountpane.setVisible(false);
        toaccountpane.setVisible(false);
        lecaccountpane.setVisible(false);
        studentaccountpane.setVisible(true);
    }

    @FXML
    void course_settings(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(false);
        coursesettingpane.setVisible(true);
        accountsettingspane1.setVisible(true);
        courseaccountpane.setVisible(true);
    }

    @FXML
    void timetable_settings(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(false);
        coursesettingpane.setVisible(false);
        timetablesettingpane.setVisible(true);
        accountsettingspane11.setVisible(true);
        timetablepane.setVisible(true);
    }

    @FXML
    void notice_settings(ActionEvent event) {
        dashpane.setVisible(false);
        profilesettingpane.setVisible(false);
        coursesettingpane.setVisible(false);
        timetablesettingpane.setVisible(false);
        noticesettingpane.setVisible(true);
        accountsettingspane12.setVisible(true);
        noticepane.setVisible(true);
    }

    //back buttons
    @FXML
    void profiletodash(ActionEvent event) {
        dashpane.setVisible(true);
    }

    @FXML
    void coursetodash(ActionEvent event) {
        dashpane.setVisible(true);
    }

    @FXML
    void timetodash(ActionEvent event) {
        dashpane.setVisible(true);
    }

    @FXML
    void noticetodash(ActionEvent event) {
        dashpane.setVisible(true);
    }


    //admin pane button controls----------------------------------------------------------------
    @FXML
    void createadminbtn(ActionEvent event) {
        String a_id,a_name,a_mail,a_pass,a_con;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        a_id = aid.getText();
        a_name = aname.getText();
        a_mail = amail.getText();
        a_pass = apass.getText();
        a_con = acon.getText();

        if(Objects.equals(a_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(a_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("insert into admin(adm_id,adm_name,adm_mail,adm_pass,adm_contact)values(?,?,?,?,?)");
                pst.setString(1, a_id);
                pst.setString(2, a_name);
                pst.setString(3, a_mail);
                pst.setString(4, a_pass);
                pst.setString(5, a_con);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Registation");

                alert.setHeaderText("Student Registation");
                alert.setContentText("Record Addedddd!");
                alert.showAndWait();
                table();

                aid.setText("");
                aname.setText("");
                amail.setText("");
                apass.setText("");
                acon.setText("");
                aname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void updateadminbtn(ActionEvent event) {
        String a_id,a_name,a_mail,a_pass,a_con;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        a_id = aid.getText();
        a_name = aname.getText();
        a_mail = amail.getText();
        a_pass = apass.getText();
        a_con = acon.getText();

        if(Objects.equals(a_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(a_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("update admin set adm_name=?,adm_mail=?,adm_pass=?,adm_contact=? where adm_id=?");
                pst.setString(1, a_name);
                pst.setString(2, a_mail);
                pst.setString(3, a_pass);
                pst.setInt(4, Integer.parseInt(a_con));
                pst.setString(5, a_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Update");

                alert.setHeaderText("Student Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                table();

                aid.setText("");
                aname.setText("");
                amail.setText("");
                apass.setText("");
                acon.setText("");
                aname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }

    }

    @FXML
    void deleteadminbtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String adm_id;
        adm_id=aid.getText();

        if(Objects.equals(adm_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from admin where adm_id = ? ");
                pst.setString(1, adm_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Registationn");

                alert.setHeaderText("Student Registation");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                table();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void adminreset(ActionEvent event) {
        aid.setText("");
        aname.setText("");
        amail.setText("");
        apass.setText("");
        acon.setText("");
    }

    //topane button controls-----------------------------------------------------------------

    @FXML
    void createtobtn(ActionEvent event) {
        String to_id,to_name,to_mail,to_pass,to_con;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        to_id = toid.getText();
        to_name = toname.getText();
        to_mail = tomail.getText();
        to_pass = topass.getText();
        to_con = tocon.getText();

        if(Objects.equals(to_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(to_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("insert into tech_officer values(?,?,?,?,?)");
                pst.setString(1, to_id);
                pst.setString(2, to_name);
                pst.setString(3, to_mail);
                pst.setString(4, to_pass);
                pst.setString(5, to_con);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Technical officer Registation");

                alert.setHeaderText("Technical officer Registation");
                alert.setContentText("Record Addedddd!");
                alert.showAndWait();
                tableto();

                toid.setText("");
                toname.setText("");
                tomail.setText("");
                topass.setText("");
                tocon.setText("");
                toname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }

    }

    @FXML
    void updatetobtn(ActionEvent event) {
        String to_id,to_name,to_mail,to_pass,to_con;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        to_id = toid.getText();
        to_name = toname.getText();
        to_mail = tomail.getText();
        to_pass = topass.getText();
        to_con = tocon.getText();

        if(Objects.equals(to_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(to_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("update tech_officer set to_name=?,to_mail=?,to_password=?,to_contact=? where to_id=?");
                pst.setString(1, to_name);
                pst.setString(2, to_mail);
                pst.setString(3, to_pass);
                pst.setInt(4, Integer.parseInt(to_con));
                pst.setString(5, to_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Technical officer Update");

                alert.setHeaderText("Technical officer Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                tableto();

                toid.setText("");
                toname.setText("");
                tomail.setText("");
                topass.setText("");
                tocon.setText("");
                toname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void deletetobtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String to_id;
        to_id=toid.getText();

        if(Objects.equals(to_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from tech_officer where to_id = ? ");
                pst.setString(1, to_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Technical officer Deletetion");

                alert.setHeaderText("Technical officer Deletion");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                tableto();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void toreset(ActionEvent event) {
        toid.setText("");
        toname.setText("");
        tomail.setText("");
        topass.setText("");
        tocon.setText("");
    }

    //Lec pane button controls----------------------------------------------------
    @FXML
    void createlecbtn(ActionEvent event) {
        String lec_id,lec_name,lec_mail,lec_pass,lec_con;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        lec_id = lecid.getText();
        lec_name = lecname.getText();
        lec_mail = lecmail.getText();
        lec_pass = lecpass.getText();
        lec_con = leccon.getText();

        if(Objects.equals(lec_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(lec_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("insert into lecture values(?,?,?,?,?)");
                pst.setString(1, lec_id);
                pst.setString(2, lec_name);
                pst.setString(3, lec_mail);
                pst.setString(4, lec_pass);
                pst.setString(5, lec_con);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Lecturer Registation");

                alert.setHeaderText("Lecturer Registation");
                alert.setContentText("Record Addedddd!");
                alert.showAndWait();
                tablelec();

                lecid.setText("");
                lecname.setText("");
                lecmail.setText("");
                lecpass.setText("");
                leccon.setText("");
                lecname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }

    }

    @FXML
    void updatelecbtn(ActionEvent event) {
        String lec_id,lec_name,lec_mail,lec_pass,lec_con;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        lec_id = lecid.getText();
        lec_name = lecname.getText();
        lec_mail = lecmail.getText();
        lec_pass = lecpass.getText();
        lec_con = leccon.getText();

        if(Objects.equals(lec_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(lec_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("update lecture set Name=?,Email=?,password=?,Contact=? where Lec_id=?");
                pst.setString(1, lec_name);
                pst.setString(2, lec_mail);
                pst.setString(3, lec_pass);
                pst.setInt(4, Integer.parseInt(lec_con));
                pst.setString(5, lec_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Lecturer Update");

                alert.setHeaderText("Lecturer Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                tablelec();

                lecid.setText("");
                lecname.setText("");
                lecmail.setText("");
                lecpass.setText("");
                leccon.setText("");
                lecname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void deletelecbtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String lec_id;
        lec_id=lecid.getText();

        if(Objects.equals(lec_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from lecture where Lec_id = ? ");
                pst.setString(1, lec_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Lecturer Deletetion");

                alert.setHeaderText("Lecturer Deletion");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                tablelec();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void lecreset(ActionEvent event) {
        lecid.setText("");
        lecname.setText("");
        lecmail.setText("");
        lecpass.setText("");
        leccon.setText("");
    }

    //student pane button controls----------------------------------------------
    @FXML
    void createstbtn(ActionEvent event) {
        String st_id,st_name,st_mail,st_pass,st_con,st_nic;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        st_id = stid.getText();
        st_name = stname.getText();
        st_mail = stmail.getText();
        st_pass = stpass.getText();
        st_con = stcon.getText();
        st_nic = stnic.getText();

        if(Objects.equals(st_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(st_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("insert into student(Std_id,Name,Email,Password,Contact,NIC)values(?,?,?,?,?,?)");
                pst.setString(1, st_id);
                pst.setString(2, st_name);
                pst.setString(3, st_mail);
                pst.setString(4, st_pass);
                pst.setString(5, st_con);
                pst.setString(6, st_nic);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Registation");

                alert.setHeaderText("Student Registation");
                alert.setContentText("Record Addedddd!");
                alert.showAndWait();
                tablest();

                stid.setText("");
                stname.setText("");
                stmail.setText("");
                stpass.setText("");
                stcon.setText("");
                stnic.setText("");
                stname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void updatestbtn(ActionEvent event) {
        String st_id,st_name,st_mail,st_pass,st_con,st_nic;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        st_id = stid.getText();
        st_name = stname.getText();
        st_mail = stmail.getText();
        st_pass = stpass.getText();
        st_con = stcon.getText();
        st_nic = stnic.getText();

        if(Objects.equals(st_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else if(Objects.equals(st_pass, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Password field should not be empty!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("update student set Name=?,Email=?,Password=?,Contact=?,NIC=? where Std_id=?");
                pst.setString(1, st_name);
                pst.setString(2, st_mail);
                pst.setString(3, st_pass);
                pst.setInt(4, Integer.parseInt(st_con));
                pst.setString(5, st_nic);
                pst.setString(6, st_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Update");

                alert.setHeaderText("Student Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                tablest();

                stid.setText("");
                stname.setText("");
                stmail.setText("");
                stpass.setText("");
                stcon.setText("");
                stname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void deletestbtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String st_id;
        st_id=stid.getText();

        if(Objects.equals(st_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from student where Std_id = ? ");
                pst.setString(1, st_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Registationn");

                alert.setHeaderText("Student Registation");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                tablest();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void streset(ActionEvent event) {
        stid.setText("");
        stname.setText("");
        stmail.setText("");
        stpass.setText("");
        stcon.setText("");
    }

    //course pane button controls
    @FXML
    void createcoursebtn(ActionEvent event) {
        String c_id,c_name,c_credit;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        c_id = cid.getText();
        c_name = cname.getText();
        c_credit = ccredit.getText();

        if(Objects.equals(c_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("insert into course_unit values(?,?,?)");
                pst.setString(1, c_id);
                pst.setString(2, c_name);
                pst.setString(3, c_credit);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Course Registration");

                alert.setHeaderText("Course Registration");
                alert.setContentText("Course Addedddd!");
                alert.showAndWait();
                tablecrs();

                aid.setText("");
                aname.setText("");
                amail.setText("");
                apass.setText("");
                acon.setText("");
                aname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void updatecoursebtn(ActionEvent event) {
        String c_id,c_name,c_credit;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        c_id = cid.getText();
        c_name = cname.getText();
        c_credit = ccredit.getText();

        if(Objects.equals(c_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("update course_unit set course_name=?,credits=? where course_code=?");
                pst.setString(1, c_name);
                pst.setInt(2, Integer.parseInt(c_credit));
                pst.setString(3, c_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Course Update");

                alert.setHeaderText("Course Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                tablecrs();

                aid.setText("");
                aname.setText("");
                amail.setText("");
                apass.setText("");
                acon.setText("");
                aname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void deletecoursebtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String c_id;
        c_id=cid.getText();

        if(Objects.equals(c_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from course_unit where course_code = ? ");
                pst.setString(1, c_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Student Registationn");

                alert.setHeaderText("Student Registation");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                tablecrs();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void coursereset(ActionEvent event) {
        cid.setText("");
        cname.setText("");
        ccredit.setText("");
        apass.setText("");
        acon.setText("");
    }

    //timetable pane button controls----------------------------------------------
    @FXML
    void createtimebtn(ActionEvent event) {
        String t_id,t_name,t_mon,t_tue,t_wed,t_thu,t_fri;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        t_id = tid.getText();
        t_name = tname.getText();
        t_mon = tmon.getText();
        t_tue = tt.getText();
        t_wed = tw.getText();
        t_thu = tthu.getText();
        t_fri = tf.getText();

        if(Objects.equals(t_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                if(Objects.equals(t_mon, "")) {
                    t_mon="Free Time";
                }
                if(Objects.equals(t_tue, "")) {
                    t_tue="Free Time";
                }
                if(Objects.equals(t_wed, "")) {
                    t_wed="Free Time";
                }
                if(Objects.equals(t_thu, "")) {
                    t_thu="Free Time";
                }
                if(Objects.equals(t_fri, "")) {
                    t_fri="Free Time";
                }
                pst = con.prepareStatement("insert into timetable(Crs_id,L_name,Mon,Tue,Wed,Thu,Fri)values(?,?,?,?,?,?,?)");
                pst.setString(1, t_id);
                pst.setString(2, t_name);
                pst.setString(3, t_mon);
                pst.setString(4, t_tue);
                pst.setString(5, t_wed);
                pst.setString(6, t_thu);
                pst.setString(7, t_fri);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Time slot insert");

                alert.setHeaderText("Time slot insert");
                alert.setContentText("Record Addedddd!");
                alert.showAndWait();
                tabletime();

                tid.setText("");
                tname.setText("");
                tmon.setText("");
                tt.setText("");
                tw.setText("");
                tthu.setText("");
                tf.setText("");
                tname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void updatetimebtn(ActionEvent event) {
        String t_id,t_name,t_mon,t_tue,t_wed,t_thu,t_fri;

        //myIndex = admintable.getSelectionModel().getSelectedIndex();

        //a_con = Integer.parseInt(String.valueOf(admintable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        t_id = tid.getText();
        t_name = tname.getText();
        t_mon = tmon.getText();
        t_tue = tt.getText();
        t_wed = tw.getText();
        t_thu = tthu.getText();
        t_fri = tf.getText();

        if(Objects.equals(t_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                if(Objects.equals(t_mon, "")) {
                    t_mon="Free Time";
                }
                if(Objects.equals(t_tue, "")) {
                    t_tue="Free Time";
                }
                if(Objects.equals(t_wed, "")) {
                    t_wed="Free Time";
                }
                if(Objects.equals(t_thu, "")) {
                    t_thu="Free Time";
                }
                if(Objects.equals(t_fri, "")) {
                    t_fri="Free Time";
                }
                pst = con.prepareStatement("update timetable set L_name=?,Mon=?,Tue=?,Wed=?,Thu=?,Fri=? where Crs_id=?");
                pst.setString(1, t_name);
                pst.setString(2, t_mon);
                pst.setString(3, t_tue);
                pst.setString(4, t_wed);
                pst.setString(5, t_thu);
                pst.setString(6, t_fri);
                pst.setString(7, t_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Timetable Update");

                alert.setHeaderText("Timetable Update");
                alert.setContentText("Record Updated!");
                alert.showAndWait();
                tabletime();

                tid.setText("");
                tname.setText("");
                tmon.setText("");
                tt.setText("");
                tw.setText("");
                tthu.setText("");
                tf.setText("");
                tname.requestFocus();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void deletetimebtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        String t_id;
        t_id=tid.getText();

        if(Objects.equals(t_id, "")) {
            Alert alobj=new Alert(Alert.AlertType.INFORMATION);
            alobj.setTitle("Error");
            alobj.setHeaderText("Fill the primary key attribute field!");
            alobj.showAndWait();
        }
        else {
            try
            {
                pst = con.prepareStatement("delete from timetable where Crs_id = ? ");
                pst.setString(1, t_id);
                pst.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Timeslot deletion");

                alert.setHeaderText("Timeslot deletion");
                alert.setContentText("Deletedd!");
                alert.showAndWait();
                tabletime();
            }
            catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }

    @FXML
    void timereset(ActionEvent event) {
        tid.setText("");
        tname.setText("");
        tmon.setText("");
        tt.setText("");
        tw.setText("");
        tthu.setText("");
        tf.setText("");
    }

    //Notice pane button controls---------------------------------------------------
    @FXML
    void addnbtn(ActionEvent event) {
        String n_head,n_des,n_date;
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        n_head = nhead.getText();
        n_des = ndes.getText();

        try
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd\nHH:mm:ss");
            Calendar cal = Calendar.getInstance();
            n_date=dateFormat.format(cal.getTime());
            System.out.println(n_date);
            pst = con.prepareStatement("insert into notice(topic,notice,date) values(?,?,?)");
            pst.setString(1, n_head);
            pst.setString(2, n_des);
            pst.setString(3, n_date);
            pst.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notice Publish");

            alert.setHeaderText("Notice Publish");
            alert.setContentText("Notice Addedddd!");
            alert.showAndWait();
            tablents();

            nhead.setText("");
            ndes.setText("");
            nhead.requestFocus();
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }

    }

    @FXML
    void editnbtn(ActionEvent event) {
        String n_head,n_des;
        int n_id;

        int myIndex = noticetable.getSelectionModel().getSelectedIndex();

        n_id = Integer.parseInt(String.valueOf(noticetable.getItems().get(myIndex).getId()));
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        n_head = nhead.getText();
        n_des = ndes.getText();

        try
        {
            pst = con.prepareStatement("update notice set topic=?,notice=? where nId=?");
            pst.setString(1, n_head);
            pst.setString(2, n_des);
            pst.setInt(3, n_id);
            pst.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notice Update");

            alert.setHeaderText("Notice Update");
            alert.setContentText("Notice Updated!");
            alert.showAndWait();
            tablents();

            nhead.setText("");
            ndes.setText("");
            nhead.requestFocus();
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    @FXML
    void deletenbtn(ActionEvent event) {

        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;

        int myIndex = noticetable.getSelectionModel().getSelectedIndex();

        int id = Integer.parseInt(String.valueOf(noticetable.getItems().get(myIndex).getId()));

        try
        {
            pst = con.prepareStatement("delete from notice where nId = ? ");
            pst.setInt(1, id);
            pst.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notice Deletion");

            alert.setHeaderText("Notice Deletion");
            alert.setContentText("Notice Deletedd!");
            alert.showAndWait();
            tablents();
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    @FXML
    void noticereset(ActionEvent event) {
        nhead.setText("");
        ndes.setText("");
    }

    //other methods

    public void table()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Admintbl> admins = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select adm_id,adm_name,adm_mail,adm_pass,adm_contact from admin");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Admintbl ad = new Admintbl();
                    ad.setId(rs.getString("adm_id"));
                    ad.setName(rs.getString("adm_name"));
                    ad.setMail(rs.getString("adm_mail"));
                    ad.setPassword(rs.getString("adm_pass"));
                    ad.setContact(rs.getString("adm_contact"));
                    admins.add(ad);
                }
            }
            admintable.setItems(admins);
            aidcol.setCellValueFactory(f -> f.getValue().idProperty());
            anamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            amailcol.setCellValueFactory(f -> f.getValue().mailProperty());
            apasscol.setCellValueFactory(f -> f.getValue().passwordProperty());
            aconcol.setCellValueFactory(f -> f.getValue().contactProperty());



        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        admintable.setRowFactory( tv -> {
            TableRow<Admintbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  admintable.getSelectionModel().getSelectedIndex();

                    aid.setText(admintable.getItems().get(myIndex).getId());
                    aname.setText(admintable.getItems().get(myIndex).getName());
                    amail.setText(admintable.getItems().get(myIndex).getMail());
                    apass.setText(admintable.getItems().get(myIndex).getPassword());
                    acon.setText(admintable.getItems().get(myIndex).getContact());

                }
            });
            return myRow;
        });


    }

    public void tableto()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Totbl> tos = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select to_id,to_name,to_mail,to_password,to_contact from tech_officer");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Totbl to = new Totbl();
                    to.setId(rs.getString("to_id"));
                    to.setName(rs.getString("to_name"));
                    to.setMail(rs.getString("to_mail"));
                    to.setPassword(rs.getString("to_password"));
                    to.setContact(rs.getString("to_contact"));
                    tos.add(to);
                }
            }
            totable.setItems(tos);
            toidcol.setCellValueFactory(f -> f.getValue().idProperty());
            tonamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            tomailcol.setCellValueFactory(f -> f.getValue().mailProperty());
            topasscol.setCellValueFactory(f -> f.getValue().passwordProperty());
            toconcol.setCellValueFactory(f -> f.getValue().contactProperty());



        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        totable.setRowFactory( tv -> {
            TableRow<Totbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  totable.getSelectionModel().getSelectedIndex();

                    toid.setText(totable.getItems().get(myIndex).getId());
                    toname.setText(totable.getItems().get(myIndex).getName());
                    tomail.setText(totable.getItems().get(myIndex).getMail());
                    topass.setText(totable.getItems().get(myIndex).getPassword());
                    tocon.setText(totable.getItems().get(myIndex).getContact());

                }
            });
            return myRow;
        });
    }

    public void tablelec()
    {
        mdc = new DBconnection();
        Connection con1 = mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Lectbl> lecs = FXCollections.observableArrayList();
        try {
            pst = con1.prepareStatement("select * from lecture");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next()) {
                    Lectbl lec = new Lectbl();
                    lec.setId(rs.getString("Lec_id"));
                    lec.setName(rs.getString("Name"));
                    lec.setMail(rs.getString("Email"));
                    lec.setPassword(rs.getString("password"));
                    lec.setContact(rs.getString("Contact"));
                    lecs.add(lec);
                }
            }
            lectable.setItems(lecs);
            lecidcol.setCellValueFactory(f -> f.getValue().idProperty());
            lecnamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            lecmailcol.setCellValueFactory(f -> f.getValue().mailProperty());
            lecpasscol.setCellValueFactory(f -> f.getValue().passwordProperty());
            lecconcol.setCellValueFactory(f -> f.getValue().contactProperty());


        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        lectable.setRowFactory(tv -> {
            TableRow<Lectbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked(event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty())) {
                    int myIndex = lectable.getSelectionModel().getSelectedIndex();

                    lecid.setText(lectable.getItems().get(myIndex).getId());
                    lecname.setText(lectable.getItems().get(myIndex).getName());
                    lecmail.setText(lectable.getItems().get(myIndex).getMail());
                    lecpass.setText(lectable.getItems().get(myIndex).getPassword());
                    leccon.setText(lectable.getItems().get(myIndex).getContact());

                }
            });
            return myRow;
        });
    }

    public void tablest()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Sttbl> sts = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select Std_id,Name,Email,Password,Contact,NIC from student");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Sttbl st = new Sttbl();
                    st.setId(rs.getString("Std_id"));
                    st.setName(rs.getString("Name"));
                    st.setMail(rs.getString("Email"));
                    st.setPassword(rs.getString("Password"));
                    st.setContact(rs.getString("Contact"));
                    st.setNic(rs.getString("NIC"));
                    sts.add(st);
                }
            }
            sttable.setItems(sts);
            stidcol.setCellValueFactory(f -> f.getValue().idProperty());
            stnamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            stmailcol.setCellValueFactory(f -> f.getValue().mailProperty());
            stpasscol.setCellValueFactory(f -> f.getValue().passwordProperty());
            stconcol.setCellValueFactory(f -> f.getValue().contactProperty());
            stniccol.setCellValueFactory(f -> f.getValue().nicProperty());

        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        sttable.setRowFactory( tv -> {
            TableRow<Sttbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  sttable.getSelectionModel().getSelectedIndex();

                    stid.setText(sttable.getItems().get(myIndex).getId());
                    stname.setText(sttable.getItems().get(myIndex).getName());
                    stmail.setText(sttable.getItems().get(myIndex).getMail());
                    stpass.setText(sttable.getItems().get(myIndex).getPassword());
                    stcon.setText(sttable.getItems().get(myIndex).getContact());
                    stnic.setText(sttable.getItems().get(myIndex).getNic());

                }
            });
            return myRow;
        });


    }

    public void tablecrs()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Crstbl> crss = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select course_code,course_name,credits from course_unit");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Crstbl cr = new Crstbl();
                    cr.setId(rs.getString("course_code"));
                    cr.setName(rs.getString("course_name"));
                    cr.setCredit(rs.getString("credits"));
                    crss.add(cr);
                }
            }
            coursetable.setItems(crss);
            cidcol.setCellValueFactory(f -> f.getValue().idProperty());
            cnamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            ccreditcol.setCellValueFactory(f -> f.getValue().creditProperty());

        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        coursetable.setRowFactory( tv -> {
            TableRow<Crstbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  coursetable.getSelectionModel().getSelectedIndex();

                    cid.setText(coursetable.getItems().get(myIndex).getId());
                    cname.setText(coursetable.getItems().get(myIndex).getName());
                    ccredit.setText(coursetable.getItems().get(myIndex).getCredit());

                }
            });
            return myRow;
        });
    }

    public void tabletime()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Timetbl> ts = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select Crs_id,L_name,Mon,Tue,Wed,Thu,Fri from timetable");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Timetbl t = new Timetbl();
                    t.setId(rs.getString("Crs_id"));
                    t.setName(rs.getString("L_name"));
                    t.setMon(rs.getString("Mon"));
                    t.setTue(rs.getString("Tue"));
                    t.setWed(rs.getString("Wed"));
                    t.setThu(rs.getString("Thu"));
                    t.setFri(rs.getString("Fri"));
                    ts.add(t);
                }
            }
            timetabletable.setItems(ts);
            tidcol.setCellValueFactory(f -> f.getValue().idProperty());
            tnamecol.setCellValueFactory(f -> f.getValue().nameProperty());
            moncol.setCellValueFactory(f -> f.getValue().monProperty());
            tuecol.setCellValueFactory(f -> f.getValue().tueProperty());
            wedcol.setCellValueFactory(f -> f.getValue().wedProperty());
            thucol.setCellValueFactory(f -> f.getValue().thuProperty());
            fricol.setCellValueFactory(f -> f.getValue().friProperty());

        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        timetabletable.setRowFactory( tv -> {
            TableRow<Timetbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  timetabletable.getSelectionModel().getSelectedIndex();

                    tid.setText(timetabletable.getItems().get(myIndex).getId());
                    tname.setText(timetabletable.getItems().get(myIndex).getName());
                    tmon.setText(timetabletable.getItems().get(myIndex).getMon());
                    tt.setText(timetabletable.getItems().get(myIndex).getTue());
                    tw.setText(timetabletable.getItems().get(myIndex).getWed());
                    tthu.setText(timetabletable.getItems().get(myIndex).getThu());
                    tf.setText(timetabletable.getItems().get(myIndex).getFri());

                }
            });
            return myRow;
        });


    }

    public void tablents()
    {
        mdc=new DBconnection();
        Connection con= mdc.getMyConnection();
        PreparedStatement pst;
        ObservableList<Noticetbl> nts = FXCollections.observableArrayList();
        try
        {
            pst = con.prepareStatement("select nId,topic,notice,date from notice");
            ResultSet rs = pst.executeQuery();
            {
                while (rs.next())
                {
                    Noticetbl n = new Noticetbl();
                    n.setId(rs.getString("nId"));
                    n.setHead(rs.getString("topic"));
                    n.setDes(rs.getString("notice"));
                    n.setDate(rs.getString("date"));
                    nts.add(n);
                }
            }
            noticetable.setItems(nts);
            nidcol.setCellValueFactory(f -> f.getValue().idProperty());
            nheadercol.setCellValueFactory(f -> f.getValue().headProperty());
            ndescol.setCellValueFactory(f -> f.getValue().desProperty());
            ndatecol.setCellValueFactory(f -> f.getValue().dateProperty());


        }

        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        noticetable.setRowFactory( tv -> {
            TableRow<Noticetbl> myRow = new TableRow<>();
            myRow.setOnMouseClicked (event ->
            {
                if (event.getClickCount() == 1 && (!myRow.isEmpty()))
                {
                    int myIndex =  noticetable.getSelectionModel().getSelectedIndex();

                    //nidcol = Integer.parseInt(String.valueOf(noticetable.getItems().get(myIndex).getId()));
                    nhead.setText(noticetable.getItems().get(myIndex).getHead());
                    ndes.setText(noticetable.getItems().get(myIndex).getDes());
                    //ndatecol.setText(noticetable.getItems().get(myIndex).getDate());



                }
            });
            return myRow;
        });


    }

    public void initialize() {
        table();
        tableto();
        tablelec();
        tablest();
        tablecrs();
        tabletime();
        tablents();
    }

    public void logOut(ActionEvent actionEvent) {
        HelloController.closeWindow();
        HelloApplication.showWindow();
    }

    //data validation





}
