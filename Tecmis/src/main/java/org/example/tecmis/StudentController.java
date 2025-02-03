package org.example.tecmis;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {

    public void attendanceBtn (ActionEvent event) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("attendance.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);

    }

    public void courseBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("course.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);
    }

    public void timetableBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("time_table.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);

    }

    public void noticeBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("notice.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);

    }

    public void gpaBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("gpa.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);
    }

    public void medicalBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader attendanceLoader = new FXMLLoader(getClass().getResource("medical.fxml"));
        Pane attendancePane = attendanceLoader.load();
        HelloController.Cl(attendancePane);
    }


    public void edit_profile(ActionEvent event) {
        try {
            Stage newStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("edit_profile2.fxml"));
            newStage.setScene(new Scene(root, 610, 400));
            newStage.setTitle("Update profile");
            newStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void logout(){
        HelloController.closeWindow();
        HelloApplication.showWindow();
    }
}
