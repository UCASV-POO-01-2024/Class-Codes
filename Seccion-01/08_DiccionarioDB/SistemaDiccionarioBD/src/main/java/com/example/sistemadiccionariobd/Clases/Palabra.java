package com.example.sistemadiccionariobd.Clases;

public class Palabra {
    private int id;
    private String palabra;
    private String definicion;
    private TipoPalabra tipo;

    public Palabra(int id, String palabra, String definicion, TipoPalabra tipo) {
        this.id = id;
        this.palabra = palabra;
        this.definicion = definicion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public TipoPalabra getTipo() {
        return tipo;
    }

    public void setTipo(TipoPalabra tipo) {
        this.tipo = tipo;
    }
}
