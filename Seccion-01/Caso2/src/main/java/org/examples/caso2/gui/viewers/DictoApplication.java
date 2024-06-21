package org.examples.caso2.gui.viewers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.examples.caso2.gui.controllers.DictoController;

public class DictoApplication extends Application {
    private FXMLLoader fxmlLoader;

    @Override
    public void start(Stage stage) throws Exception {
        fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("dicto.fxml"));
        //fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setScene(scene);
        stage.setTitle("DictoHier");
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void init() throws Exception {
        ((DictoController) fxmlLoader.getController()).configureList();
        ((DictoController) fxmlLoader.getController()).updateList();
    }

    public void manageLetters(){
        ((DictoController) fxmlLoader.getController()).placeLetters();
    }

    public void manageCategories(){
        ((DictoController) fxmlLoader.getController()).placeCategories();
    }

    public void manageAdding(){
        ((DictoController) fxmlLoader.getController()).placeAdding();
    }
}
