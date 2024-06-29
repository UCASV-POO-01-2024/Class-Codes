package com.example.sistemadiccionariobd;

import com.example.sistemadiccionariobd.Clases.Palabra;
import com.example.sistemadiccionariobd.Clases.TipoPalabra;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ResourceBundle;

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

    @FXML
    private ComboBox<TipoPalabra> tipoPalabra;

    @FXML
    private Label lblErrorTipoPalabra;

    private TreeMap<String, TreeMap<String, Palabra>> diccionario;
    private ArrayList<TipoPalabra> tiposDePalabra;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        diccionario = new TreeMap<>();
        //tiposDePalabra = new ArrayList<>();
        tipoPalabra.getItems().clear();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbTipoPalabra");
            while (rs.next()) {
                TipoPalabra tipo = new TipoPalabra(rs.getInt("id"), rs.getString("tipo"));
                tipoPalabra.getItems().add(tipo);

                //tiposDePalabra.add(tipo);
                //System.out.println(tipo.getId()+"\t"+tipo.getTipo());
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }


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
    private void agregarPalabraDiccionario(String palabra, String definicion, TipoPalabra tipoPalabra) {
        String primerCaracter = obtenerPrimerCaracter(palabra);

        if (diccionario.get(primerCaracter) == null) {
            diccionario.put(primerCaracter, new TreeMap<>());
        }

        TreeMap diccionarioLetra = diccionario.get(primerCaracter);
        diccionarioLetra.put(palabra,
                new Palabra(0, palabra, definicion, tipoPalabra)
        );

        txtPalabra.setText("");
        txtDefinicion.setText("");
    }

    private void eliminarPalabraDiccionario(String palabra) {

        //Tarea: Eliminar de la base de datos luego de eliminar del diccionario
        String primerCaracter = obtenerPrimerCaracter(palabra);
        TreeMap diccionarioLetra = diccionario.get(primerCaracter);

        if (diccionarioLetra != null) {
            diccionarioLetra.remove(palabra);
            if (diccionarioLetra.keySet().size() == 0) {
                diccionario.remove(primerCaracter);
            }
        }
    }

    private void imprimirListadoPalabras() {
        layoutListadoPalabras.getChildren().setAll(new ArrayList<Node>());

        for (String keyLetras : diccionario.keySet()) {

            Label letraDiccionario = new Label(keyLetras);
            letraDiccionario.setStyle("-fx-font-weight: bold; -fx-font-size: 18px;");
            layoutListadoPalabras.getChildren().add(letraDiccionario);

            for (String keyPalabra : diccionario.get(keyLetras).keySet()) {

                Label palabraDiccionario = new Label(
                        keyPalabra
                                + " ("+diccionario.get(keyLetras).get(keyPalabra).getTipo().getTipo()+")"
                                + ": " + diccionario.get(keyLetras).get(keyPalabra).getDefinicion()
                );
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
        lblErrorTipoPalabra.setText("");

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

        if (tipoPalabra.getValue() == null) {
            lblErrorTipoPalabra.setText("Este campo es obligatorio");
            errorFlag = true;
        }

        if (!errorFlag) {
            agregarPalabraDiccionario(
                    palabra,
                    definicion,
                    tipoPalabra.getValue()
            );
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

        for (String keyLetras : diccionario.keySet()) {
            for (String keyPalabra : diccionario.get(keyLetras).keySet()) {
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario", "pooadmin", "pooadmin");

                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("select count(id) as total from tbPalabra where palabra = '"+keyPalabra+"';");

                    if(rs.next()){
                        int result;
                        if(rs.getInt("total") > 0){
                            PreparedStatement pst = conn.prepareStatement("UPDATE tbPalabra SET definicion=?, id_tipo=? WHERE palabra=?");
                            pst.setString(1, diccionario.get(keyLetras).get(keyPalabra).getDefinicion());
                            pst.setInt(2, diccionario.get(keyLetras).get(keyPalabra).getTipo().getId());
                            pst.setString(3, keyPalabra);
                            result = pst.executeUpdate();
                        }else{
                            PreparedStatement pst = conn.prepareStatement("INSERT INTO tbPalabra(palabra, definicion, id_tipo) VALUES(?,?,?)");
                            pst.setString(1, keyPalabra);
                            pst.setString(2, diccionario.get(keyLetras).get(keyPalabra).getDefinicion());
                            pst.setInt(3, diccionario.get(keyLetras).get(keyPalabra).getTipo().getId());
                            result = pst.executeUpdate();
                        }
                        System.out.println(result > 0 ? "Exito" : "Fracaso");
                    }

                    conn.close();

                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }

    @FXML
    protected void cargarPalabras() {
        borrarListado();
        try {
            //File archivoPalabras = new File(rutaArchivoDatos);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDiccionario",
                    "pooadmin",
                    "pooadmin"
            );

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select tp.id as idPalabra, tp.palabra as palabra, tp.definicion as definicion, tt.id as idTipo, tt.tipo as tipoPalabra from tbPalabra as tp inner join tbTipoPalabra as tt on tp.id_tipo = tt.id");


            diccionario = new TreeMap<>();
            //Scanner lector = new Scanner(archivoPalabras);

            while (rs.next()) {
                TipoPalabra tipo = new TipoPalabra(
                        rs.getInt("idTipo"),
                        rs.getString("tipoPalabra")
                );
                Palabra palabra = new Palabra(
                        rs.getInt("idPalabra"),
                        rs.getString("palabra"),
                        rs.getString("definicion"),
                        tipo
                );
                agregarPalabraDiccionario(palabra.getPalabra(), palabra.getDefinicion(),tipo);
            }

            imprimirListadoPalabras();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}