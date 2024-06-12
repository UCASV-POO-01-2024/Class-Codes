package org.examples.caso2.gui.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.examples.caso2.gui.viewers.DialogApplication;
import org.examples.caso2.gui.viewers.LoginApplication;
import org.examples.caso2.models.Dictionary;
import org.examples.caso2.models.iterators.MyIterator;

import java.io.IOException;
import java.util.Map;

public class DictoController {
    @FXML
    private GridPane letterGrid;

    @FXML
    private ListView listTerms;

    @FXML
    private Label lblMeaning;

    @FXML
    private HBox hboxCategories;

    @FXML
    private HBox hboxFunctions;

    public void fillList(){
        MyIterator iter = Dictionary.getInstance().createIterator("F");
        while(iter.hasNext()){
            Map.Entry<String,String> next = iter.next();
            listTerms.getItems().add(next.getKey());
        }

        listTerms.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String word = listTerms.getSelectionModel().getSelectedItems().get(0).toString();
                String meaning = Dictionary.getInstance().getMeaning(word);
                lblMeaning.setText(meaning);
            }
        });
    }

    public void modifyGrid(){
        String initials = Dictionary.getInstance().getInitials();
        int i = 0, j = 0;
        for(Character c : initials.toCharArray()){
            Button btn = new Button(c.toString());
            configureCategoryButton(btn,"L",c.toString());
            letterGrid.add(btn, i%6, j);
            i++;
            if(i > 0 && i%6 == 0) j++;
        }
    }

    private void configureCategoryButton(Button btn, String... type){
        btn.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        listTerms.getItems().clear();
                        MyIterator iter = Dictionary.getInstance().createIterator(type);
                        while(iter.hasNext()){
                            Map.Entry<String,String> next = iter.next();
                            listTerms.getItems().add(next.getKey());
                        }
                    }
                }
        );
    }

    public void placeCategories() {
        Insets insets = new Insets(10, 10, 10, 10);

        Button btnAdjectives = new Button("Adjectives");
        Button btnVerbs = new Button("Verbs");
        Button btnNouns = new Button("Nouns");
        btnAdjectives.setPrefWidth(100.0);
        btnVerbs.setPrefWidth(100.0);
        btnNouns.setPrefWidth(100.0);
        btnAdjectives.setPadding(insets);
        btnVerbs.setPadding(insets);
        btnNouns.setPadding(insets);

        configureCategoryButton(btnAdjectives,"A");
        configureCategoryButton(btnVerbs,"V");
        configureCategoryButton(btnNouns,"N");

        hboxCategories.getChildren().addAll(btnAdjectives, btnVerbs, btnNouns);
        HBox.setMargin(btnAdjectives, insets);
        HBox.setMargin(btnVerbs, insets);
        HBox.setMargin(btnNouns, insets);
    }

    public void placeAdding() {
        Insets insets = new Insets(10, 10, 10, 10);

        Button btnAdd = new Button("Añadir");
        btnAdd.setPrefWidth(100.0);
        btnAdd.setPadding(insets);

        btnAdd.setOnAction(
            new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    Stage stage = new Stage();
                    try {
                        DialogApplication app = new DialogApplication();
                        app.start(stage);
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
        );

        hboxFunctions.getChildren().add(0,btnAdd);
        HBox.setMargin(btnAdd, insets);
    }

    @FXML
    protected void onActionSalir(){
        Stage current = (Stage) letterGrid.getScene().getWindow();
        current.close();

        Stage stage = new Stage();
        try {
            LoginApplication app = new LoginApplication();
            app.start(stage);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        stage.show();
    }
}
