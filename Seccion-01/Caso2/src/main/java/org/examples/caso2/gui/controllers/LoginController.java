package org.examples.caso2.gui.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.examples.caso2.gui.viewers.DictoApplication;
import org.examples.caso2.model.Authentication;
import org.examples.caso2.model.Dictionary;
import org.examples.caso2.model.dicto.*;

public class LoginController {
    @FXML
    private TextField tfUser;

    @FXML
    private TextField tfPass;

    @FXML
    protected void onActionLogin(){
        if(Authentication.authenticate(tfUser.getText(),tfPass.getText())){
            ((Stage) tfUser.getScene().getWindow()).close();

            Dictionary.initialize();

            DictoBuilder builder;
            switch (Authentication.getActiveUserType()){
                case "A":
                    builder = new AdminDictoBuilder();
                    break;
                case "T":
                    builder = new TeacherDictoBuilder();
                    break;
                case "S":
                    builder = new StudentDictoBuilder();
                    break;
                default:
                    builder = null;
            }
            builder.init();
            Director dir = new Director(builder);
            DictoApplication app = builder.getResult();

            Stage stage = new Stage();
            try {
                app.start(stage);
                app.init();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            dir.make(Authentication.getActiveUserType());

            stage.show();
        }
    }

    @FXML
    protected void onActionSalir() {
        Platform.exit();
    }
}
