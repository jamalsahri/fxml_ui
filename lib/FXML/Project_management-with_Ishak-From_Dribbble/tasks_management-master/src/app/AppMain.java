package app;

import com.models.Ressource;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppMain extends Application {

    private Stage stage;
    // private Ressource ressource ;
    // private boolean flag = false;


    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            stage = primaryStage;
            stage.setTitle("Application de gestion des taches");
            stage.getIcons().add(new Image("images/UCA_Logo.png"));
            gotoGeneral();
            primaryStage.centerOnScreen();
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotoGeneral() {
        try {
            AppController general = (AppController) replaceSceneContent("/com/views/generel.fxml");
            general.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = AppMain.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(AppMain.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page);
        stage.setScene(scene);
        stage.centerOnScreen();
        return (Initializable) loader.getController();
    }

    public static void main(String[] args) {
        Application.launch(AppMain.class, (java.lang.String[])null);
    }
}



