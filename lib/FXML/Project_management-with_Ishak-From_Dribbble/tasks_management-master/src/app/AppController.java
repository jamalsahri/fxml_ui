package app;

import com.controllers.developer.DashboardController;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppController implements Initializable {



    @FXML
    private JFXButton btndev;

    @FXML
    private JFXButton btntest;

    @FXML
    public void loginDev(ActionEvent event) throws IOException {
            try{
                btndev.getScene().getWindow().hide();
                Stage stageDev = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("/com/views/developer/login/login.fxml"));
                Scene  sc = new Scene(root);
                stageDev.setScene(sc);
                stageDev.setTitle("Panel Developpeur");
                stageDev.show();
            }catch (Exception e){
                e.getMessage();
            }
    }

    @FXML
    public void loginTest(ActionEvent event) {
        try{
            btntest.getScene().getWindow().hide();
            Stage stageDev = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/com/views/tester/login/login.fxml"));
            Scene  sc = new Scene(root);
            stageDev.setScene(sc);
            stageDev.show();
        }catch (Exception e){
            e.getMessage();
        }
    }


    public void setApp(AppMain appMain) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
