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
import org.examples.caso2.model.Dictionary;
import org.examples.caso2.model.iterators.MyIterator;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;

public class DictoController {
    @FXML
    private ListView listTerms;

    @FXML
    private Label lblMeaning;

    @FXML
    private GridPane letterGrid;

    @FXML
    private HBox hboxCategories;

    @FXML
    private HBox hboxFunctions;

    public void configureList(){
        listTerms.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String word = listTerms.getSelectionModel().getSelectedItems().get(0).toString();
                String meaning = Dictionary.getInstance().getMeaning(word);
                lblMeaning.setText(meaning);
            }
        });
    }

    public void updateList(){
        listTerms.getItems().clear();
        MyIterator iter = Dictionary.getInstance().createIterator("F");
        while(iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            listTerms.getItems().add(entry.getKey());
        }
        listTerms.getItems().sort(Comparator.naturalOrder());
    }

    public void placeLetters(){
        String initials = Dictionary.getInstance().getInitials();

        int i = 0, j = 0;
        for(Character c : initials.toCharArray()){
            Button btn = new Button( c.toString() );

            btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        listTerms.getItems().clear();
                        MyIterator iter = Dictionary.getInstance().createIterator("L", c.toString());
                        while(iter.hasNext()){
                            Map.Entry<String,String> entry = iter.next();
                            listTerms.getItems().add(entry.getKey());
                        }
                        listTerms.getItems().sort(Comparator.naturalOrder());
                    }
                }
            );

            letterGrid.add(btn, j, i);
            j++;
            if(j == 6){
                i++;
                j = 0;
            }
        }
    }

    private void configureButtonAction(Button btn, String category){
        btn.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        listTerms.getItems().clear();
                        MyIterator iter = Dictionary.getInstance().createIterator(category);
                        while(iter.hasNext()){
                            Map.Entry<String,String> entry = iter.next();
                            listTerms.getItems().add(entry.getKey());
                        }
                        listTerms.getItems().sort(Comparator.naturalOrder());
                    }
                }
        );
    }

    private void createButton(String name, double width, HBox hbox, String category){
        Button btn = new Button(name);
        btn.setPrefWidth(width);

        Insets insets = new Insets(10, 10, 10, 10);
        btn.setPadding(insets);

        hbox.getChildren().add(0,btn);
        HBox.setMargin(btn,insets);

        if(category != null) configureButtonAction(btn, category);
        else{
            btn.setOnAction(
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
        }
    }

    public void placeCategories(){
        createButton("Sustantivos",100,hboxCategories, "N");
        createButton("Verbos",100,hboxCategories, "V");
        createButton("Adjetivos",100,hboxCategories, "A");
    }

    public void placeAdding(){
        createButton("Añadir",75,hboxFunctions, null);
    }

    @FXML
    protected void onActionReestablecer(){
        updateList();
        lblMeaning.setText("");
        letterGrid.getChildren().clear();
        placeLetters();
    }

    @FXML
    protected void onActionSalir(){
        Dictionary.getInstance().saveDictionary();

        ((Stage) letterGrid.getScene().getWindow()).close();

        Stage stage = new Stage();
        LoginApplication app = new LoginApplication();
        try {
            app.start(stage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
