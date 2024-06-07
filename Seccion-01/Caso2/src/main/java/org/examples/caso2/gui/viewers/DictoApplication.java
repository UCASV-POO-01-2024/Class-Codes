package org.examples.caso2.gui.viewers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.examples.caso2.gui.controllers.DictoController;
import org.examples.caso2.models.Dictionary;

import java.io.IOException;

public class DictoApplication extends Application {
    private FXMLLoader fxmlLoader;

    @Override
    public void init(){
        Dictionary.init();
        ((DictoController) fxmlLoader.getController()).fillList();
    }

    public void addLetters(){
        ((DictoController) fxmlLoader.getController()).modifyGrid();
    }

    public void addCategories(){
        ((DictoController) fxmlLoader.getController()).placeCategories();
    }

    public void addAdding(){
        ((DictoController) fxmlLoader.getController()).placeAdding();
    }

    @Override
    public void start(Stage stage) throws IOException {
        fxmlLoader = new FXMLLoader(DictoApplication.class.getResource("dicto.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("DictoHier");
        stage.setScene(scene);
        stage.show();
    }
}
