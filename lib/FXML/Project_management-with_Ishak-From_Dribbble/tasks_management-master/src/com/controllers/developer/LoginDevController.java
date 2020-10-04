package com.controllers.developer;

import app.AppController;
import app.AppMain;
import com.controllers.dao.Dao;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDevController implements Initializable {

    private Stage stage;

    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private Button buttonLogin;
    @FXML
    private Label labelL;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private AppController application;

    public void setApp(AppController application){
        this.application= application;
    }

    public void Identifier(ActionEvent actionEvent) {
        try{
            Dao dao = new Dao();
            if(!username.getText().trim().isEmpty() && !password.getText().trim().isEmpty() ) {
                if (dao.validateUser(username.getText().trim(), password.getText().trim())) {

                    this.gototDashboard();

                } else {

                    labelL.setText("Information are not valid !!!");

                }
            }else{
                labelL.setText("SVP, completer les champs requis");

            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    public void gototDashboard(){
        try{
            buttonLogin.getScene().getWindow().hide();
            Stage stageDev = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/com/views/developer/dashboard/dashboard.fxml"));
            Scene  sc = new Scene(root);
            stageDev.setScene(sc);
            stageDev.show();
        }catch (Exception e){
            e.getMessage();
        }
    }
    /*
    private Initializable replaceSceneContent(String fxml) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        InputStream in = AppController.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(AppController.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.centerOnScreen();
        // stage.resizableProperty().setValue(Boolean.FALSE);
        // stage.sizeToScene();
        return (Initializable) loader.getController();
    }
    */


}
