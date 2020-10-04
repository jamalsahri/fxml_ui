package com.controllers.developer;

import app.AppController;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    private AppController application;

    public void setApp(AppController application){
        this.application= application;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
