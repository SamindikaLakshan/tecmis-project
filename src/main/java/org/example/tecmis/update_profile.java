package org.example.tecmis;

import org.example.tecmis.connection.DBconnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.ResourceBundle;


public class update_profile implements Initializable {

    private File selectedImageFile;
    @FXML
    private Circle profileImageView2;
    static String imagePath = "/img/profile/check.png";
    @FXML
    private TextField email;
    String st_id = "TG0008";
    public String path;

    @FXML
    private void chooseImage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Profile Picture");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );
        selectedImageFile = fileChooser.showOpenDialog(profileImageView2.getScene().getWindow());
        if (selectedImageFile != null) {
            Image image = new Image(selectedImageFile.toURI().toString());
            profileImageView2.setFill(new ImagePattern(image));
        }
    }

    @FXML
    private void update_details() throws IOException {
        String f_path;

        if(selectedImageFile!=null){
            Path currentPath = Paths.get("").toAbsolutePath();
            String local_path = "/src/main/resources/img/profile";
            String destinationDirectoryPath = currentPath + local_path;
            Path destinationDirectory = Paths.get(destinationDirectoryPath);

            Path sourceFilePath = selectedImageFile.toPath();
            String fileExtension = getFileExtension(selectedImageFile.getName());
            String file_name=st_id+"."+fileExtension;
            f_path = "/img/profile/" + file_name;
            Path destinationFilePath = destinationDirectory.resolve(file_name);
            Files.copy(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
        }
        else{
            f_path=path;
        }



        DBconnection mdc;
        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();


        try {
            st_id = User.getUser();
            String myStatement = "UPDATE student SET `Image`=? ,Email=? WHERE `Std_id`=?";
            PreparedStatement pstmt = con.prepareStatement(myStatement);
            pstmt.setString(1, f_path);
            pstmt.setString(2, email.getText());
            pstmt.setString(3, st_id);
            int exe = pstmt.executeUpdate();

            showAlert("Success", "Profile  updated.");
            load_profile.load_profile(st_id);

        } catch (SQLException e) {
            showAlert("Error", "Profile  Unsuccessfilly..");
            System.out.println("err");
        }


    }

    @FXML
    private void cancel() {
        Stage stage = (Stage) profileImageView2.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static String getFileExtension(String filePath) {
        Path path = Path.of(filePath);
        String fileExtension = "";
        if (path.getFileName().toString().contains(".")) {
            fileExtension = path.toString().substring(path.toString().lastIndexOf(".") + 1);
        }

        return fileExtension;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("work");
        load_profile(st_id);
    }


    public void load_profile(String u_id){
        String path=checkprofile(u_id);

        if(path!=null){

            Image image = new Image(Student.class.getResourceAsStream(path));
            profileImageView2.setFill(new ImagePattern(image));

        }
        else{
            Image image = new Image(Student.class.getResourceAsStream(imagePath));
            profileImageView2.setFill(new ImagePattern(image));
        }
    }


    public String checkprofile(String u_id){
        DBconnection mdc;
        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();


        try {
            String st_id=u_id;
            String myStatement = "SELECT Image,Email FROM student WHERE Std_id=?";
            PreparedStatement pstmt = con.prepareStatement(myStatement);
            pstmt.setString(1,st_id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                path = rs.getString(1);
                email.setText(rs.getString(2));
                return path;
            }


        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println("err");
        }
        return null;
    }
}
