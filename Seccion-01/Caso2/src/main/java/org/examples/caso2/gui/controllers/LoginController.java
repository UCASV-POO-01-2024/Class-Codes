package org.examples.caso2.gui.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.examples.caso2.gui.viewers.DictoApplication;
import org.examples.caso2.models.Authentication;
import org.examples.caso2.models.dicto.AdminDictoBuilder;
import org.examples.caso2.models.dicto.DictoBuilder;
import org.examples.caso2.models.dicto.Director;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField tfUser;

    @FXML
    private TextField tfPass;

    @FXML
    protected void onActionLogin() {
        if(Authentication.authenticate(tfUser.getText(), tfPass.getText())){
            Stage current = (Stage) tfUser.getScene().getWindow();
            current.close();

            Stage stage = new Stage();
            try {
                DictoBuilder builder = new AdminDictoBuilder();
                builder.init();
                DictoApplication app = builder.getResult();
                app.start(stage);
                app.init();

                Director dir = new Director(builder);
                dir.make(Authentication.getUserType());
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            stage.show();
        }
    }

    @FXML
    protected void onActionSalir() {
        Platform.exit();
    }
}
