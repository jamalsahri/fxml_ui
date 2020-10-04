package com.controllers.tester;

import app.AppController;
import com.controllers.dao.Dao;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginTestController implements Initializable {

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
                if (dao.validateTester(username.getText().trim(), password.getText().trim())) {

                    // this.application.gotoMaster();
                    labelL.setText("Connected");
                    System.out.println("connected well !");
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
}
