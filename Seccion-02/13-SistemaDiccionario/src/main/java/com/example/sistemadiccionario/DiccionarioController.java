package com.example.sistemadiccionario;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class DiccionarioController implements Initializable {
    private final String rutaArchivoDatos = "./listadoPalabras.txt";

    @FXML
    private TextField txtPalabra;

    @FXML
    private TextArea txtDefinicion;

    @FXML
    private Label lblErrorPalabra;

    @FXML
    private Label lblErrorDescripcion;

    @FXML
    private VBox layoutListadoPalabras;

    private TreeMap<String, TreeMap<String, String>> diccionario;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        diccionario = new TreeMap<>();
    }

    private String obtenerPrimerCaracter(String palabra) {
        String primerCaracter = (palabra.charAt(0) + "").toUpperCase();

        //Tarea: Hacer modificar este paso utilizando diccionarios para cambiar las letras con acento.
        primerCaracter = primerCaracter.replace("Á", "A");
        primerCaracter = primerCaracter.replace("É", "E");
        primerCaracter = primerCaracter.replace("Í", "I");
        primerCaracter = primerCaracter.replace("Ó", "O");
        primerCaracter = primerCaracter.replace("Ú", "U");

        return primerCaracter;
    }

    //Agregué un método auxiliar para obtener el primer caracter
    private void agregarPalabraDiccionario(String palabra, String definicion){
        String primerCaracter = obtenerPrimerCaracter(palabra);

        if (diccionario.get(primerCaracter) == null) {
            diccionario.put(primerCaracter, new TreeMap<>());
        }

        TreeMap diccionarioLetra = diccionario.get(primerCaracter);
        diccionarioLetra.put(palabra, definicion);

        txtPalabra.setText("");
        txtDefinicion.setText("");
    }

    private void eliminarPalabraDiccionario(String palabra) {
        String primerCaracter = obtenerPrimerCaracter(palabra);
        TreeMap diccionarioLetra = diccionario.get(primerCaracter);

        if(diccionarioLetra != null){
            diccionarioLetra.remove(palabra);
            if(diccionarioLetra.keySet().size() == 0){
                diccionario.remove(primerCaracter);
            }
        }
    }

    private void imprimirListadoPalabras(){
        layoutListadoPalabras.getChildren().setAll(new ArrayList<Node>());

        for (String keyLetras : diccionario.keySet()) {

            Label letraDiccionario = new Label(keyLetras);
            letraDiccionario.setStyle("-fx-font-weight: bold; -fx-font-size: 18px;");
            layoutListadoPalabras.getChildren().add(letraDiccionario);

            for (String keyPalabra : diccionario.get(keyLetras).keySet()) {

                Label palabraDiccionario = new Label(keyPalabra + ": " + diccionario.get(keyLetras).get(keyPalabra));
                layoutListadoPalabras.getChildren().add(palabraDiccionario);

            }
        }
    }

    @FXML
    protected void borrarListado() {
        diccionario = new TreeMap<>();
        layoutListadoPalabras.getChildren().setAll(new ArrayList<Node>());
    }

    @FXML
    protected void agregarPalabra() {
        lblErrorPalabra.setText("");
        lblErrorDescripcion.setText("");

        layoutListadoPalabras.getChildren().setAll(new ArrayList<Node>());

        String palabra = txtPalabra.getText();
        String definicion = txtDefinicion.getText();
        boolean errorFlag = false;

        if (palabra.equals("")) {
            lblErrorPalabra.setText("Este campo es obligatorio");
            errorFlag = true;
        }

        if (definicion.equals("")) {
            lblErrorDescripcion.setText("Este campo es obligatorio");
            errorFlag = true;
        }

        if (!errorFlag) {
            agregarPalabraDiccionario(palabra, definicion);
            imprimirListadoPalabras();
        }
    }

    @FXML
    protected void eliminarPalabra() {
        lblErrorPalabra.setText("");

        String palabra = txtPalabra.getText();
        boolean errorFlag = false;

        if (palabra.equals("")) {
            lblErrorPalabra.setText("Este campo es obligatorio");
            errorFlag = true;
        }

        if (!errorFlag) {
            eliminarPalabraDiccionario(palabra);
            imprimirListadoPalabras();
        }
    }

    @FXML
    protected void persistirPalabras() {

        try {
            File archivoPalabras = new File(rutaArchivoDatos);

            if(!archivoPalabras.createNewFile()){
                archivoPalabras.delete();
                archivoPalabras.createNewFile();
            }

            FileWriter escritor = new FileWriter(rutaArchivoDatos);

            for (String keyLetras : diccionario.keySet()) {
                for (String keyPalabra : diccionario.get(keyLetras).keySet()) {
                    escritor.write(keyPalabra+"\n");
                    escritor.write(diccionario.get(keyLetras).get(keyPalabra)+"\n");
                }
            }

            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }

    @FXML
    protected void cargarPalabras() {
        borrarListado();
        try {
            File archivoPalabras = new File(rutaArchivoDatos);

            diccionario = new TreeMap<>();
            Scanner lector = new Scanner(archivoPalabras);

            while (lector.hasNextLine()){
                String palabra = lector.nextLine();
                String definicion = lector.nextLine();
                agregarPalabraDiccionario(palabra, definicion);
            }

            imprimirListadoPalabras();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}