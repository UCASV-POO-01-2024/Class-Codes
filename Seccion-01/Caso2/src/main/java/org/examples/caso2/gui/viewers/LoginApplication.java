package org.examples.caso2.gui.viewers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(LoginApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(loader.load(),600,350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DictoHier");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
