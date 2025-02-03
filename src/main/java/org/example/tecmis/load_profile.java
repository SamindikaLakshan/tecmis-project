package org.example.tecmis;
import javafx.scene.shape.Circle;
import org.example.tecmis.connection.DBconnection;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import java.sql.*;


public class load_profile {

    static String imagePath = "/img/profile/check.png";
    static Circle profile_img=Student.pImage();
    public static void load_profile(String u_id){
        String path=checkprofile(u_id);

        if(path!=null){

            Image image = new Image(Student.class.getResourceAsStream(path));
            profile_img.setFill(new ImagePattern(image));

        }
        else{
            Image image = new Image(Student.class.getResourceAsStream(imagePath));
            profile_img.setFill(new ImagePattern(image));
        }
    }


    public static String checkprofile(String u_id){
        DBconnection mdc;
        mdc = new DBconnection();
        Connection con = mdc.getMyConnection();

        String f_path;
        try {
            String st_id=u_id;
            String myStatement = "SELECT Image FROM student WHERE Std_id=?";
            PreparedStatement pstmt = con.prepareStatement(myStatement);
            pstmt.setString(1,st_id);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                f_path = rs.getString(1);
                System.out.println(f_path);
                return f_path;
            }


        } catch (SQLException e) {
            //throw new RuntimeException(e);
            System.out.println("err");
        }
        return null;
    }
}
