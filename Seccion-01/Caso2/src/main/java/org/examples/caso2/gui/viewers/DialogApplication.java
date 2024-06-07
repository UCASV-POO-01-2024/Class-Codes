package org.examples.caso2.gui.viewers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class DialogApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DialogApplication.class.getResource("dialog.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("Agregar Palabra");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        //stage.show();
        stage.showAndWait();
    }
}
