package org.example.tecmis.Lecture;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizController {

    @FXML
    private Button EditMarks;

    @FXML
    private Button cancelButton;

    @FXML
    private TableColumn<QuizController, String> crsid;

    @FXML
    private TableColumn<QuizController, String> quizMarks;

    @FXML
    private TableColumn<QuizController, String> quizNo;

    @FXML
    private TableColumn<QuizController, String> stdid;

    @FXML
    private TableView<QuizController> quizTable;


    public void setValueFactory(){
        stdid.setCellValueFactory(new PropertyValueFactory<>("Std_id"));
        crsid.setCellValueFactory(new PropertyValueFactory<>("Crs_id"));
        quizNo.setCellValueFactory(new PropertyValueFactory<>("Quiz_no"));
        quizMarks.setCellValueFactory(new PropertyValueFactory<>("Quiz_mark"));
    }

    public void show() {
        myconnection dc;

        dc=new myconnection();
        Connection con= dc.GetMyConnection();
        Statement stmt;

        int quizNo, quizMark;
        String stdId, crsId;
        try{
            stmt=con.createStatement();
            String query="select * from quiz";

            quizTable.getItems().clear();
            ResultSet rs=stmt.executeQuery(query);


            while (rs.next()) {

                quizNo=rs.getInt(2);
                quizMark =rs.getInt(3);
                stdId =rs.getString(4);
                crsId =rs.getString(5);

                Quiz add_record = new Quiz(stdId,crsId,quizNo,quizMark);
                quizTable.getItems().add(add_record);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void initialize() {
        show();
        setValueFactory();

    }

    @FXML
    void cancelMe(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void editMarks(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditQuiz.fxml"));

            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setWidth(1000); // Set your desired width
            stage.setHeight(500); // Set your desired height
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("error");
        }
    }
}
