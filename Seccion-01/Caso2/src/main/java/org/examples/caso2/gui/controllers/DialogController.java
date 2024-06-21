package org.examples.caso2.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.examples.caso2.model.Dictionary;

public class DialogController {
    @FXML
    private TextField tfNewWord;

    @FXML
    private ComboBox<String> cbNewWord;

    @FXML
    private TextArea taNewWord;

    @FXML
    protected void onActionAnyadir(){
        if(tfNewWord.getText().equals("") || cbNewWord.getValue() == null || taNewWord.getText().equals("")){
            System.out.println("Hacen falta datos!");
        }
        else {
            Dictionary.getInstance().addWord(tfNewWord.getText(), cbNewWord.getValue(), taNewWord.getText());
            ((Stage) tfNewWord.getScene().getWindow()).close();
        }
    }

    @FXML
    protected void onActionSalir(){
        ((Stage) tfNewWord.getScene().getWindow()).close();
    }
}
